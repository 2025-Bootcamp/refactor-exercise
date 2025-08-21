package move;

import java.util.ArrayList;
import java.util.List;

// move
public class InvoicePrinter {
}

class Customer {
    String name;
    int age;
    List<OrderItem> items;

    Customer(String name, int age) {
        this.name = name;
        this.age = age;
        this.items = new ArrayList<>();
    }

    void printCustomer(InvoicePrinter printer) {
        System.out.println(name + " - " + age);
    }
}
