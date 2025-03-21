import junit.framework.TestCase;

public class ShippingCostCalculatorC2Test extends TestCase {
    public void test1() {
        ShippingCostCalculator calculator = new ShippingCostCalculator(3, 50, false);
        assertEquals(30000 + 100 * 50, calculator.calculateShippingCost());
    }

    public void test2() {
        ShippingCostCalculator calculator = new ShippingCostCalculator(10, 150, false);
        assertEquals(70000 + 250 * 150, calculator.calculateShippingCost());
    }

    public void test3() {
        ShippingCostCalculator calculator = new ShippingCostCalculator(100, 500, true);
        assertEquals((int) ((100000 + 500 * 500) * 1.2), calculator.calculateShippingCost());
    }

    public void test4() {
        ShippingCostCalculator calculator = new ShippingCostCalculator(250, 150, false);
        try {
            calculator.calculateShippingCost();
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid weight", e.getMessage());
        }
    }

    public void test5() {
        ShippingCostCalculator calculator = new ShippingCostCalculator(3, 1200, false);
        try {
            calculator.calculateShippingCost();
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid distance", e.getMessage());
        }
    }

    public void test6() {
        ShippingCostCalculator calculator = new ShippingCostCalculator(2, 75, false);
        assertEquals(30000 + 100 * 75, calculator.calculateShippingCost(2, 75, false));
    }

    public void test7() {
        ShippingCostCalculator calculator = new ShippingCostCalculator(25, 150, false);
        assertEquals(70000 + 250 * 150, calculator.calculateShippingCost());
    }

    public void test8() {
        ShippingCostCalculator calculator = new ShippingCostCalculator(100, 500, true);
        assertEquals((int) ((100000 + 500 * 500) * 1.2), calculator.calculateShippingCost());
    }

    public void test9() {
        ShippingCostCalculator calculator = new ShippingCostCalculator(0, 20, false);
        try {
            calculator.calculateShippingCost();
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid weight", e.getMessage());
        }
    }

    public void test10() {
        ShippingCostCalculator calculator = new ShippingCostCalculator(2, 0, true);
        try {
            calculator.calculateShippingCost();
            fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid distance", e.getMessage());
        }
    }

    public void test11() {
        ShippingCostCalculator calculator = new ShippingCostCalculator(2, 150, true);
        assertEquals((int) ((30000 + 250 * 150) * 1.2), calculator.calculateShippingCost());
    }

    public void test12() {
        ShippingCostCalculator calculator = new ShippingCostCalculator(2, 500, false);
        assertEquals(30000 + 500 * 500, calculator.calculateShippingCost());
    }

    public void test13() {
        ShippingCostCalculator calculator = new ShippingCostCalculator(10, 50, true);
        assertEquals((int) ((70000 + 100 * 50) * 1.2), calculator.calculateShippingCost());
    }

    public void test14() {
        ShippingCostCalculator calculator = new ShippingCostCalculator(10, 200, false);
        assertEquals(70000 + 250 * 200, calculator.calculateShippingCost());
    }

    public void test15() {
        ShippingCostCalculator calculator = new ShippingCostCalculator(20, 500, false);
        assertEquals(70000 + 500 * 500, calculator.calculateShippingCost());
    }
}
