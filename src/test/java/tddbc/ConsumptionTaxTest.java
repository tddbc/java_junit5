package tddbc;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class ConsumptionTaxTest {

    @Test
    @DisplayName("should return price * rate")
    public void _should_return_tax_added_price() throws Exception {
        // Setup
        int price = 1000;
        double taxRate = 1.08;
        ConsumptionTax consumptionTax = new ConsumptionTax(taxRate);
        // Exercise
        double actual = consumptionTax.calcurate(price);
        // Verify
        assertEquals(1080, actual);
    }

}