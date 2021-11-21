package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    Store store;
    Store sotoreEmpti;

    @BeforeEach
    void init() {
        List<Product> productList = new ArrayList<>(Arrays.asList(new Product("Tehéntej", ProductType.TEJTERMÉK, 300),
                new Product("Zsemle", ProductType.PÉKÁRÚ, 30),
                new Product("Joghurt", ProductType.TEJTERMÉK, 100),
                new Product("Banán", ProductType.GYÜMÖLCS, 120),
                new Product("Répa", ProductType.ZŐLDSÉG, 100)));
        store = new Store(productList);
    }

    @Test
    void testAddList () {
        Product p = new Product("Retek", ProductType.ZŐLDSÉG, 233);
        store.AddList(p);
        assertEquals(6, store.getProductList().size());
        assertEquals("Retek", store.getProductList().get(5).getName());
    }

    @Test
    void testProductByType () {
        assertEquals(ProductType.TEJTERMÉK, store.setProductByType().get(0).getProductType());
        assertEquals(2, store.setProductByType().get(0).getCount());
        assertEquals(1, store.setProductByType().get(1).getCount());

        assertEquals(1, store.setProductByType().get(3).getCount());
        store.AddList(new Product("Retek", ProductType.ZŐLDSÉG, 233));
        assertEquals(ProductType.ZŐLDSÉG, store.setProductByType().get(3).getProductType());
        assertEquals(2, store.setProductByType().get(3).getCount());
    }

    @Test
    void testStoreListEmpty () {
        List<Product> productListEmpty = new ArrayList<>();
        sotoreEmpti = new Store(productListEmpty);
        assertEquals(0, sotoreEmpti.getProductList().size());
    }

}