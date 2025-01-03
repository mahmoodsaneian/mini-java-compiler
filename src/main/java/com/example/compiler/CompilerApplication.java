package com.example.compiler;

import gen.com.example.compiler.MiniJavaGrammarLexer;
import gen.com.example.compiler.MiniJavaGrammarParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CompilerApplication {

	public static void main(String[] args) {
		String testInput = """           
				class Main {
				    public static void main(String[] args) {
				    	{
				    		System.out.println(52);				        					        	
				    	}					    			    				  				        
				    }				    				    				 
				}
				
				class Example {				   
					int a;
				    int b;				    					    
				    public int getX() {
				    	a = 5;
				    	b = 5;
				        System.out.println(a + b);
				        return a;
				    }
				    
				    public void setX(int a, int b) {
				    	a = b;
				    	b = a;
				    	return;				    
				    }
				    
				    public void mul(){
				    	System.out.println(a*b);
				    	return;
				    }
				    
				    public void div(){
				    	System.out.println(a/b);
				    	return;
				    }				    				    				   
				}
				
				class Example2 {
					Example example;														
					
					public void Example2{
						example = new Example( );
						return;
					}			
				}				
            """;
		// convert input to a stream of characters
		CharStream input = CharStreams.fromString(testInput);
		// create lexer from stream of characters
		MiniJavaGrammarLexer lexer = new MiniJavaGrammarLexer(input);
		// create stream of tokens
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		// create parser from stream of tokens
		MiniJavaGrammarParser parser = new MiniJavaGrammarParser(tokenStream);

		// generate parse tree
		ParseTree parseTree = parser.program();
		MiniJavaSemanticAnalyzer analyzer = new MiniJavaSemanticAnalyzer();
		analyzer.visit(parseTree);

		MiniJavaTACGenerator generator = new MiniJavaTACGenerator();
		generator.visit(parseTree);
		generator.writeTAC();
	}

}
