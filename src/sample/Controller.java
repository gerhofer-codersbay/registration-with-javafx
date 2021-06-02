package sample;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class Controller {

    private UserRepository userRepository;

    public Controller() throws SQLException {
        this.userRepository = new UserRepository();
    }

    @FXML
    private TextField userNameTextfield;
    @FXML
    private PasswordField passwordTextField;
    @FXML
    private PasswordField passwordConfirmTextField;
    @FXML
    private DatePicker birthdayTextField;
    @FXML
    private TextField firstNameTextField;
    @FXML
    private TextField lastNameTextField;

    public void register() throws SQLException {
        System.out.println("Button clicked");
        User user = new User(
                userNameTextfield.getText(),
                firstNameTextField.getText(),
                lastNameTextField.getText(),
                birthdayTextField.getValue(),
                passwordTextField.getText()
        );
        System.out.println(user);
        userRepository.save(user);
    }

}
