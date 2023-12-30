package com.example.bai_quan_ly_san_pham.services;

import com.example.bai_quan_ly_san_pham.models.Product;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface IProductService {
    List<Product> getAllProduct();

    void save(Product product);

    Product findByCode(Integer id);

    void update(Integer id, Product product);

    void remove(Product product);

    Product findByName(String nameProduct);
}
