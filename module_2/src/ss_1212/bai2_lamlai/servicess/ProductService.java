package ss_1212.bai2_lamlai.servicess;


import ss_1212.bai2_lamlai.models.Product;
import ss_1212.bai2_lamlai.repositories.IProductRepository;
import ss_1212.bai2_lamlai.repositories.ProductRepository;

import java.util.List;

public class ProductService implements IProductService{
    private IProductRepository productRepository = new ProductRepository();


    @Override
    public void save(Product product) {
        productRepository.save(product);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findByCode(String code) {
        return productRepository.findByCode(code);
    }

    @Override
    public void remove(String code) {
        productRepository.remove(code);
    }
}


