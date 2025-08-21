package rename;

class OrderItem {
    String n;  // name
    int p;     // price

    OrderItem(String n, int p) {
        this.n = n;
        this.p = p;
    }

    int calcTotal(int quantity) {
        return p * quantity;
    }
}
