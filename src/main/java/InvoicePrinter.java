public class InvoicePrinter {
    void printInvoice(Customer customer) {
        int total = 0;
        int bonus = 0;

        System.out.println("Invoice for " + customer.name);
        for (Item item : customer.items) {
            int c = item.p * item.d;
            System.out.println(item.n + "\t" + item.d + "\t" + item.p + "\t" + c);

            total += c;
            if (item.d > 10) {
                bonus += 5;
            }
        }

        System.out.println("Total: " + total);
        System.out.println("Bonus: " + bonus);
    }
}
