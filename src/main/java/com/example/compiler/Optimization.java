package com.example.compiler;
import java.util.List;

public class Optimization {
    public List<String> optimizeTAC(List<String> tac) {

        tac = foldConstants(tac);
        tac = removeRedundantVariables(tac);
        return tac;
    }

    public  List<String> foldConstants(List<String> tac) {
        int count = 0;
        for (String line: tac) {
            if (line.contains("*") && line.matches(".*\\d+\\s*\\*\\s*\\d+.*")) {
                String[] parts = line.split("=");
                String expression = parts[1].trim();
                String exp = expression.substring(0, expression.length() - 1);
                String[] numbers = exp.split("\\*");
                int result = Integer.parseInt(numbers[0].trim()) * Integer.parseInt(numbers[1].trim());
                tac.set(count, parts[0].trim() + " = " + result + ";");
                updateTac(tac, parts[0].trim(), result);
            } else if (line.contains("+") && line.matches(".*\\d+\\s*\\+\\s*\\d+.*")) {
                String[] parts = line.split("=");
                String expression = parts[1].trim();
                String exp = expression.substring(0, expression.length() - 1);
                String[] numbers = exp.split("\\+");
                int result = Integer.parseInt(numbers[0].trim()) + Integer.parseInt(numbers[1].trim());
                tac.set(count, parts[0].trim() + " = " + result + ";");
                updateTac(tac, parts[0].trim(), result);

            }
            count++;
        }
        return tac;
    }

    public void updateTac(List<String> tac,String part,int result){
        int count2=0;
        for (String line : tac) {
            if (line.contains(part)) {
                line = line.replace(part, String.valueOf(result));
                tac.set(count2, line);
            }
            count2++;
        }
    }

    public List<String> removeRedundantVariables(List<String> tac) {
        tac.removeIf(line -> line.matches("\\s*\\w+\\s*=\\s*\\w+\\s*;"));
        return tac;
    }
}
