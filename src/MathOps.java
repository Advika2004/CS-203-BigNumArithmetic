public class MathOps {

    //adds two linked lists together
    public static LinkedList add(LinkedList list1, LinkedList list2) {

        //make sure that both the numbers are the same length so that adding is easier
        if (list1.getLength() != list2.getLength()) {
            while (list1.getLength() > list2.getLength()) {
                list2.append(0);
            }

            while (list2.getLength() > list1.getLength()) {
                list1.append(0);
            }
        }

        Node start1 = list1.getHeadNode();
        Node start2 = list2.getHeadNode();
        int carryover = 0;
        int sum = 0;
        LinkedList answer = new LinkedList();

        //while the two nodes are not null, add them together.
        while (start1 != null && start2 != null) {
            sum = start1.getDigit() + start2.getDigit() + carryover;
            carryover = sum / 10; //finds the tens place if there is any carryover
            answer.append(sum % 10); //adds the ones place digit to list

            start1 = start1.getNext(); //moves onto next node at both lists
            start2 = start2.getNext();
        }

        //for if both the lists have reached their end and there is still a carryover value
        if (carryover != 0) {
            answer.append(carryover);
            carryover = 0;
        }

        return answer;
    }

    public static LinkedList multiplyListWDigit(LinkedList list1, int digit) {
        LinkedList sumList = new LinkedList();
        Node start1 = list1.getHeadNode();
        int carryover = 0;
        int digitToAdd = 0; //the number we need to add to the list

        while (start1 != null) {
            int sum = carryover + start1.getDigit() * digit;
            digitToAdd = sum % 10;
            carryover = sum / 10;

            sumList.append(digitToAdd);
            start1 = start1.getNext();
        }

        if (carryover != 0) {
            sumList.append(carryover);
        }

        return sumList;
    }

    public static LinkedList multiply2LinkedLists(LinkedList list1, LinkedList list2) {
        LinkedList finalAnswer = new LinkedList();

        Node start2 = list2.getHeadNode();
        int zerosToAddCount = 0; //Keeps track of how many zeros need to be added to adjust the place

        while (start2 != null) {
            int currentDigit = start2.getDigit();
//            System.out.println("Current digit from list2: " + currentDigit);
            LinkedList currentProduct = multiplyListWDigit(list1, currentDigit);
//            System.out.print("Result after multiplying list1 with current digit: ");
//            currentProduct.print();

            for (int i = 0; i < zerosToAddCount; i++) {
                currentProduct.insert(0);
            }
//            System.out.print("After adding zeros: ");
//            currentProduct.print();

            finalAnswer = add(currentProduct, finalAnswer); //keep adding the current product to the final answer.
//            System.out.print("Cumulative result after adding current product: ");
//            finalAnswer.print();

            start2 = start2.getNext();
            zerosToAddCount++;
//            System.out.println("Zeros added count: " + zerosToAddCount);
        }
        return finalAnswer;
    }


    public static LinkedList exponentiate(LinkedList baseNum, LinkedList exponent) {
        int theExponent = LinkedList.list2Num(exponent);

        int actualExponent = 0;

        //if it is zero, return 1
        if (theExponent == 0) {
            return LinkedList.makeList("1");
        }

        //check if the exponent is one
        if (theExponent == 1) {
            return baseNum;
        }

        //check if the exponent is even, and then follow the even formula
        // (x^2) ^ (n/2)
        if (theExponent % 2 == 0) {
            LinkedList squaredBase = (multiply2LinkedLists(baseNum, baseNum));
            return exponentiate(squaredBase, LinkedList.makeList(String.valueOf(theExponent / 2)));
        }
        //follow the odd formula if its odd
        else if (theExponent % 2 != 0) {

            LinkedList squaredBase = multiply2LinkedLists(baseNum, baseNum);
            actualExponent = (theExponent - 1) / 2;
            LinkedList leftOverExp = exponentiate(squaredBase, LinkedList.makeList(String.valueOf(actualExponent)));
            return multiply2LinkedLists(baseNum, leftOverExp);
        }
        return null;
    }
}

