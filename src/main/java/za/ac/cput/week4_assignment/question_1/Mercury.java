package za.ac.cput.week4_assignment.question_1;

/**
 * Created by student on 2015/02/26.
 */
public class Mercury extends Planet {


    public Mercury(double mass, double diameter, double averageTemp, double distanceFromSun)
    {
        super(mass, diameter, averageTemp, distanceFromSun);
    }

    @Override
    public String message()
    {
        return "This is planet Mercury";
    }
}
