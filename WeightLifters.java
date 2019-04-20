package sample;
import java.util.Random;

public class WeightLifters {
    public String name;
    public String gender;
    public String weight;
    public String benchpress;
    public String squat;
    public String deadlift;
    Random rng = new Random();
    int weightLift;

    public int getweightLift() {
        weightLift = rng.nextInt(300) + 1;
        return weightLift;
    }
}
