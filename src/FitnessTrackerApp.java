import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FitnessTrackerApp extends Application {

    private Scene mainMenuScene;

    @Override
    public void start(Stage primaryStage) {
        // Create UI elements for username and password input
        Label usernameLabel = new Label("Username:");
        TextField usernameInput = new TextField();

        Label passwordLabel = new Label("Password:");
        TextField passwordInput = new TextField();

        Button submitButton = new Button("Submit");

        // When the submit button is clicked, create a new User instance
        submitButton.setOnAction(e -> {
            String username = usernameInput.getText();
            String password = passwordInput.getText();

            User user = new User(username, password);

            // Print the user info to the console (or use it in the app)
            System.out.println(user);

            // Proceed to the workout logger scene
            WorkoutLogger workoutLogger = new WorkoutLogger(primaryStage, mainMenuScene);
            primaryStage.setScene(workoutLogger.getWorkoutLoggerScene());
        });

        // Create the main layout and add all elements
        VBox mainMenuLayout = new VBox(10, usernameLabel, usernameInput, passwordLabel, passwordInput, submitButton);
        mainMenuScene = new Scene(mainMenuLayout, 300, 200);

        // Set the initial scene to the main menu
        primaryStage.setScene(mainMenuScene);
        primaryStage.setTitle("Fitness Tracker");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
