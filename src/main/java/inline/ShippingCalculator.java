package inline;

public class ShippingCalculator {
    public double calculateShipping(double weight, double distance) {
        double base = baseRate();
        double cost = base * weight * distance;
        return cost;
    }

    private double baseRate() {
        return 5.0;
    }
}
