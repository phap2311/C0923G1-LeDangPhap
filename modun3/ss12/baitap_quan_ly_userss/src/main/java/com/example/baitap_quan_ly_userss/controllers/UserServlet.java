package com.example.baitap_quan_ly_userss.controllers;


import com.example.baitap_quan_ly_userss.models.User;
import com.example.baitap_quan_ly_userss.service.IUserService;
import com.example.baitap_quan_ly_userss.service.UserService;
import org.graalvm.compiler.lir.LIRInstruction;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(name = "UserServlet", urlPatterns = "/user")
public class UserServlet extends HttpServlet {
    private IUserService iUserService = new UserService();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        RequestDispatcher dispatcher = null;
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "create":
                getCreateUser(req, resp);
                break;
            case "edit":
                getEditUser(req, resp);
                break;
            case "delete":
                getDeleteUser(req, resp);
                break;
            default:
                showList(req, resp);
        }
    }

    private void getDeleteUser(HttpServletRequest req, HttpServletResponse resp) {
        RequestDispatcher dispatcher;
        int id = Integer.parseInt(req.getParameter("id"));
        User user = iUserService.findById(id);
        if (user != null) {
            req.setAttribute("user", user);

            dispatcher = req.getRequestDispatcher("/users/delete.jsp");
            try {
                dispatcher.forward(req, resp);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void getEditUser(HttpServletRequest req, HttpServletResponse resp) {
        RequestDispatcher dispatcher;
        int id = Integer.parseInt(req.getParameter("id"));
        User user = iUserService.findById(id);
        if (user != null) {
            req.setAttribute("user", user);
            req.setAttribute("id", id);
            dispatcher = req.getRequestDispatcher("/users/edit.jsp");
            try {
                dispatcher.forward(req, resp);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    private void getCreateUser(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.sendRedirect("/users/editU.jsp");
    }

    private void showList(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("userList", iUserService.findAll());
        req.getRequestDispatcher("/users/list.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createUser(req, resp);
                break;
            case "edit":
                editUser(req, resp);
                break;
            case "delete":
                deleteUser(req,resp);
                break;
            case "searchByCountry":
                searchByCountry(req,resp);
                break;
            default:
                showList(req, resp);
        }
    }

    private void searchByCountry(HttpServletRequest req, HttpServletResponse resp) {
    String country = req.getParameter("country");
        List<User> userList = iUserService.findByCountry(country);
        System.out.println(userList);
        req.setAttribute("country",country);
        req.setAttribute("userList",userList);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/user/search.jsp");
        try {
            dispatcher.forward(req,resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void deleteUser(HttpServletRequest req, HttpServletResponse resp) {
        int id = Integer.parseInt(req.getParameter("id"));
        if(iUserService.remove(id)){
            try {
                showList(req,resp);
            } catch (ServletException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }


    private void editUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String nameUser = req.getParameter("nameUser");
        String email = req.getParameter("email");
        String country = req.getParameter("country");
        User user = new User(id, nameUser, email, country);
        if (iUserService.editUser(user)) {
            showList(req, resp);
        }

    }

    private void createUser(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("userId"));
        String nameUser = req.getParameter("userName");
        String email = req.getParameter("email");
        String country = req.getParameter("country");
        User user = new User(id, nameUser, email, country);
        System.out.println(user);
        this.iUserService.save(user);
        req.setAttribute("ms", "tao moi" + nameUser + "thanh cong");
        showList(req, resp);

    }
}

