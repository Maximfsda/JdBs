import java.sql.*;

public class Application {public static void main(String[] args) {
    try (Connection connection = DriverManager.getConnection(
            "jdbc:postgresql://localhost:5432/skypro", "postgres", "13579Tetris")) {
        PreparedStatement preparedStatement = connection.prepareStatement(
                "SELECT * FROM employee WHERE id = 1");{
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.println(
                        "id = " + resultSet.getInt("id") +"\n"+
                                "name = " + resultSet.getString("firstname")+"\n"+
                                "lastname = " + resultSet.getString("lastname")+"\n"+
                                "gender = " + resultSet.getString("gender")+"\n"+
                                "age = " + resultSet.getInt("age")


                );

            }

        }
    } catch (SQLException e) {
        throw new RuntimeException(e);
    }
}
}
