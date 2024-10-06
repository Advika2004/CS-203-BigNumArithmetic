import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertSame;

//makes sure that the lines are getting processed into valid expressions.
public class ExpressionTests {

    @Test
    public void testProcessLine1()
    {
        Expression expected = new Expression("12", "+", "20");
        Expression actual = Expression.processLine("00000012        +          020");
        assertEquals(expected, actual);
    }

    @Test
    public void testProcessLine2()
    {
        Expression expected = new Expression(null, null, null);
        Expression actual = Expression.processLine("abcd        +          20");
        assertEquals(expected, actual);
    }

    @Test
    public void testProcessLine3()
    {
        Expression expected = new Expression(null, null, null);
        Expression actual = Expression.processLine("560 000t0v        +          2");
        assertEquals(expected, actual);
    }

    @Test
    public void testProcessLine4()
    {
        Expression expected = new Expression("796979697", "^", "4");
        Expression actual = Expression.processLine("796979697 ^      004");
        assertEquals(expected, actual);
    }

    @Test
    public void testProcessLine5()
    {
        Expression expected = new Expression("50", "*", "2");
        Expression actual = Expression.processLine("50 *                             02");
        assertEquals(expected, actual);
    }

}
