package za.ac.cput.week4_assignment.question_1;

/**
 * Created by student on 2015/02/26.
 */
public class Saturn extends Planet {

    private double ringWidth;

    public Saturn(double ringWidth, double mass, double diameter, double averageTemp, double distanceFromSun)
    {
        super(mass, diameter, averageTemp, distanceFromSun);
    }

    public double getRingWidth()
    {
        return ringWidth;
    }

    @Override
    public String message()
    {
        return "This is planet Saturn";
    }


}
