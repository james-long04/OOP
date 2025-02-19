interface Asset {
    float currentValue();
}

class StoredProduct {
    private Product product;
    private int stock;
    private float price;

    public StoredProduct(Product product, int stock) {
        this.product = product;
        this.stock = stock;
        this.price = product.getRRP();
    }

    public Product getProduct() {
        return product;
    }

    public float getValue() {
        return stock * price;
    }
}

class Shop implements Asset {
    private StoredProduct[] products;
    private int count;

    public Shop() {
        products = new StoredProduct[5];
        count = 0;
    }

    public void addProduct(Product p, int amount) {
        if (count < products.length) {
            products[count++] = new StoredProduct(p, amount);
        }
    }

    public void printProducts(String type) {
        System.out.println("Listing " + type + " products:");
        for (StoredProduct sp : products) {
            if (sp != null) {
                Product p = sp.getProduct();
                if ((type.equals("food") && p instanceof FoodProduct) || (type.equals("clothing") && p instanceof ClothingProduct)) {
                    System.out.println(" - " + p.getName() + " (RRP: " + p.getRRP() + ")");
                }
            }
        }
    }

    @Override
    public float currentValue() {
        float total = 0;
        for (StoredProduct sp : products) {
            if (sp != null) {
                total += sp.getValue();
            }
        }
        return total;
    }
}
