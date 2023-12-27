package com.example.baitap1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/abc")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        List<Customer> list = new ArrayList<>();
        list.add(new Customer("Hoa", "10/11/2000", "Lao Cai","https://elead.com.vn/wp-content/uploads/2020/04/hoa-hong-xanh-dep-nhat-the-gioi-1-411x400-1.jpg"));
        list.add(new Customer("Hồng", "7/1/2001", "Thái Bình", "https://elead.com.vn/wp-content/uploads/2020/04/3438032811_deef1ec060_z.jpg"));
        list.add(new Customer("Tươi", "1/5/2002", "Tuyên Quang","https://img.thuthuatphanmem.vn/uploads/2018/09/25/anh-gio-hoa-dep_110817333.jpg"));
        list.add(new Customer("Thắm", "12/7/2003", "Mộc Châu","https://img.thuthuatphanmem.vn/uploads/2018/09/25/anh-hoa-anh-dao-dep-nhat_110817411.jpg"));
        list.add(new Customer("Mãi", "19/9/2004", "Sơn La","https://img.thuthuatphanmem.vn/uploads/2018/09/25/anh-hoa-dam-but-thai-khoe-sac_110817521.jpg"));
        request.setAttribute("ds", list);
        dispatcher.forward(request, response);

    }


}