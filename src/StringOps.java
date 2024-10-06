public class StringOps {


    //reverses a string
    public static String reverse(String str)
    {
        String newStr = "";
        for (int i = str.length()-1; i>=0; i--)
        {
            newStr += str.charAt(i);
        }
        return newStr;
    }
    //makes a string into an int
    public static int stringToInt(String str){
        str = reverse(str);
        return Integer.parseInt(str);
    }

    //processes the answer if its adding
    public static String processAnswerPlus(LinkedList input1, LinkedList input2, LinkedList answer){
        String part1 = reverse(LinkedList.list2String(input1));
        String part2 = reverse(LinkedList.list2String(input2));
        String part3 = reverse(LinkedList.list2String(answer));
        return (part1 + " " + "+" + " " + part2 + " " + "=" + " " + part3);
    }

    //processes the answer if its multiplying
    public static String processAnswerMult(LinkedList input1, LinkedList input2, LinkedList answer){
        String part1 = reverse(LinkedList.list2String(input1));
        String part2 = reverse(LinkedList.list2String(input2));
        String part3 = reverse(LinkedList.list2String(answer));
        return (part1 + " " + "*" + " " + part2 + " " + "=" + " " + part3);
    }

    //processes the answer if its exponentiation
    public static String processAnswerExp(LinkedList input1, LinkedList input2, LinkedList answer){
        String part1 = reverse(LinkedList.list2String(input1));
        String part2 = reverse(LinkedList.list2String(input2));
        String part3 = reverse(LinkedList.list2String(answer));
        return (part1 + " " + "^" + " " + part2 + " " + "=" + " " + part3);
    }

}
