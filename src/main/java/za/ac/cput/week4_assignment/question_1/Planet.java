package za.ac.cput.week4_assignment.question_1;

/**
 * Created by student on 2015/02/26.
 */
public abstract class Planet {

    private double mass;
    private double diameter;
    private double averageTemp;
    private double distanceFromSun;


    public Planet(double mass, double diameter, double averageTemp, double distanceFromSun)
    {
        this.mass = mass;
        this.diameter = diameter;
        this.averageTemp = averageTemp;
        this.distanceFromSun = distanceFromSun;
    }

    public double getMass()
    {
        return mass;
    }
    public double getDiameter()
    {
        return diameter;
    }
    public double getAveTemperature()
    {
        return averageTemp;
    }
    public double getDistanceFromSun()
    {
        return distanceFromSun;
    }


    public abstract String message();



}
