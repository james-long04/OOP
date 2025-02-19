public class Product {
    private static int idCounter = 1;
    protected String name;
    protected String description;
    protected float RRP;
    protected int catalogueId;

    public Product(String name, String description, String RRP) {
        this.name = name;
        this.description = description;
        this.RRP = Float.parseFloat(RRP);
        this.catalogueId = generateId();
    }

    private static int generateId() {
        return idCounter++;
    }

    public String getName() {
        return name;
    }

    public float getRRP() {
        return RRP;
    }
}

class FoodProduct extends Product {
    private int timeToExpiry;

    public FoodProduct(String name, String description, String RRP, String timeToExpiry) {
        super(name, description, RRP);
        this.timeToExpiry = Integer.parseInt(timeToExpiry);
    }
}

class ClothingProduct extends Product {
    private int washTemperature;

    public ClothingProduct(String name, String description, String RRP, String washTemperature) {
        super(name, description, RRP);
        this.washTemperature = Integer.parseInt(washTemperature);
    }
}
