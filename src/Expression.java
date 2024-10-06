
public class Expression {

    private String num1;
    private String operator;
    private String num2;

    public Expression(String num1, String operator, String num2) {
        this.num1 = num1;
        this.operator = operator;
        this.num2 = num2;
    }

    public String getNum1() {
        return num1;
    }

    public String getOperator() {
        return operator;
    }

    public String getNum2() {
        return num2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Expression)) {
            return false;
        }

        Expression exp = (Expression) obj;

        // Compare num1
        if (num1 != null) {
            if (!num1.equals(exp.num1)) {
                return false;
            }
        } else {
            if (exp.num1 != null) {
                return false;
            }
        }

        // Compare operator
        if (operator != null) {
            if (!operator.equals(exp.operator)) {
                return false;
            }
        } else {
            if (exp.operator != null) {
                return false;
            }
        }

        // Compare num2
        if (num2 != null) {
            if (!num2.equals(exp.num2)) {
                return false;
            }
        } else {
            if (exp.num2 != null) {
                return false;
            }
        }

        return true;
    }


        //checks that the operator given is one of the ones we want
    public static boolean isOperator(String string) {
        if (string.equals("+") || string.equals("*") || string.equals("^")) {
            return true;
        } else {
            return false;
        }
    }

    //checks that the string provided is made of numbers
    public static boolean isNums(String string) {
        return (string.matches("\\d+")) ;

    }

    //function that will process the line coming in and identify the 3 parts, the two numbers and the operand.
    public static Expression processLine(String line) {

        if (line.trim().isEmpty()){
            return null;
        }

        String[] newLine = line.split("\\s+");
        if (newLine.length == 3 && isNums(newLine[0]) && isOperator(newLine[1]) && isNums(newLine[2])) {
            newLine[0] = removeLeadingZeros(newLine[0]);
            newLine[1] = removeLeadingZeros(newLine[1]);
            newLine[2] = removeLeadingZeros(newLine[2]);
            Expression NewExp = new Expression(newLine[0], newLine[1], newLine[2]);
            return NewExp;
        } else {
            System.out.println("This expression is invalid, moving onto next line");
            return new Expression(null, null, null);
        }
    }

//will take out the zeros before the number
    public static String removeLeadingZeros(String str) {
        return str.replaceFirst("^0+", "");
    }

}


