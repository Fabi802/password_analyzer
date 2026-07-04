package com.example.password_code.rules;

public class LengthChecker implements passwordRule {
    @Override
    public boolean checkPassword(String password) {
        //secure passwort needs to be at least 6 characters long
        return password.length() >= 6;
    }
}
