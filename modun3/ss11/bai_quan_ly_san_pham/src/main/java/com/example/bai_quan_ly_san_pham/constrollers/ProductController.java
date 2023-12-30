package com.example.bai_quan_ly_san_pham.constrollers;

import com.example.bai_quan_ly_san_pham.models.Product;
import com.example.bai_quan_ly_san_pham.services.IProductService;
import com.example.bai_quan_ly_san_pham.services.ProductService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductController", value = "/product")
public class ProductController extends HttpServlet {
    private IProductService iProductService = new ProductService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                req.getRequestDispatcher("product/create.jsp").forward(req, resp);
                break;
            case "update":
                RequestDispatcher dispatcher= req.getRequestDispatcher("product/update.jsp");
                Integer id = Integer.parseInt(req.getParameter("id"));
                Product product = this.iProductService.findByCode(id);
                req.setAttribute("productUp", product);
                dispatcher.forward(req, resp);
                break;
            case "delete":
                 dispatcher= req.getRequestDispatcher("product/delete.jsp");
                 id = Integer.parseInt(req.getParameter("id"));
                 product = this.iProductService.findByCode(id);
                req.setAttribute("productDel", product);
                dispatcher.forward(req, resp);
                break;
            case "showDetail":
                dispatcher = req.getRequestDispatcher("product/showDetail.jsp");
                id = Integer.parseInt(req.getParameter("id"));
                product = this.iProductService.findByCode(id);
                req.setAttribute("product", product);
                dispatcher.forward(req,resp);
                break;
            case "searchName":
                dispatcher = req.getRequestDispatcher("product/searchName.jsp");
                String nameProduct = req.getParameter("nameProduct");
                product = this.iProductService.findByName("nameProduct");
                req.setAttribute("product",product);
                dispatcher.forward(req,resp);
                break;
            case "view":
                viewProduct(req, resp);
                break;
            default:
                showListProduct(req, resp);
                break;

        }

    }

    private void viewProduct(HttpServletRequest req, HttpServletResponse resp) {
        Integer id = Integer.parseInt(req.getParameter("id"));
        Product product = this.iProductService.findByCode(id);
        RequestDispatcher dispatcher;
        if (product == null) {
            dispatcher = req.getRequestDispatcher("error-404.jsp");
        } else {
            req.setAttribute("product", product);
            dispatcher = req.getRequestDispatcher("product/view.jsp");
            try {
                dispatcher.forward(req, resp);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void showListProduct(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> productList = this.iProductService.getAllProduct();
        //productList
        req.setAttribute("productList", productList);
        req.getRequestDispatcher("product/list.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createProduct(req, resp);
                break;
            case "update":
                updateProduct(req, resp);
                break;
            case "delete":
                deleteProduct(req, resp);
                break;
            case "searchName":
                searchName(req,resp);
                break;

        }
    }

    private void searchName(HttpServletRequest req, HttpServletResponse resp) {
        String nameProduct = req.getParameter("nameProduct");
        Product product = this.iProductService.findByName(nameProduct);

    }


    private void deleteProduct(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.parseInt(req.getParameter("id"));
        Product product = this.iProductService.findByCode(id);

        this.iProductService.remove(product);
        try {
            resp.sendRedirect("/product");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void updateProduct(HttpServletRequest req, HttpServletResponse resp) {
        Integer id = Integer.valueOf(req.getParameter("id"));
        String nameProduct = req.getParameter("nameProduct");
        String priceProduct = req.getParameter("priceProduct");
        String description = req.getParameter("description");
        String company = req.getParameter("company");
        Product product = this.iProductService.findByCode(id);
        RequestDispatcher dispatcher;
        if (product == null) {
            dispatcher = req.getRequestDispatcher("error-404.jsp");


        } else {
            product.setId(id);
            product.setNameProduct(nameProduct);
            product.setPriceProduct(priceProduct);
            product.setDescription(description);
            product.setCompany(company);
            this.iProductService.update(id, product);
            req.setAttribute("product", product);
            req.setAttribute("message", "customer information was updated");
            dispatcher = req.getRequestDispatcher("product/update.jsp");
            try {
                dispatcher.forward(req, resp);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void createProduct(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        String nameProduct = req.getParameter("nameProduct");
        String priceProduct = req.getParameter("priceProduct");
        String description = req.getParameter("description");
        String company = req.getParameter("company");
        Product product = new Product(id, nameProduct, priceProduct, description, company);
        this.iProductService.save(product);
        req.setAttribute("product", product);
        req.setAttribute("message", "customer information was updated");

        resp.sendRedirect("/product");

    }
}
