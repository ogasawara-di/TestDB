import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

    public Connection getConnection() {
        Connection con = null;
        try {
            String url = "jdbc:mysql://localhost:3306/testdb"; // データベース名をtestdbに変更
            String user = "root"; // データベースのユーザー名
            String password = ""; // データベースのパスワード
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}