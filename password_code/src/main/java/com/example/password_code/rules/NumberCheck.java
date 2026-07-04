package com.example.password_code.rules;

public class NumberCheck implements passwordRule {
    @Override
    public boolean checkPassword(String password) {
        //needs at least one number
        for(char c : password.toCharArray() ) {
            if(Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}
