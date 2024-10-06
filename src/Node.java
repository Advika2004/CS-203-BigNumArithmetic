public class Node {
    private int digit;
    private Node next;


    public Node(int digit)
    {
        this.digit = digit;
    }

    public int getDigit()
    {
        return digit;
    }
    public Node getNext()
    {
         return next;
    }

    public void setNext(Node nextNode)
    {
        this.next = nextNode;
    }
}
