package com.example.password_code;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import java.security.SecureRandom;

public class Controller{

    @FXML
    private PasswordField passwordField;

    @FXML
    private ProgressBar strengthBar;

    @FXML
    private Label resultLabel;

    @FXML
    private TextField textField;
    private boolean visible = false;

    @FXML
    private TextField generatedPasswordField;

    @FXML
    private void checkPassword() {
        String password = passwordField.getText(); //gets the user input
        PasswordStrength passwordStrength = new PasswordStrength();
        resultLabel.setText(passwordStrength.evaluate(password)); //setting the label that says how good the password is
        strengthBar.setProgress(passwordStrength.percent(password)/100.0); //setting the bar showing how good the password is
    }

    @FXML
    private void generatePassword() {
        //chooses 12 random characters
        String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+<>?";
        SecureRandom random = new SecureRandom();
        int length = 12;
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(CHARACTERS.length());
            password.append(CHARACTERS.charAt(index));
        }
        generatedPasswordField.setText(password.toString());
    }

    @FXML
    private void togglePassword() {
        //making the password visible
        if (visible) {
            passwordField.setText(textField.getText());
            passwordField.setVisible(true);
            passwordField.setManaged(true);

            textField.setVisible(false);
            textField.setManaged(false);

        } else {
            textField.setText(passwordField.getText());
            textField.setVisible(true);
            textField.setManaged(true);

            passwordField.setVisible(false);
            passwordField.setManaged(false);
        }

        visible = !visible;
    }
}