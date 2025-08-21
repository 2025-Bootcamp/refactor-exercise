package extract;

import java.util.List;
public class OrderProcessor {

    public void processOrder(Order order) {
        System.out.println("Processing order for " + order.getCustomerName());

        // 计算总金额
        double total = 0;
        for (OrderItem item : order.getItems()) {
            total += item.getPrice() * item.getQuantity();
        }
        System.out.println("Total amount: " + total);

        // 打印每个商品明细
        for (OrderItem item : order.getItems()) {
            System.out.println(item.getName() + " x " + item.getQuantity() + " = " + (item.getPrice() * item.getQuantity()));
        }

        // 奖励积分
        int bonus = 0;
        for (OrderItem item : order.getItems()) {
            if (item.getQuantity() > 5) {
                bonus += 10;
            }
        }
        System.out.println("Bonus points: " + bonus);
    }
}

class Order {
    private String customerName;
    private List<OrderItem> items;

    public Order(String customerName, List<OrderItem> items) {
        this.customerName = customerName;
        this.items = items;
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<OrderItem> getItems() {
        return items;
    }
}

class OrderItem {
    private String name;
    private int quantity;
    private double price;

    public OrderItem(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
