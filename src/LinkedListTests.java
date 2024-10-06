import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class LinkedListTests {

    @Test
    public void testInsert1() {
        LinkedList lista = new LinkedList();
        lista.insert(1);
        lista.insert(2);

        LinkedList listb = new LinkedList();
        listb.insert(1);
        listb.insert(2);
        assertEquals(lista,listb);
    }

    @Test
    public void testInsert2() {
        LinkedList lista = new LinkedList();
        lista.insert(39596);
        lista.insert(2330);

        LinkedList listb = new LinkedList();
        listb.insert(39596);
        listb.insert(2330);
        assertEquals(lista,listb);
    }

    @Test
    public void testmakeList1() {
        LinkedList expected = new LinkedList();
        expected.insert(1);
        expected.insert(2);
        expected.insert(3);
        expected.insert(4);
        expected.insert(5);
        LinkedList actual = LinkedList.makeList("12345");
        assertEquals(expected,actual);
    }
    @Test
    public void testmakeList2() {
        LinkedList expected = new LinkedList();
        expected.insert(3);
        expected.insert(4);
        expected.insert(5);
        LinkedList actual = LinkedList.makeList("345");
        assertEquals(expected,actual);
    }

    @Test
    public void list2Num() {
        LinkedList expected = LinkedList.makeList("10");
        int expected1 = LinkedList.list2Num(expected);
        int actual = 10;
        assertEquals(expected1,actual);
    }

    @Test
    public void list2String() {
        LinkedList expected = LinkedList.makeList("123");
        String expected1 = LinkedList.list2String(expected);
        String actual = "321";
        assertEquals(expected1,actual);
    }

    @Test
    public void append() {
        LinkedList lista = new LinkedList();
        lista.append(3);
        lista.append(2);

        LinkedList listb = LinkedList.makeList("23");
        assertEquals(lista, listb);
    }


}
