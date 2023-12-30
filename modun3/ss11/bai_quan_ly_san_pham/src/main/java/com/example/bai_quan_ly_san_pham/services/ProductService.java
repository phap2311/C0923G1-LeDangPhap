package com.example.bai_quan_ly_san_pham.services;

import com.example.bai_quan_ly_san_pham.models.Product;
import com.example.bai_quan_ly_san_pham.repositories.IProductRepository;
import com.example.bai_quan_ly_san_pham.repositories.ProductRepository;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class ProductService implements IProductService {
    private IProductRepository iProductRepository = new ProductRepository();

    @Override
    public List<Product> getAllProduct() {
        return iProductRepository.getAllProduct();
    }

    @Override
    public void save(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public Product findByCode(Integer id) {
        return iProductRepository.findByCode(id);
    }

    @Override
    public void update(Integer id, Product product) {
        iProductRepository.update(id, product);
    }

    @Override
    public void remove(Product product) {
        iProductRepository.remove(product);
    }

    @Override
    public Product findByName(String nameProduct) {
        return iProductRepository.findByName(nameProduct);
    }
}


