package C6_Inheritance_Ex.restaurant;

import java.math.BigDecimal;

public class Coffee extends HotBeverage {
    private static final double  COFFEE_MILLILITERS = 50.00;
    private static final BigDecimal COFFEE_PRICE = BigDecimal.valueOf (3.50);
    private double 	caffeine;

    public Coffee(String name, double caffeine) {
        super (name, COFFEE_PRICE, COFFEE_MILLILITERS);
        this.caffeine = caffeine;
    }

    public double getCaffeine() {
        return caffeine;
    }

}
