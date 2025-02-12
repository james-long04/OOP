public class Main {
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
