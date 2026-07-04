package com.example.password_code.rules;

public class LowercaseChecker implements passwordRule {
    @Override
    public boolean checkPassword(String password) {
        //needs at least one lowercase character
        for(char c : password.toCharArray() ) {
            if(Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }
}
