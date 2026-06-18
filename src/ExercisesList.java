import java.util.ArrayList;

public class ExercisesList {
    String name;
    String BenchPress;
    String DeadLift;
    String Squat;

    public static void initAthlets() {
        ExercisesList Strongman = new ExercisesList();
        Strongman.name = "Hafthor Bjornsson";
        Strongman.BenchPress = "500 lbs";
        Strongman.DeadLift = "1100 lbs";
        Strongman.Squat = "800 lbs";

        ExercisesList Boxer = new ExercisesList();
        Boxer.name = "";
        Boxer.BenchPress = "505 lbs";
        Boxer.DeadLift = "1100 lbs";
        Boxer.Squat = "800 lbs";
    }

    public static void main(String[] args) {
        ArrayList<ExercisesList> athletes = new ArrayList<>();

        ExercisesList strongman = new ExercisesList();
        strongman.name = "Hafthor Bjornsson";
        strongman.BenchPress = "500 lbs";
        strongman.DeadLift = "1100 lbs";
        strongman.Squat = "800 lbs";
        athletes.add(strongman);

        ExercisesList boxer = new ExercisesList();
        boxer.name = "Floyd Mayweather";
        boxer.BenchPress = "505 lbs";
        boxer.DeadLift = "1100 lbs";
        boxer.Squat = "800 lbs";
        athletes.add(boxer);

        System.out.println("Name\t\t\tBench Press\tDead Lift\tSquat");
        System.out.println("----\t\t\t-----------\t---------\t-----");
        for (ExercisesList athlete : athletes) {
            System.out.println(
                    athlete.name + "\t\t" + athlete.BenchPress + "\t\t" + athlete.DeadLift + "\t\t" + athlete.Squat);
        }
    }
}
