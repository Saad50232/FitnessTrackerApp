import java.util.List;  // Import the List interface

public class WorkoutHistory {

    // Method to display workout history
    public void displayWorkoutHistory(List<Workout> workoutLog) {
        if (workoutLog.isEmpty()) {
            System.out.println("No workouts logged yet.");
        } else {
            for (Workout workout : workoutLog) {
                System.out.println(workout);
            }
        }
    }
}
