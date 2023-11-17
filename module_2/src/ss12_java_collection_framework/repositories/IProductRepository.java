package ss12_java_collection_framework.repositories;

import ss12_java_collection_framework.models.Product;

import java.util.List;

public interface IProductRepository {

    void save(Product product);

    List<Product> findAll();

    Product findByCode(String code);

    void remove(String code);
}
