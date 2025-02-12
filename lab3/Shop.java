import java.util.ArrayList;

public class Shop {
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
