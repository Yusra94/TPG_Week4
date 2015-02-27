package za.ac.cput.week4_assignment.question_3.dip.dipviolation;

/**
 * Created by student on 2015/02/27.
 */
public class Goal {

    private int goalsScored;
    private int goalsAttempted;
    private int goalsMissed;

    private Goal(int goalsScored, int goalsAttempted, int goalsMissed)
    {
        this.goalsScored = goalsScored;
        this.goalsAttempted = goalsAttempted;
        this.goalsMissed= goalsMissed;
    }

    public int getgoalsScored()
    {
        return goalsScored;
    }

    public int getGoalsAttempted()
    {
        return goalsAttempted;
    }

    public int getGoalsMissed()
    {
        return goalsMissed;
    }
}
