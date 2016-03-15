/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibrarySystem;

//Note that the order of some of these imports matters
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dennis I, Yasir Y, Rabia A, Jurjis L, Mohammed R, Richmond Adjei
 */
public class MySQLConnection {

    Connection connection = null;
    ResultSet queryRes = null;   //Variable to contain the query result

    public MySQLConnection() {
        System.out.println("-------- Simple MySQL Connection ------------");
        startConnection();
        //runQuery();
        //closeConnection();
    }

    public void startConnection() {

        try { //Initialise the JDBC driver, with a check for it working
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("ERROR: MySQL JDBC Driver not found; is your CLASSPATH set?");
            return;
        }
        System.out.println("MySQL JDBC Driver Registered.");

        try // open the connection to the MySQL server
        {

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:8889/library", "root", "root");

        } catch (SQLException e) {
            System.out.println("ERROR: MySQL Connection Failed!");
            return;
        }
        System.out.println("Database Connected!");
    }

    public void closeConnection() {
        try { //Close the connection now we've finished with it.
            connection.close();
        } catch (SQLException e) {
            System.out.println("WARNING: Failed to close database!");
            return;
        }
        System.out.println("Database closed.");
    }

    public void runQuery(String aQuery) {
        Statement stmt = null;
        try //Create a Statement for the SQL query
        {
            stmt = connection.createStatement();
        } catch (SQLException e) {
            System.out.println("ERROR: Failed to create Statement.");
        }

        try { //Try to run the query
            queryRes = stmt.executeQuery(aQuery);
            System.out.println("Query Successful");
        } catch (SQLException e) {
            System.out.println("ERROR: Cannot execute querrrrrrrrrrry.");
        }
    }

    public boolean runUpdate(String aQuery) {
        Statement stmt = null;
        try { //Create a Statement for the SQL query
            stmt = connection.createStatement();
        } catch (SQLException e) {
            System.out.println("ERROR: Failed to create Statement.");
            return false;
        }

        try { //Try to run the query
            stmt.executeUpdate(aQuery);
            System.out.println("Insert Successful");
        } catch (SQLException e) {
            System.out.println("ERROR: Cannot execute query.");
            return false;
        }
        return true;
    }

    public void readResult(String aColumn) {
        try { //Try to read the query
            while (queryRes.next()) // while there's still some more results of the query...
            {
                String result = queryRes.getString(aColumn);
                System.out.println(aColumn + " " + result);
            }
        } catch (SQLException e) {
            System.out.println("ERROR: Cannot execute query.");
        }
    }

    public ResultSet getResult() {
        return queryRes;
    }
}
