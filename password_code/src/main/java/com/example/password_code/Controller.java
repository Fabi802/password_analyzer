package com.example.password_code;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;

public class Controller{

    @FXML
    private PasswordField passwordField;

    @FXML
    private ProgressBar strengthBar;

    @FXML
    private Label resultLabel;

    @FXML
    private void checkPassword() {

        String password = passwordField.getText();
        PasswordStrength passwordStrength = new PasswordStrength();
        System.out.println(passwordStrength.percent(password)/100.0);
        resultLabel.setText(passwordStrength.evaluate(password));
        strengthBar.setProgress(passwordStrength.percent(password)/100.0);


    }
}