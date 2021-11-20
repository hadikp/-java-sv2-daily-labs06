package day05;

import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> productList;

    public Store(List<Product> productList) {
        this.productList = productList;
    }

    public void AddList (Product product) {
        productList.add(product);
    }

    public List<ProductWithPiece> setProductByType () {
        List<ProductWithPiece> result = new ArrayList<>();

        for (Product p: productList) {
            ProductWithPiece pwp = containsProduct(p, result);
            if (pwp != null) {
                pwp.incrementCount();
            } else {
                result.add(new ProductWithPiece(p.getProductType()));
            }
        }
        return result;
    }

    private ProductWithPiece containsProduct(Product p, List<ProductWithPiece> productsPieceList) {
        for (ProductWithPiece pwp: productsPieceList) {
            if (p.getProductType() == pwp.getProductType()) {
                return pwp;
            }
        }
        return null;
    }

    public List<Product> getProductList() {
        return productList;
    }
}
