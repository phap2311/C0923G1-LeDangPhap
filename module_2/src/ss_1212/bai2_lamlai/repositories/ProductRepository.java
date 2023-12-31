package ss_1212.bai2_lamlai.repositories;

import ss_1212.bai2_lamlai.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository{
    private static List<Product> products = new ArrayList<>();
    @Override
    public void save(Product product) {
        products.add(product);

    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public Product findByCode(String code) {
        for (Product product:products){
            if(product.getCode().equals(code)){
                return product;
            }
        }
        return null;
    }

    @Override
    public void remove(String code) {
        for (Product product: products){
            if(product.getCode().equals(code)){
                products.remove(product);
                break;
            }
        }
    }
}
