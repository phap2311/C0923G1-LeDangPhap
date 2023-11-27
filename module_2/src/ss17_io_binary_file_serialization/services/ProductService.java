package ss17_io_binary_file_serialization.services;

import ss17_io_binary_file_serialization.models.Product;
import ss17_io_binary_file_serialization.repositories.IProductRepository;
import ss17_io_binary_file_serialization.repositories.ProductRepository;

import java.util.List;

public class ProductService implements IProductService {
    private static IProductRepository iProductRepository = new ProductRepository();


    @Override
    public void save(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public List<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public Product findByCode(String code) {
        return iProductRepository.findByCode(code);
    }


}

