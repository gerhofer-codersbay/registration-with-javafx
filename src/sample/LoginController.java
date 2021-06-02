package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class LoginController {

    private UserRepository userRepository;

    public LoginController() throws SQLException {
        this.userRepository = new UserRepository();
    }

    // get username & password field
    @FXML
    private TextField usernameField;
    @FXML
    private TextField passwordField;

    public void login() throws SQLException {
        boolean correct = userRepository.exists(
                usernameField.getText(),
                passwordField.getText()
        );
        if (correct) {
            usernameField.setStyle("-fx-background-color: green");
        } else {
            usernameField.setStyle("-fx-background-color: red");
        }
    }

}
