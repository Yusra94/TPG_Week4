package za.ac.cput.week4_assignment.question_3.srp.srpviolation;

/**
 * Created by student on 2015/02/27.
 */
public class SoccerPlayer {

    private String name;
    private String surname;
    private int age;
    private String position;
    private double salary;
    private String team;

    public SoccerPlayer(String name, String surname, int age, String position, double salary, String team)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.position = position;
        this.salary = salary;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public String getTeam() {
        return team;
    }

    public String printData()
    {
        return team;
    }

    public double calculateAnnualSalary()
    {
        return salary*13;
    }
}
