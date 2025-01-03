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
				    	System.out.println( 4 + (2 * 5));				        					        					    						    			    				  				        
				    }				    				    				 
				}
				/*
				class Calculator {
					boolean usage;
									   									    					    
				    public int add(int a, int b) {	
				    	usage = false;			    	
				        System.out.println(a + b);					        				        			        
				        return a + b;
				    }
				    
				    public int sub(int a, int b) {
				    	System.out.println(a - b);				    
				    	return a - b;				    
				    }
				    
				    public int mul(int a, int b) {
				    	System.out.println(a*b);				    	
				    	return a * b;
				    }
				    
				    public int div(int a, int b) {
				    	System.out.println(a/b);				    	
				    	return a / b;
				    }
				    
				    public void test(){
				    	while(1) {
				    		System.out.println(2 + 2);				    	
				    	}
				    	return;
				    }		    				    				   
				}
				
				class CallCalculator {
					Calculator calculator;														
					int add;
					int sub;
					int mul;
					int div;
					public CallCalculator () {
						calculator = new Calculator();												
					}
					
					public void calculate(){
						sub = calculator.sub(3, 4);
						if (10 < 20) { add = calculator.add(1, 2); }
						else { add = 4; }																		
						mul = calculator.mul(5, 6);
						div = calculator.div(7, 8);
						return;
					}			
				} 
										
				class Test{
					int[] array;
					
					public Test() {
						array = new int[10];
						array[0] = 1;
						System.out.println(array[0]);
					} 
				}	*/	
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
