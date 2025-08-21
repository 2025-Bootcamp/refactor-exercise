package magicNumber;

public class ShippingCalculator {
    public double calculateShipping(double weight) {
        if (weight <= 5) {
            return 10.0;
        } else if (weight <= 20) {
            return 20.0;
        } else {
            return 50.0;
        }
    }
}
