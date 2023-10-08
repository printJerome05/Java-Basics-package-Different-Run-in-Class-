/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

// need to import these all to when using database
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author JeromeMarco
 */

    
    // this is the main coonection for the database mysql
    public class DatabaseConnection {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/databasename"; //test is the databasename. for this im using mysqldatabase
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "password";

    // static means it can only be accesible by the class cannot be isntatiated
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }
}
    

