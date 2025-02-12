import java.util.ArrayList;

public class StockCheckingApplication {

    // Product class
    static class Product {
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

    // Shop class
    static class Shop {
        private ArrayList<Product> products;

        public Shop(String[][] data) {
            products = new ArrayList<>();
            for (String[] item : data) {
                addProduct(item[0], item[1], Integer.parseInt(item[2]));
            }
        }

        public void addProduct(String name, String description, int stock) {
            products.add(new Product(name, description, stock));
        }

        public boolean removeProduct(String name) {
            return products.removeIf(product -> product.getName().equalsIgnoreCase(name));
        }

        public boolean restockProduct(String name, int amount) {
            for (Product product : products) {
                if (product.getName().equalsIgnoreCase(name)) {
                    product.restock(amount);
                    return true;
                }
            }
            return false;
        }

        public boolean sellProduct(String name, int amount) {
            for (Product product : products) {
                if (product.getName().equalsIgnoreCase(name)) {
                    return product.sell(amount);
                }
            }
            return false;
        }

        public void printProductList() {
            for (Product product : products) {
                System.out.println(product);
            }
        }
    }

    // Main class with testing code
    public static void main(String[] args) {
        String[][] data = {
            {"milk", "Fresh from the farm", "10"},
            {"bread", "Fresh from the baker", "4"},
            {"tea", "Box of 100 teabags", "1"},
            {"eggs", "A dozen per box", "33"},
            {"ice cream", "1l box, vanilla", "2"}
        };

        Shop shop = new Shop(data);
        System.out.println("Initial product list:");
        shop.printProductList();

        // Adding a product
        System.out.println("\nAdding 'butter' to the shop...");
        shop.addProduct("butter", "Creamy and smooth", 5);
        shop.printProductList();

        // Selling a product
        System.out.println("\nSelling 2 units of 'milk'...");
        shop.sellProduct("milk", 2);
        shop.printProductList();

        // Restocking a product
        System.out.println("\nRestocking 3 units of 'tea'...");
        shop.restockProduct("tea", 3);
        shop.printProductList();

        // Removing a product
        System.out.println("\nRemoving 'bread' from the shop...");
        shop.removeProduct("bread");
        shop.printProductList();
    }
}
