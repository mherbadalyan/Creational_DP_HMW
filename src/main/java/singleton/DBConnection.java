package singleton;

import java.sql.*;
public class DBConnection {

    private static DBConnection DB_instance;
    private final String DRIVER_URL = "com.mysql.cj.jdbc.Driver";
    private final String DATABASE_URL = "jdbc:mysql://localhost:3306/airport_jdbc";
    private final String USERNAME = "root";
    private final String PASSWORD = "root";
    private DBConnection(){
    }

    public static DBConnection getDBConnection() {
        if (DB_instance == null) {
            DB_instance = new DBConnection();
        }
        return DB_instance;
    }

    public Connection createConnection(){
        try {
            Class.forName(DRIVER_URL);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not loaded");
        }
        try {
            return DriverManager.getConnection(DATABASE_URL,
                    USERNAME, PASSWORD);
        } catch (SQLException throwables) {
            System.out.println("Can't get connection, " +
                    "credentials are probably wrong");
        }
        return null;
    }
}
