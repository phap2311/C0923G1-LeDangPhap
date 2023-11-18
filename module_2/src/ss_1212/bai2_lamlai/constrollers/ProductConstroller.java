package ss_1212.bai2_lamlai.constrollers;

import ss_1212.bai2_lamlai.models.Product;
import ss_1212.bai2_lamlai.servicess.IProductService;
import ss_1212.bai2_lamlai.servicess.ProductService;

import java.util.List;

public class ProductConstroller {



    private IProductService iProductService = new  ProductService();

    public void addProduct(Product product) {
        iProductService.save(product);
    }
    public List<Product> getAll(){
        return iProductService.findAll();
    }

    public Product findByCode(String code) {
        return iProductService.findByCode(code);
    }

    public void remove(String code) {
        iProductService.remove(code);
    }
}
