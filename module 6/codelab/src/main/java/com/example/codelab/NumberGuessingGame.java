package com.example.codelab;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Random;

public class NumberGuessingGame extends Application {
    private int randomNumber;
    private int attemptCount;
    private Label feedbackLabel;

    private Label attemptLabel;
    private Button guessButton;
    private TextField guessField;

    @Override
    public void start(Stage primaryStage) {
        // Initialize random number and attempt counter
        randomNumber = new Random().nextInt(100) + 1; // Random number between 1 and 100
        attemptCount = 0;

        // Create UI components
        Label titleLabel = new Label("Guess number 1-100");
        titleLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");

        guessField = new TextField();
        guessField.setPromptText("Enter Guess Number");
        guessField.setMaxWidth(150);

        guessButton = new Button("Try guess!");
        feedbackLabel = new Label("Enter number to start!");
        attemptLabel = new Label("Number of Attempts: 0");

        // Set button action
        guessButton.setOnAction(e -> handleGuess());

        // Layout setup using VBox and HBox
        HBox inputBox = new HBox(10, new Label("Guess Number:"), guessField, guessButton);
        inputBox.setAlignment(Pos.CENTER);

        VBox root = new VBox(15, titleLabel, inputBox, feedbackLabel, attemptLabel);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20));
        root.setStyle("-fx-background-color: #f0f0f0;");

        // Create scene and set stage
        Scene scene = new Scene(root, 400, 250);
        primaryStage.setTitle("Guess Number");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void handleGuess() {
        try {
            // Get user input
            int guess = Integer.parseInt(guessField.getText());
            attemptCount++;
            attemptLabel.setText("Total Attempts: " + attemptCount);

            // Check guess against random number
            if (guess < 1 || guess > 100) {
                feedbackLabel.setText("Enter number between 1-100!");
            } else if (guess > randomNumber) {
                feedbackLabel.setText("Too Big!");
            } else if (guess < randomNumber) {
                feedbackLabel.setText("Too small!");
            } else {
                feedbackLabel.setText("Right Guess!");
                guessButton.setText("Play again");
                guessButton.setOnAction(e -> resetGame());
            }
        } catch (NumberFormatException ex) {
            feedbackLabel.setText("Enter a valid number!");
        }
        guessField.clear();
    }

    private void resetGame() {
        // Reset game state
        randomNumber = new Random().nextInt(100) + 1;
        attemptCount = 0;
        feedbackLabel.setText("Enter number to start!");
        attemptLabel.setText("Total attempts: 0");
        guessButton.setText("Try guess!");
        guessButton.setOnAction(e -> handleGuess());
    }

    public static void main(String[] args) {
        launch(args);
    }
}