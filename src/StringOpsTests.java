import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringOpsTests {
    @Test
    public void testReverse() {
        String str = "Hello";
        String output = "olleH";
        assertEquals(output, StringOps.reverse(str));
    }

    @Test
    public void testReverse2() {
        String str = "12345";
        String output = "54321";
        assertEquals(output, StringOps.reverse(str));
    }
}

