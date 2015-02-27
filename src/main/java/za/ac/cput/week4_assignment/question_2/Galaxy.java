package za.ac.cput.week4_assignment.question_2;

import za.ac.cput.week4_assignment.question_1.Earth;

/**
 * Created by student on 2015/02/27.
 */
public class Galaxy {

    private Earth e;

    public Galaxy()
    {
        e = new Earth(71, 7, 5.972E24, 127563, 15, 1);
    }

    public int population()
    {
        return e.getHumanPopulation();
    }

    public double diameter()
    {
        return e.getDiameter();
    }

    public  double mass()
    {
        return e.getMass();
    }
}
