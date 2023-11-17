package ss12_java_collection_framework.constrollers;

import ss12_java_collection_framework.models.Product;
import ss12_java_collection_framework.services.IProductService;
import ss12_java_collection_framework.services.ProductService;

import java.util.List;

public class ProductController {
private IProductService iProductService = new ProductService();
    public void addProduct(Product product) {
        iProductService.save(product);

    }

    public List<Product> getAll() {
        return iProductService.findAll();
    }

    public Product findByCode(String code) {
        return iProductService.findByCode(code);
    }

    public void remove(String code) {
        iProductService.remove(code);
    }
}
