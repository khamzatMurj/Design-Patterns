package Jdbc;
import java.sql.*;
import java.util.concurrent.Callable;

public class connection {
    private static connection connection;
    static {
        try {
            Class.forName("com.Mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}
