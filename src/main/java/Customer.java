import java.util.List;

class Customer {
    private String name;
    private List<Item> items;

    Customer(String name, List<Item> items) {
        this.name = name;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public List<Item> getItems() {
        return items;
    }
}