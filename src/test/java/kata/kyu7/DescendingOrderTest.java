package kata.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DescendingOrderTest {
    @Test
    public void test_01() {
        assertEquals(0, new DescendingOrder().sortDesc(0));
    }

    @Test
    public void test_02() {
        assertEquals(51, new DescendingOrder().sortDesc(15));
    }

    @Test
    public void test_03() {
        assertEquals(987654321, new DescendingOrder().sortDesc(123456789));
    }
}