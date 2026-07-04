package com.example.password_code.rules;

public class SpecialChecker implements passwordRule {
    @Override
    public boolean checkPassword(String password) {
        //needs at least one special character
        for(char c : password.toCharArray() ) {
            if(!Character.isLetterOrDigit(c)) {
                return true;
            }
        }
        return false;
    }
}
