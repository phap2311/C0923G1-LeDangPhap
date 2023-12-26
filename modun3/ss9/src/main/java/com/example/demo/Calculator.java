package com.example.demo;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountCalculator", value = "/calculator")
public class Calculator extends HttpServlet {
    @Override
    protected  void doGet(HttpServletRequest request, HttpServletResponse response){

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String productDescription = request.getParameter("productDescription");
        float listPrice = Float.parseFloat(request.getParameter("listPrice"));
        int discountPercent = Integer.parseInt(request.getParameter("discountPercent"));
         double discountAmount = listPrice * discountPercent * 0.01;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>productDescription: " + productDescription + "<//h1>");
        writer.println("<h1>listPrice: " + listPrice + "<//h1>");
        writer.println("<h1>discountPercent: " + discountPercent +"%"+ "<//h1>");
        writer.println("<h1>discountAmount: " + discountAmount + "<//h1>");
        writer.println("</html>");

    }
}


