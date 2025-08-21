class Item {
    private String name;
    private int days;
    private int price;

    Item(String name, int days, int price) {
        this.name = name;
        this.days = days;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getDays() {
        return days;
    }

    public int getPrice() {
        return price;
    }

    public int getCost() {
        return price * days;
    }
}