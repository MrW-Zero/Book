package com.wztcode.utils;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 连接和关闭数据库工具类
 */
@SuppressWarnings({"all"})
public class JdbcUtils {
    /**
     * 连接数据库
     * @return 如果返回为 null, 则表示连接失败, 反之, 成功
     */
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/book";
            String username = "root";
            String password = "123456";
            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * 关闭数据库连接
     * @param connection 连接
     * @throws SQLException
     */
    public static void close(Connection connection) throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
 
}



