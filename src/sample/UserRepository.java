package sample;

import java.sql.*;

public class UserRepository {

    private Connection connection;

    public UserRepository() throws SQLException {
        this.connection = DriverManager.getConnection(
                "jdbc:mysql://" +
                "localhost:3306/codersbay" +
                "?user=pia&password=secret"
        );
    }

    public void save(User user) throws SQLException {

        // TODO insert
        PreparedStatement insertStatement = connection.prepareStatement(
                "INSERT INTO users(user_name, first_name, last_name, birth_day, password) " +
                "VALUES(?, ?, ?, ?, ?)");
        insertStatement.setString(1, user.getUsername());
        insertStatement.setString(2, user.getFirstname());
        insertStatement.setString(3, user.getLastname());
        insertStatement.setDate(4, Date.valueOf(user.getBirthday()));
        insertStatement.setString(5, user.getPassword());
        insertStatement.executeUpdate();

    }

    public boolean exists(String username, String password) throws SQLException {
        PreparedStatement selectStatement = connection.prepareStatement(
                "SELECT * FROM users WHERE user_name = ? AND password = ?"
        );
        selectStatement.setString(1, username);
        selectStatement.setString(2, password);
        ResultSet resultSet = selectStatement.executeQuery();
        return resultSet.next();
    }

}
