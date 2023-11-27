package ss17_io_binary_file_serialization.repositories;

import ss17_io_binary_file_serialization.models.Product;

import java.util.List;

public interface IProductRepository {
    void save(Product product);


    List<Product> findAll();

    Product findByCode(String code);
}
