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
public class User {

    private String userName, userLastName, rank;   
    private long userId;
    

    public User(String userN, String userL, String  user, long id) {
        this.userName = userN;
        this.userLastName = userL;
        this.rank = user;
        this.userId = id;
    }

    

    public String getUserName() {

        return userName;
    }

    public String getUserLastName() {

        return userLastName;

    }

    public String getUserRank() {

        return rank;
    }

    public long getUserId() {

        return userId;
    }
}
