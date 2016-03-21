/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibrarySystem;

/**
 *
 * @author Jurijs
 */
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Jurijs
 */
public class DBManager {

    private String userName;
    private String userLastName;
    private String userPosition;
    private long userId;
    private char[] password;

    MySQLConnection myConnection = new MySQLConnection();
    ResultSet result;

    public DBManager(String name, String lName, long id, char[] pass, String position) {

        userId = id;
        userName = name;
        userLastName = lName;
        userPosition = position;
        password = pass;
    }

    public DBManager(String name, char[] pass) {

        userName = name;
        password = pass;
    }

    public DBManager(String name) {
        userName = name;
    }

    public DBManager(long id) {
        userId = id;

    }

    public DBManager() {

    }

    public Boolean logIn() {
        String logInQuery = "SELECT * FROM users WHERE userName = '" + userName + "'";
        runQuery(logInQuery);
        int passwordLength = getPasswordLength(result);
        char[] dbPassword = new char[passwordLength];
        try { //Try to read the query Result Set
            result.first(); //Move pointer to start
            for (int i = 0; i < passwordLength; i++) {
                char pwChar = result.getString("userPassword").charAt(i);
                dbPassword[i] = pwChar;
            }
        } catch (SQLException e) {
            System.out.println("ERROR @logIn: Cannot execute read query.");
        }
        if (Arrays.equals(password, dbPassword)) {
            System.out.println("Passwords Match");
            Arrays.fill(password, '0');
            Arrays.fill(dbPassword, '0');
            return true;
        }
        return false;
    }

    public Boolean register() {
        String strPassword = "";
        for (int i = 0; i < password.length; i++) {
            strPassword += Character.toString(password[i]);
        }
        String registerQuery = "INSERT INTO users (userName, userLastName, userId, userPassword, userPosition) "
                + "VALUES ('" + userName + "' , '" + userLastName + "' , '" + userId + "' , '" + strPassword + "' , '" + userPosition + "');";
        Arrays.fill(password, '0');
        strPassword = "0";
        boolean success = myConnection.runUpdate(registerQuery);
        return success;
    }

    public Boolean registerAdmin() {
        String strPassword = "";
        for (int i = 0; i < password.length; i++) {
            strPassword += Character.toString(password[i]);
        }
        String registerQuery = "INSERT INTO users (userName, userPassword, userRank) VALUES ('" + userName
                + "' , '" + strPassword + "' , 'a');";
        Arrays.fill(password, '0');
        strPassword = "0";
        boolean success = myConnection.runUpdate(registerQuery);
        return success;
    }

    public void adminReadDB() {
        String selectAll = "SELECT userId, userName, userPosition FROM users";
        runQuery(selectAll);
        try { //Try to read the query Result Set
            while (result.next()) // while there's still some more results of the query...
            {
                String userId = result.getString("userId");
                String userName = result.getString("userName");
                String userRank = result.getString("userPosition");

                System.out.println("ID: " + userId + ", userName: " + userName
                        + ", Position: " + userRank);
            }
        } catch (SQLException e) {
            System.out.println("ERROR @adminReadDB: Cannot execute query.");
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        int counter = 1;
        ArrayList<Book> books = new ArrayList<>(counter);
        String bookIsbn = "";
        String bookTitle = "";
        String bookAuthor = "";
        String bookPublisher = "";
        int bookEdition = 0;
        String bookAvaliable = "";
        int bookLoantime = 0;
        Date bookPubDate;
        String searchTitle = "SELECT title, author, publisher, edition, isbn, pubDate, loantime, avaliable   FROM books WHERE title LIKE '" + "%" + title + "%" + "'";

        runQuery(searchTitle);

        try { //Try to read the query Result Set
            while (result.next()) // while there's still some more results of the query...
            {
                bookIsbn = result.getString("isbn");
                bookTitle = result.getString("title");
                bookAuthor = result.getString("author");
                bookPublisher = result.getString("publisher");
                bookEdition = Integer.parseInt(result.getString("edition"));
                bookAvaliable = result.getString("avaliable");
                bookLoantime = Integer.parseInt(result.getString("loanTime"));
                bookPubDate = result.getDate("pubDate");

                books.add(new Book(bookTitle, bookAuthor, bookPublisher, bookAvaliable, bookIsbn, bookEdition, bookLoantime, bookPubDate));
                counter++;

                System.out.println("isbn: " + bookIsbn + ", title:" + bookTitle + ", author: " + bookAuthor
                        + ", publisher: " + bookPublisher + ", edition: " + bookEdition);
            }
        } catch (SQLException e) {
            System.out.println("ERROR @adminReadDB: Cannot execute query.");
        }
        return books;
    }

    public String getPassword() {
        String getPassword = "SELECT userPassword FROM users WHERE userName = '" + userName + "'";
        runQuery(getPassword);
        String thePassword = "";
        try { //Try to read the query Result Set
            result.first(); //Move pointer to start
            thePassword = result.getString("userPassword");
        } catch (SQLException e) {
            System.out.println("ERROR @getPassword: Cannot execute read query.");
        }
        return thePassword;
    }

    public int getPasswordLength(ResultSet result) {
        int passwordLength = 0;
        try { //Try to read the query Result Set
            result.first();
            passwordLength = result.getString("userPassword").length();
        } catch (SQLException e) {
            System.out.println("ERROR @getPasswordLength: Cannot execute read query.");
        }
        return passwordLength;
    }

    public Boolean validateUserId() {
        String validateID = "SELECT * FROM users WHERE userId = '" + userId + "'";
        runQuery(validateID);
        try { //Try to read the query Result Set
            result.first(); //Move pointer to start
            String userLogIn = result.getString("userId");
            if (userLogIn.equals(userId)) {
                return false; //Means UserId Exists
            }
        } catch (SQLException e) {
            //If query did not get a result (userName doesn't match any row).
            System.out.println("ERROR @validateId: Cannot execute read query.");
        }
        return true;
    }

    public Boolean validateName() {
        String validateName = "SELECT * FROM users WHERE userName = '" + userName + "'";
        runQuery(validateName);
        try { //Try to read the query Result Set
            result.first(); //Move pointer to start
            String userLogIn = result.getString("userName");
            if (userLogIn.equals(userName)) {
                return false; //Means Username Exists
            }
        } catch (SQLException e) {
            //If query did not get a result (userName doesn't match any row).
            System.out.println("ERROR @validateName: Cannot execute read query.");
        }
        return true;
    }

    public String getUserRank() {
        String userRank = "SELECT userStatus FROM users WHERE userName = '" + userName + "'";
        runQuery(userRank);
        String userPosition = "student";
        try { //Try to read the query Result Set
            result.first(); //Move pointer to start
            userRank = result.getString("userStatus");
        } catch (SQLException e) {
            System.out.println("ERROR @getUserRank: Cannot execute read query.");
        }
        return userRank;
    }

    public String getUserLastName() {

        String userLast = "SELECT userLastName FROM users WHERE userName  = '" + userName + "'";
        runQuery(userLast);
        String lastName = "ln";
        try { //Try to read the query Result Set
            result.first(); //Move pointer to start
            lastName = result.getString("userLastName");
        } catch (SQLException e) {
            System.out.println("ERROR @getUserLastName: Cannot execute read query.");
        }
        return lastName;

    }

    public long getUserId() {
        String personId = "SELECT id FROM users WHERE userName = '" + userName + "'";
        runQuery(personId);
        long userId = 0;
        try { //Try to read the query Result Set
            result.first(); //Move pointer to start
            userId = result.getInt("id");
            System.out.println(userId);
        } catch (SQLException e) {
            System.out.println("ERROR @getUSerId: Cannot execute read query.");
        }
        return userId;
    }

    private void runQuery(String theQuery) {
        myConnection.runQuery(theQuery);
        result = myConnection.getResult();
    }

    public String getUserName() {
        return userName;
    }

    //Other SQL Methods
    //Other Admin Methods
}
