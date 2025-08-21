import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class InvoicePrinterTest {

    private InvoicePrinter printer;
    private Customer customer;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        printer = new InvoicePrinter();
        customer = new Customer("Alice", List.of(
                new Item("Apple", 5, 10),     // cost = 50
                new Item("Banana", 12, 8),    // cost = 96, bonus +5
                new Item("Cherry", 15, 20)    // cost = 300, bonus +5
        ));
        // 捕获控制台输出
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void testPrintInvoiceOutput() {
        printer.printInvoice(customer);

        String output = outContent.toString();

        assertTrue(output.contains("Invoice for Alice"));

        assertTrue(output.contains("Apple\t5\t10\t50"));
        assertTrue(output.contains("Banana\t12\t8\t96"));
        assertTrue(output.contains("Cherry\t15\t20\t300"));

        assertTrue(output.contains("Total: 446")); // 50+96+300

        assertTrue(output.contains("Bonus: 10"));
    }

    @Test
    void testEmptyItems() {
        Customer emptyCustomer = new Customer("Bob", List.of());
        printer.printInvoice(emptyCustomer);
        String output = outContent.toString();
        assertTrue(output.contains("Invoice for Bob"));
        assertTrue(output.contains("Total: 0"));
        assertTrue(output.contains("Bonus: 0"));
    }

    @Test
    void testNoBonus() {
        Customer noBonusCustomer = new Customer("Charlie", List.of(
                new Item("Orange", 3, 5),
                new Item("Peach", 7, 10)
        ));
        printer.printInvoice(noBonusCustomer);
        String output = outContent.toString();
        assertTrue(output.contains("Bonus: 0"));
    }
}
