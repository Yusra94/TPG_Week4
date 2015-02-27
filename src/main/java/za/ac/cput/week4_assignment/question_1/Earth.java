package za.ac.cput.week4_assignment.question_1;

/**
 * Created by student on 2015/02/26.
 */
public class Earth extends Planet {

    private float percentageWaterContent;
    private int humanPopulation;

    public Earth(float percentageWaterContent, int humanPopulation, double mass, double diameter, double averageTemp, double distanceFromSun)
    {
        super(mass, diameter, averageTemp,distanceFromSun);
    }

    public double getPercentageWaterContent()
    {
        return percentageWaterContent;
    }

    public int getHumanPopulation()
    {
        return humanPopulation;
    }

    @Override
    public String message()
    {
        return "This is planet Earth";
    }

}
