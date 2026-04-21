package datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MariaDbConnection {
  private static Connection connection = null;

  public static Connection getConnection() {
    if (connection != null) {
      return connection;
    }
    try {
      connection = DriverManager
          .getConnection("jdbc:mariadb://localhost:3306/conversion?user=appuser&password=password");
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return connection;
  }

  public static void terminate() {
    try {
      getConnection().close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
