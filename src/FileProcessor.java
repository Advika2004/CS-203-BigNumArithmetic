import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileProcessor {


    /**
     * Processes arithmetic expressions line-by-line in the given file.
     *
     * @param filePath Path to a file containing arithmetic expressions.
     */

    public static String processFile(String filePath) {
        File infile = new File(filePath);
        StringBuilder results = new StringBuilder();
        try (Scanner scan = new Scanner(infile)) {
            while (scan.hasNext()) {
                String line = scan.nextLine();
                // Process the line and get the expression
                Expression the_problem = Expression.processLine(line);
                if (the_problem == null) {
                    continue;  // skip empty lines
                }
                LinkedList list1 = LinkedList.makeList(the_problem.getNum1());
                LinkedList list2 = LinkedList.makeList(the_problem.getNum2());

                String resultLine = null;
                if (the_problem.getOperator().equals("+")) {
                    LinkedList answer = MathOps.add(list1, list2);
                    resultLine = StringOps.processAnswerPlus(list1, list2, answer);
                } else if (the_problem.getOperator().equals("*")) {
                    LinkedList answer = MathOps.multiply2LinkedLists(list1, list2);
                    resultLine = StringOps.processAnswerMult(list1, list2, answer);
                } else if (the_problem.getOperator().equals("^")) {
                    LinkedList answer = MathOps.exponentiate(list1, list2);
                    resultLine = StringOps.processAnswerExp(list1, list2, answer);
                }

                // Assuming processAnswer methods already format the string correctly,
                // but ensure to remove any leading zeros
                if (resultLine != null) {
                    results.append(resultLine.replaceFirst("^0+", "")).append("\n");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + infile.getPath());
        }

        String finalResults = results.toString().trim(); // Trim to remove last newline
        System.out.println(finalResults);
        return finalResults;
    }
}




