package com.example.praktikum6.gui;

import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import com.example.praktikum6.main.LoginSystem;
import com.example.praktikum6.users.User;

public class LoginPane extends Pane {
    private TextField nimField;
    private PasswordField passwordField;
    private ComboBox<String> roleComboBox;
    private Button loginButton;
    private Label errorLabel;
    private Stage primaryStage;

    public LoginPane(Stage stage) {
        this.primaryStage = stage;
        setMinWidth(400);
        setMinHeight(300);

        Label titleLabel = new Label("Login Sistem Lost & Found");
        titleLabel.setLayoutX(120);
        titleLabel.setLayoutY(20);

        Label nimLabel = new Label("NIM");
        nimLabel.setLayoutX(50);
        nimLabel.setLayoutY(80);

        nimField = new TextField();
        nimField.setLayoutX(150);
        nimField.setLayoutY(80);
        nimField.setPrefWidth(200);

        Label passwordLabel = new Label("Password");
        passwordLabel.setLayoutX(50);
        passwordLabel.setLayoutY(120);

        passwordField = new PasswordField();
        passwordField.setLayoutX(150);
        passwordField.setLayoutY(120);
        passwordField.setPrefWidth(200);

        Label roleLabel = new Label("Role");
        roleLabel.setLayoutX(50);
        roleLabel.setLayoutY(160);

        roleComboBox = new ComboBox<>();
        roleComboBox.getItems().addAll("Mahasiswa", "Admin");
        roleComboBox.setValue("Mahasiswa");
        roleComboBox.setLayoutX(150);
        roleComboBox.setLayoutY(160);
        roleComboBox.setPrefWidth(200);

        loginButton = new Button("Login");
        loginButton.setLayoutX(150);
        loginButton.setLayoutY(200);
        loginButton.setOnAction(e -> handleLogin());

        clButton = new Button("Click Me");
        clButton.setLayoutX(150);
        clButton.setLayoutY(200);
        clButton.setOnAction(e -> handleLogin());


        


        errorLabel = new Label("Login gagal, periksa kredensial.");
        errorLabel.setLayoutX(120);
        errorLabel.setLayoutY(240);
        errorLabel.setVisible(false);

        getChildren().addAll(titleLabel, nimLabel, nimField, passwordLabel, passwordField,
                roleLabel, roleComboBox, loginButton,clButton, errorLabel);
    }

    private void handleLogin() {
        String nim = nimField.getText();
        String password = passwordField.getText();
        String role = roleComboBox.getValue();

        User user = LoginSystem.authenticate(nim, password, role);
        if (user != null) {
            if (role.equals("Mahasiswa")) {
                MahasiswaDashboard dashboard = new MahasiswaDashboard(user);
                primaryStage.getScene().setRoot(dashboard);
            } else {
                AdminDashboard dashboard = new AdminDashboard();
                primaryStage.getScene().setRoot(dashboard);
            }
        } else {
            errorLabel.setVisible(true);
        }
    }
}