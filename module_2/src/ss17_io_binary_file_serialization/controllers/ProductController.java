package ss17_io_binary_file_serialization.controllers;

import ss17_io_binary_file_serialization.models.Product;
import ss17_io_binary_file_serialization.services.IProductService;
import ss17_io_binary_file_serialization.services.ProductService;

import java.util.List;

public class ProductController  {
    private static IProductService iProductService =  new ProductService();

    public void addProduct(Product product) {
        iProductService.save(product);
    }


    public List<Product> getAll() {
       return iProductService.findAll();
    }

    public Product findByCode(String code) {
        return iProductService.findByCode(code);
    }
}
