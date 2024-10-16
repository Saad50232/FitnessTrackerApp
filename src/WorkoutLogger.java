import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class WorkoutLogger {
    private Scene workoutLoggerScene;

    public WorkoutLogger(Stage stage, Scene mainMenuScene) {
        // Labels and input fields for workout type and duration
        Label typeLabel = new Label("Workout Type:");
        TextField typeField = new TextField();

        Label durationLabel = new Label("Duration (minutes):");
        TextField durationField = new TextField();

        // Log workout button
        Button logWorkoutButton = new Button("Log Workout");
        logWorkoutButton.setOnAction(e -> {
            String workoutType = typeField.getText();
            String duration = durationField.getText();
            System.out.println("Workout logged: [" + workoutType + " for " + duration + " minutes]");
        });

        // Back button to return to the main menu
        Button backButton = new Button("Back");
        backButton.setOnAction(e -> stage.setScene(mainMenuScene));

        // Layout and Scene
        VBox layout = new VBox(10);
        layout.getChildren().addAll(typeLabel, typeField, durationLabel, durationField, logWorkoutButton, backButton);
        workoutLoggerScene = new Scene(layout, 300, 200);
    }

    public Scene getWorkoutLoggerScene() {
        return workoutLoggerScene;
    }
}
