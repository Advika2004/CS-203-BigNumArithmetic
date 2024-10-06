import java.beans.Expression;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class LinkedList {
    private Node head;
    private int length;

    public LinkedList() {
        head = null;
        length = 0;
    }

//acts as a push and adds to the front
    public void insert(int digit) {
        Node newNode = new Node(digit);
        newNode.setNext(head);
        head = newNode;
        length++;
    }

    //takes a list and makes it a number (int)
    public static int list2Num(LinkedList list) {
        String theNum = "";
        Node start1 = list.getHeadNode();
        while(start1 != null) {
            theNum += start1.getDigit();
            start1 = start1.getNext(); // This line was missing the assignment to start1
        }
        return StringOps.stringToInt(theNum);
    }

    //takes a list and makes it a string
    public static String list2String(LinkedList list) {
        String theNum = "";
        Node start1 = list.getHeadNode();
        while(start1 != null) {
            theNum += start1.getDigit();
            start1 = start1.getNext(); // This line was missing the assignment to start1
        }
        return theNum;
    }

    //adds stuff to the end of a list
    public void append(int digit) {
        Node newNode = new Node(digit);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        length++;
    }

//creates a list when given a string of numbers
    public static LinkedList makeList(String str) {
        LinkedList newList = new LinkedList();
        for (int i = 0; i < str.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(str.charAt(i)));
            newList.insert(digit);
        }
        return newList;
    }

    public int getLength() {
        return length;
    }

    public Node getHeadNode() {
        return head;
    }

    //prints out the linked list with arrows to help debugging
    public void print() {
        Node currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.getDigit() + " -> ");
            currentNode = currentNode.getNext();
        }

        System.out.println("null");
    }

    //re-writing the equals method to check every node
        public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof LinkedList)) {
            return false;
        }

        LinkedList list2 = (LinkedList) obj;
        Node node1 = this.head;
        Node node2 = list2.head;

        while (node1 != null && node2 != null) {
            if (node1.getDigit() != node2.getDigit()) {
                return false;
            }

            node1 = node1.getNext();
            node2 = node2.getNext();
        }

        // After the loop ends, if any list still has elements, they are not equal
        if (node1 != null || node2 != null) {
            return false;
        }

        return true;
    }
}

