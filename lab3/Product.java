public class Product {
    private String name;
    private String description;
    private int stock;

    public Product(String name, String description, int stock) {
        this.name = name;
        this.description = description;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getStock() {
        return stock;
    }

    public void restock(int amount) {
        if (amount > 0) {
            stock += amount;
        }
    }

    public boolean sell(int amount) {
        if (amount > 0 && amount <= stock) {
            stock -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return name + " - " + description + " (Stock: " + stock + ")";
    }
}
