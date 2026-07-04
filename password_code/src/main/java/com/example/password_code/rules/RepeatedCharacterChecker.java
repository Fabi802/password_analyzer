package com.example.password_code.rules;

public class RepeatedCharacterChecker implements passwordRule {
    @Override
    public boolean checkPassword(String password) {
        //if 3 following character are the same return false
        int count = 1;
        for(int i = 1; i < password.length(); i++) {
            if(password.charAt(i) == password.charAt(i-1)) {
                count++;
                if(count == 3) {
                    return false;
                }
            } else {
                count = 1;
            }
        }
        return true;
    }
}
