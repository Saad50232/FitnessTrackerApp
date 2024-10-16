public class Workout {
    private String type;
    private int duration;
    private int caloriesBurned;

    // Constructor
    public Workout(String type, int duration, int caloriesBurned) {
        this.type = type;
        this.duration = duration;
        this.caloriesBurned = caloriesBurned;
    }

    // Getter for type
    public String getType() {
        return type;
    }

    // Setter for type (corrected)
    public void setType(String type) {
        this.type = type;
    }

    // Getter for duration
    public int getDuration() {
        return duration;
    }

    // Setter for duration (add if needed)
    public void setDuration(int duration) {
        this.duration = duration;
    }

    // Getter for calories burned
    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    // Setter for calories burned (add if needed)
    public void setCaloriesBurned(int caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }
}
