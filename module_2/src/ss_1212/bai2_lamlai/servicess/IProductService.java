package ss_1212.bai2_lamlai.servicess;

import ss_1212.bai2_lamlai.models.Product;

import java.util.List;

public interface IProductService {


    void save(Product product);

    List<Product> findAll();

    Product findByCode(String code);

    void remove(String code);
}
