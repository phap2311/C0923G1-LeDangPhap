package ss12_java_collection_framework.bai2.services;

import ss12_java_collection_framework.bai2.models.Product;

import java.util.List;

public interface IProductService {
    void save(Product product);
    

    List<Product> findAll();

    Product findByCode(String code);

    void remove(String code);

    Product findByEditCode(String editCode);

    void add(Product product1);

    void removeE(String editCode);

    Product findByCodeSearch(String codeSearch);
}
