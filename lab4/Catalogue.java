public class Catalogue {
    private FoodProduct[] foodProducts;
    private ClothingProduct[] clothingProducts;

    public Catalogue(String[][] foodData, String[][] clothingData) {
        foodProducts = new FoodProduct[foodData.length];
        clothingProducts = new ClothingProduct[clothingData.length];

        for (int i = 0; i < foodData.length; i++) {
            foodProducts[i] = new FoodProduct(foodData[i][0], foodData[i][1], foodData[i][2], foodData[i][3]);
        }

        for (int i = 0; i < clothingData.length; i++) {
            clothingProducts[i] = new ClothingProduct(clothingData[i][0], clothingData[i][1], clothingData[i][2], clothingData[i][3]);
        }
    }

    public Product getProductByName(String name) {
        for (FoodProduct fp : foodProducts) {
            if (fp.getName().equals(name)) return fp;
        }
        for (ClothingProduct cp : clothingProducts) {
            if (cp.getName().equals(name)) return cp;
        }
        return null;
    }
}
