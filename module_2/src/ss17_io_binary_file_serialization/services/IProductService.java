package ss17_io_binary_file_serialization.services;

import ss17_io_binary_file_serialization.models.Product;

import java.util.List;

public interface IProductService {

    void save(Product product);

    List<Product> findAll();

    Product findByCode(String code);
}
