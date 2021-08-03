package database.implementation;

import database.DBAccess;
import database.interfaces.IUserService;
import models.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserService implements IUserService {
    @Override
    public boolean emailFree(String email) {
        try (Connection connection = DBAccess.getInstance().getConnection(); PreparedStatement preparedStatement = connection.prepareStatement("SELECT count(*) as count FROM users WHERE email  = ?"))
        {
            preparedStatement.setString(1, email);
            ResultSet resultSet = preparedStatement.executeQuery();
            boolean result = resultSet.getInt("count") == 0;
            return result;
        }
        catch (SQLException e)
        {
            throw new RuntimeException("Failed to execute query.");
        }
    }

    @Override
    public boolean register(User user) {
        System.out.println(user.getEmail()+" " + user.getPassword()+" "+ emailFree(user.getEmail()));
        if(!emailFree(user.getEmail())) return false;

        try (Connection connection = DBAccess.getInstance().getConnection();PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users(email, password) values(?, ?)"))
        {

            preparedStatement.setString(1, user.getEmail());
            preparedStatement.setString(2, user.getPassword());

            boolean result = preparedStatement.executeUpdate() > 0;
            return result;
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return false;
    }

    @Override
    public User login(User user) {
        System.out.println(user.getEmail()+" " + user.getPassword()+" ");
        String email = null;
        String password = null;
        int id = 0;
        try (Connection connection = DBAccess.getInstance().getConnection();PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users WHERE email = ?"))
        {

            preparedStatement.setString(1, user.getEmail());
            ResultSet resultSet = preparedStatement.executeQuery();
            email = resultSet.getString("email");
            password = resultSet.getString("password");
            id = resultSet.getInt("id");
        }
        catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        if(user.getPassword().equals(password)) return new User(email,password,id);
        return new User();
    }
}