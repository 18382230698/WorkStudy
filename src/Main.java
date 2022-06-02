import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author lyc2020
 */
public class Main {
    public static void main(String[] args) {
        //数据库操作

    }
    //SQL数据库连接
    public static Connection getConnection() throws Exception {
        //加载驱动程序
        Class.forName("com.mysql.jdbc.Driver");
        //连接URL为“jdbc:mysql//服务器地址/数据库名”的数据库
        String url = "jdbc:mysql://localhost:3306/test";
        //获取连接
        Connection conn = DriverManager.getConnection(url, "root", "123456");
        return conn;
    }


}