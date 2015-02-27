package za.ac.cput.week4_assignment.SoftwareDesignPrinciples.srp.correction;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.week4_assignment.PlanetAppConfig.AppConfig;
import za.ac.cput.week4_assignment.question_3.srp.srpcorrection.PrintPlayerData;
import za.ac.cput.week4_assignment.question_3.srp.srpcorrection.SoccerPlayer;

/**
 * Created by student on 2015/02/27.
 */
public class CorrectionTest {

    private ApplicationContext appcntx;
    private SoccerPlayer s;
    private PrintPlayerData p;

    @Before
    public void setUp() throws Exception {

        appcntx = new AnnotationConfigApplicationContext(AppConfig.class);
        s = (SoccerPlayer) appcntx.getBean("soccerPlayer");
        p = (PrintPlayerData) appcntx.getBean("printData");

    }

    @Test
    public void testName1() throws Exception {

    }

    @Test
    public void testName2() throws Exception {


    }
}
