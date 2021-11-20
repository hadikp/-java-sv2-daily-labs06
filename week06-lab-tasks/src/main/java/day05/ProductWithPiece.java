package day05;

public class ProductWithPiece {

    private ProductType productType;
    private int count = 1;

    public ProductWithPiece(ProductType productType) {
        this.productType = productType;
    }

    public void incrementCount () {
        count++;
    }

    public ProductType getProductType() {
        return productType;
    }

    public int getCount() {
        return count;
    }
}
