package za.ac.cput.week4_assignment;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.week4_assignment.PlanetAppConfig.AppConfig;
import za.ac.cput.week4_assignment.question_1.Earth;
import za.ac.cput.week4_assignment.question_1.Mercury;
import za.ac.cput.week4_assignment.question_1.Planet;
import za.ac.cput.week4_assignment.question_1.Saturn;

/**
 * Created by student on 2015/02/26.
 */
public class PlanetTest {

    private ApplicationContext apc;
    private Earth e;
    private Saturn s;
    private Mercury m;

    Planet p;
    @Before
    public void setUp() throws Exception {

        apc = new AnnotationConfigApplicationContext(AppConfig.class);
        e = (Earth) apc.getBean("earth");
        s = (Saturn) apc.getBean("saturn");
        m = (Mercury) apc.getBean("mercury");
        p = new Earth(71, 7, 5.972E14, 127563, 15, 1);
    }

    @Test
    public void testMessageMethod() throws Exception {

        Assert.assertEquals("This is planet Earth", p.message());
    }

    @Test
    public void testMass() throws Exception {

        Assert.assertEquals(5.972E24, e.getMass(), 0.1);
    }

    @Test
    public void testObject() throws Exception {

        Assert.assertEquals(s ,s);

    }
}
