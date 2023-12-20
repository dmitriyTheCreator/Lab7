import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    @Test
    public void appendFormatted() {
        System.out.println("appendFormatted");
        StringBuilder sb = null;
        String value = "";
        int align = 0;
        int width = 0;
        ShoppingCart.appendFormatted(sb, value, align, width);
        // TODO review the generated test code and remove the
        // default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void calculateDiscount() {
        System.out.println("calculateDiscount");
        ShoppingCart.ItemType type = null;
        int quantity = 0;
        int expResult = 0;
        int result = ShoppingCart.calculateDiscount(type, quantity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove
        // the default call to fail.
        fail("The test case is a prototype.");
    }
}