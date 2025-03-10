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
}
