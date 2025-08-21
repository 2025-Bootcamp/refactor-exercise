package organize;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

class Customer {
    String name; int age; List<Item> items;

    Customer(String name, int age) { this.name = name; this.age = age; items = new ArrayList<>(); }
}
class Item { String name; int price; int quantity; Item(String n, int p, int q) { name=n; price=p; quantity=q; } }
