import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> its = List.of(
                new Item("Apple", 5, 10),
                new Item("Banana", 12, 2),
                new Item("Orange", 3, 4)
        );

        Customer cus = new Customer("Tom", its);
        new InvoicePrinter().printInvoice(cus);
    }
}
