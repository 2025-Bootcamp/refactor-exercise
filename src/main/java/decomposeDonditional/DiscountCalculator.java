package decomposeDonditional;
public class DiscountCalculator {

    public double calculateDiscount(String customerType, int yearsOfMembership, double purchaseAmount) {
        if ((customerType.equals("VIP") && yearsOfMembership > 5) || purchaseAmount > 1000) {
            return purchaseAmount * 0.2; // 20% 折扣
        } else {
            return purchaseAmount * 0.05; // 5% 折扣
        }
    }
}
