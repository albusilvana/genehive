package com.Service;

/**
 * Created by silvana.albert on 5/25/15.
 */
public class AuthenticationService {
    public static final String user = "admin";
    public static final String password = "admin";

    public String authenticate(String username, String password){
        if(username.equals(user) && password.equals(password)){
            return TokenGenerator.getToken(username);
        } else{
            return "";
        }
    }

    public boolean isUserAuthenticated(String token) {
        return true;
    }

}
