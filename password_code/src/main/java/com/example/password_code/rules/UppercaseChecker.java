package com.example.password_code.rules;

public class UppercaseChecker implements passwordRule {
    @Override
    public boolean checkPassword(String password) {
        //needs at least one uppercase character
        for(char c : password.toCharArray() ) {
            if(Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }
}
