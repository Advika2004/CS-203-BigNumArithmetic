import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathOpsTests {

    @Test
    public void testadd1() {
        LinkedList expected = LinkedList.makeList("10");
        LinkedList list1 = LinkedList.makeList("5");
        LinkedList list2 = LinkedList.makeList("5");
        LinkedList actual = MathOps.add(list1, list2);
//        actual.print();
        assertEquals(expected, actual);
    }

    @Test
    public void testadd2() {
        LinkedList expected = LinkedList.makeList("12");
        LinkedList list1 = LinkedList.makeList("6");
        LinkedList list2 = LinkedList.makeList("6");
        LinkedList actual = MathOps.add(list1, list2);
//        actual.print();
        assertEquals(expected, actual);
    }

    @Test
    public void testadd3() {
        LinkedList expected = LinkedList.makeList("480");
        LinkedList list1 = LinkedList.makeList("30");
        LinkedList list2 = LinkedList.makeList("450");
        LinkedList actual = MathOps.add(list1, list2);
//        System.out.println("Expected:");
//        expected.print();
//        System.out.println("Actual:");
//        actual.print();
        assertEquals(expected, actual);
    }

    @Test
    public void testadd4() {
        LinkedList expected = LinkedList.makeList("26");
        LinkedList list1 = LinkedList.makeList("7");
        LinkedList list2 = LinkedList.makeList("19");
        LinkedList actual = MathOps.add(list1, list2);
//        actual.print();
        assertEquals(expected, actual);
    }

    @Test
    public void testadd5() {
        LinkedList expected = LinkedList.makeList("4400");
        LinkedList list1 = LinkedList.makeList("1275");
        LinkedList list2 = LinkedList.makeList("3125");
        LinkedList actual = MathOps.add(list1, list2);
//        actual.print();
        assertEquals(expected, actual);
    }

    @Test
    public void testadd6() {
        LinkedList expected = LinkedList.makeList("246913578");
        LinkedList list1 = LinkedList.makeList("123456789");
        LinkedList list2 = LinkedList.makeList("123456789");
        LinkedList actual = MathOps.add(list1, list2);
//        actual.print();
        assertEquals(expected, actual);
    }

    @Test
    public void testadd7() {
        LinkedList expected = LinkedList.makeList("44000");
        LinkedList list1 = LinkedList.makeList("4000");
        LinkedList list2 = LinkedList.makeList("40000");
        LinkedList actual = MathOps.add(list1, list2);
//        actual.print();
        assertEquals(expected, actual);
    }

    @Test
    public void testadd8() {
        LinkedList expected = LinkedList.makeList("2222222211");
        LinkedList list1 = LinkedList.makeList("987654321");
        LinkedList list2 = LinkedList.makeList("1234567890");
        LinkedList actual = MathOps.add(list1, list2);
//        actual.print();
        assertEquals(expected, actual);
    }

    @Test
    public void testmultiplyListWDigit1() {
        LinkedList expected = LinkedList.makeList("36");
        LinkedList list1 = LinkedList.makeList("12");
        int digit = 3;
        LinkedList actual = MathOps.multiplyListWDigit(list1, digit);
//        actual.print();
        assertEquals(expected, actual);
    }

    @Test
    public void testmultiplyListWDigit2() {
        LinkedList expected = LinkedList.makeList("1404");
        LinkedList list1 = LinkedList.makeList("156");
        int digit = 9;
        LinkedList actual = MathOps.multiplyListWDigit(list1, digit);
//        actual.print();
        assertEquals(expected, actual);
    }

    @Test
    public void testmultiplyListWDigit3() {
        LinkedList expected = LinkedList.makeList("703701");
        LinkedList list1 = LinkedList.makeList("234567");
        int digit = 3;
        LinkedList actual = MathOps.multiplyListWDigit(list1, digit);
//        actual.print();
        assertEquals(expected, actual);
    }

    @Test
    public void testmultiplyListWDigit4() {
        LinkedList expected = LinkedList.makeList("493827156");
        LinkedList list1 = LinkedList.makeList("123456789");
        int digit = 4;
        LinkedList actual = MathOps.multiplyListWDigit(list1, digit);
//        actual.print();
        assertEquals(expected, actual);
    }

    @Test
    public void testmultiply2LinkedLists1() {
        LinkedList expected = LinkedList.makeList("165");
        LinkedList list1 = LinkedList.makeList("11");
        LinkedList list2 = LinkedList.makeList("15");
        LinkedList actual = MathOps.multiply2LinkedLists(list1, list2);
//        actual.print();
        assertEquals(expected, actual);

    }

    @Test
    public void testmultiply2LinkedLists2() {
        LinkedList expected = LinkedList.makeList("44000");
        LinkedList list1 = LinkedList.makeList("500");
        LinkedList list2 = LinkedList.makeList("88");
        LinkedList actual = MathOps.multiply2LinkedLists(list1, list2);
//        actual.print();
        assertEquals(expected, actual);
    }

    @Test
    public void testmultiply2LinkedLists3() {
        LinkedList expected = LinkedList.makeList("5639060205");
        LinkedList list1 = LinkedList.makeList("456789");
        LinkedList list2 = LinkedList.makeList("12345");
        LinkedList actual = MathOps.multiply2LinkedLists(list1, list2);
//        actual.print();
        assertEquals(expected, actual);
    }

    @Test
    public void testmultiply2LinkedLists4() {
        LinkedList expected = LinkedList.makeList("13592604925913506171605");
        LinkedList list1 = LinkedList.makeList("122333444455555");
        LinkedList list2 = LinkedList.makeList("111111111");
        LinkedList actual = MathOps.multiply2LinkedLists(list1, list2);
//        actual.print();
        assertEquals(expected, actual);
    }

    @Test
    public void testmultiply2LinkedLists5() {
        LinkedList expected = LinkedList.makeList("100000000000000000000");
        LinkedList list1 = LinkedList.makeList("10000000000");
        LinkedList list2 = LinkedList.makeList("10000000000");
        LinkedList actual = MathOps.multiply2LinkedLists(list1, list2);
//        actual.print();
        assertEquals(expected, actual);
    }
    @Test
    public void testexponentiate1() {
        LinkedList expected = LinkedList.makeList("256");
        LinkedList list1 = LinkedList.makeList("4");
        LinkedList list2 = LinkedList.makeList("4");
        LinkedList actual = MathOps.exponentiate(list1, list2);
//        actual.print();
        assertEquals(expected, actual);
    }


    @Test
    public void testexponentiate2() {
        LinkedList expected = LinkedList.makeList("4294967296");
        LinkedList list1 = LinkedList.makeList("16");
        LinkedList list2 = LinkedList.makeList("8");
        LinkedList actual = MathOps.exponentiate(list1, list2);
//        actual.print();
        assertEquals(expected, actual);
    }

    @Test
    public void testexponentiate3() {
        LinkedList expected = LinkedList.makeList("1000000000");
        LinkedList list1 = LinkedList.makeList("10");
        LinkedList list2 = LinkedList.makeList("9");
        LinkedList actual = MathOps.exponentiate(list1, list2);
//        actual.print();
        assertEquals(expected, actual);
    }

    @Test
    public void testexponentiate4() {
        LinkedList expected = LinkedList.makeList("1024");
        LinkedList list1 = LinkedList.makeList("2");
        LinkedList list2 = LinkedList.makeList("10");
        LinkedList actual = MathOps.exponentiate(list1, list2);
//        actual.print();
        assertEquals(expected, actual);
    }

    @Test
    public void testexponentiate5() {
        LinkedList expected = LinkedList.makeList("10000000000");
        LinkedList list1 = LinkedList.makeList("10");
        LinkedList list2 = LinkedList.makeList("10");
        LinkedList actual = MathOps.exponentiate(list1, list2);
//        actual.print();
        assertEquals(expected, actual);
    }

    @Test
    public void testexponentiate6() {
        LinkedList expected = LinkedList.makeList("215671155821681003462656");
        LinkedList list1 = LinkedList.makeList("88");
        LinkedList list2 = LinkedList.makeList("12");
        LinkedList actual = MathOps.exponentiate(list1, list2);
//        actual.print();
        assertEquals(expected, actual);
    }
}
