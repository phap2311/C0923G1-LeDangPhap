package com.example.baitap_quan_ly_userss.repository;

import com.example.baitap_quan_ly_userss.models.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository {
    public static final String UPDATE = "update users set nameUser = ?, email = ?, country = ? where id = ?;";
    public static final String DELETE = "delete from users where id=?;";
    public static final String FINDBYCOUNTRY = "select * from users where country = ?;";
    public final String SELECT_FROM_USERS = "select * from users";


    @Override
    public List<User> findAll() {
        List<User> userList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        User user = null;
        if (connection != null) {
            try {

                statement = connection.prepareStatement(SELECT_FROM_USERS);
                resultSet = statement.executeQuery();


                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String nameUser = resultSet.getString("nameUser");
                    String email = resultSet.getString("email");
                    String country = resultSet.getString("country");
                    user = new User(id, nameUser, email, country);
                    userList.add(user);

                }

            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    resultSet.close();
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();
            }
        }

        return userList;
    }

    @Override
    public void save(User user) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;

        if (connection != null) {
            try {
                statement = connection.prepareStatement("insert into users (id,nameUser,email,country)" + "value(?,?,?,?)");
                statement.setInt(1, user.getId());
                statement.setString(2, user.getNameUser());
                statement.setString(3, user.getEmail());
                statement.setString(4, user.getCountry());
                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                DBConnection.close();

            }

        }

    }

    @Override
    public User findById(Integer id) {
        Connection connection = DBConnection.getConnection();
        PreparedStatement statement = null;
        User user = null;
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement("select * from users where id=?");
            statement.setInt(1, id);
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                user = new User(resultSet.getInt("id"),
                        resultSet.getString("nameUser"),
                        resultSet.getString("email"),
                        resultSet.getString("country"));
            }
            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return user;
    }

    @Override
    public boolean editUser(User user) {
        if (findById(user.getId()) == null) {
            return false;
        }
        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(UPDATE);
            statement.setInt(4, user.getId());
            statement.setString(1, user.getNameUser());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getCountry());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;

    }

    @Override
    public boolean remove(int id) {
        if (findById(id) == null) {
            return false;
        }
        Connection connection = DBConnection.getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement(DELETE);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;

    }

    @Override
    public List<User> findByCountry(String country) {
        Connection connection = DBConnection.getConnection();
        List<User> userList = new ArrayList<>();
        User user;
        try {
            PreparedStatement statement = connection.prepareStatement(FINDBYCOUNTRY);
            statement.setString(1, country);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nameUser = resultSet.getString("nameUser");
                String email = resultSet.getString("email");
                String countryFind = resultSet.getString("country");
                user = new User(id, nameUser, email, countryFind);
                userList.add(user);
            }
            resultSet.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return userList;
    }
}




