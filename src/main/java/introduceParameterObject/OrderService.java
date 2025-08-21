package introduceParameterObject;

public class OrderService {

    public void createOrder(String customerName, String productName, int quantity, double price, String address, String city, String zip) {
        System.out.println("Creating order:");
        System.out.println("Customer: " + customerName);
        System.out.println("Product: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("Shipping Address: " + address + ", " + city + " " + zip);
    }
}
