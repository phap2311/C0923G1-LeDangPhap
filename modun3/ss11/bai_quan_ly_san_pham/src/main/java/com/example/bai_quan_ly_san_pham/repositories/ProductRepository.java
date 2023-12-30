package com.example.bai_quan_ly_san_pham.repositories;

import com.example.bai_quan_ly_san_pham.models.Product;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private List<Product> productList = new ArrayList<>();

    {
        productList.add(new Product(1, "Tivi", "1000$", "cao cấp", "samsung"));
        productList.add(new Product(2, "Tủ Lạnh", "100$", "trung cấp", "panasonic"));
        productList.add(new Product(3, "Máy giặt", "400$", "cao cấp", "panasonic"));
        productList.add(new Product(4, "Máy ủi", "200$", "trung cấp", "komatsu"));
        productList.add(new Product(5, "Lò vi sóng", "300$", "trung cấp", "hafele"));

    }

    @Override
    public List<Product> getAllProduct() {
        return productList;
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Product findByCode(Integer id) {
        for (Product product : productList) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void update(Integer id, Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                productList.set(i, product);
                break;
            }
        }
    }

    @Override
    public void remove(Product product) {
        productList.remove(product);


    }

    @Override
    public Product findByName(String nameProduct) {
        for (Product product : productList){
            if(product.getNameProduct().equals(nameProduct)){
                return product;
            }
        }
        return null;
    }
}
