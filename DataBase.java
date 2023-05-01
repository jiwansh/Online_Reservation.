import java.sql.Connection;
import java.sql.DriverManager;

public class DataBase {
  static Connection conn = null;

  public static Connection connect() {
    try {
      String DB_URL = "jdbc:mysql://localhost:3306/Trains";
      String USER = "root";
      String PASS = "#JKsql@17";
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      //System.out.println("Database Created Successfully////Congrats! HAHA");
    } catch (Exception e) {
      e.printStackTrace();
    }
    return conn;
  }
}