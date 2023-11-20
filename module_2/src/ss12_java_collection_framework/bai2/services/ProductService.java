package ss12_java_collection_framework.bai2.services;

import ss12_java_collection_framework.bai2.models.Product;
import ss12_java_collection_framework.bai2.repositories.IProductRepository;
import ss12_java_collection_framework.bai2.repositories.ProductRepository;

import java.util.List;

public class ProductService implements IProductService {
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

    @Override
    public Product findByEditCode(String editCode) {
        return productRepository.findByEditCode(editCode);
    }

    @Override
    public void add(Product product1) {
        productRepository.add(product1);
    }

    @Override
    public void removeE(String editCode) {
        productRepository.removeE(editCode);
    }

    @Override
    public Product findByCodeSearch(String codeSearch) {
        return productRepository.findByCodeSearch(codeSearch);
    }
}
