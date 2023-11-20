package ss12_java_collection_framework.bai2.repositories;

import ss12_java_collection_framework.bai2.models.Product;

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
        for (Product product: products){
            if(product.getCode().equals(code)){
                return product;
            }
        }
        return null;
    }

    @Override
    public void remove(String code) {
      for (Product product : products){
          if(product.getCode().equals(code)){
              products.remove(product);
              break;

          }
      }
    }
    @Override
    public Product findByEditCode(String editCode) {
        for (Product product: products){
            if(product.getCode().equals(editCode));{
                return product;
            }
        }
        return null;
    }
    @Override
    public void add(Product product1) {
        products.add(product1);
    }

    @Override
    public void removeE(String editCode) {
        for (Product product : products){
            if (product.getCode().equals(editCode)){
                products.remove(product);
                break;
            }
        }
    }

    @Override
    public Product findByCodeSearch(String codeSearch) {
        for (Product product : products){
            if (product.getCode().equals(codeSearch)){
                return product;
            }
        }
        return null;
    }
}
