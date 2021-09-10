package fr.damien.javafxdactylo;

import fr.damien.javafxdactylo.dao.JdbcDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Window;

import java.sql.SQLException;

public class RegisterController {
    @FXML
    private TextField nameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button submitButton;

    @FXML
    public void buttonSubmit(ActionEvent event) throws SQLException {
        System.out.println("start");

        Window owner = submitButton.getScene().getWindow();

        System.out.println(nameField.getText());
        System.out.println(passwordField.getText());
        if (nameField.getText().isEmpty()) {
            showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                "Please enter your name");
            return;
        }

        if (passwordField.getText().isEmpty()) {
            showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                "Please enter a password");
            return;
        }

        String name = nameField.getText();
        String password = passwordField.getText();

        JdbcDao jdbcDao = new JdbcDao();
        jdbcDao.insertRecord(name,  password);

        showAlert(Alert.AlertType.CONFIRMATION, owner, "Registration Successful!",
            "Welcome " + nameField.getText());
    }

    private static void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }
}

