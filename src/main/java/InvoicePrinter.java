import java.util.List;

class InvoicePrinter {
    private static final int BONUS_POINTS = 5;

    void printInvoice(Customer customer) {
        printHeader(customer);

        List<Item> items = customer.getItems();

        items.forEach(this::printItem);

        int total = items.stream()
                .mapToInt(Item::getCost)
                .sum();

        int bonus = (int) items.stream()
                .filter(item -> item.getDays() > 10)
                .count() * BONUS_POINTS;

        printSummary(total, bonus);
    }

    private void printHeader(Customer customer) {
        System.out.println("Invoice for " + customer.getName());
    }

    private void printItem(Item item) {
        System.out.println(
                item.getName() + "\t" +
                        item.getDays() + "\t" +
                        item.getPrice() + "\t" +
                        item.getCost()
        );
    }

    private void printSummary(int total, int bonus) {
        System.out.println("Total: " + total);
        System.out.println("Bonus: " + bonus);
    }
}
