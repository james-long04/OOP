public class Main {
    public static void main(String[] args) {
        String[][] foodData = {
            {"Apple", "Fresh red apple", "1.20", "10"},
            {"Banana", "Yellow banana", "0.80", "7"},
            {"Milk", "Dairy milk", "2.50", "5"}
        };

        String[][] clothingData = {
            {"Shirt", "Cotton shirt", "15.00", "40"},
            {"Jeans", "Denim jeans", "30.00", "60"},
            {"Jacket", "Winter jacket", "50.00", "30"}
        };

        Catalogue catalogue = new Catalogue(foodData, clothingData);
        Shop shop = new Shop();

        shop.addProduct(catalogue.getProductByName("Apple"), 10);
        shop.addProduct(catalogue.getProductByName("Milk"), 5);
        shop.addProduct(catalogue.getProductByName("Shirt"), 3);
        shop.addProduct(catalogue.getProductByName("Jeans"), 2);

        shop.printProducts("food");
        shop.printProducts("clothing");

        System.out.println("Total shop value: " + shop.currentValue());
    }
}
