package day05;

public class Product {
    private String name;
    private ProductType productType;
    private double price;

    public Product(String name, ProductType productType, double price) {
        this.name = name;
        this.productType = productType;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public ProductType getProductType() {
        return productType;
    }

    public double getPrice() {
        return price;
    }
}
