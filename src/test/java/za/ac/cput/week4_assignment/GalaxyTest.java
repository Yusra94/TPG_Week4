package za.ac.cput.week4_assignment;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import za.ac.cput.week4_assignment.PlanetAppConfig.AppConfig;
import za.ac.cput.week4_assignment.question_1.Earth;

/**
 * Created by student on 2015/02/27.
 */
public class GalaxyTest {

    private ApplicationContext appCntx;
    private Earth e;

    @Before
    public void setUp() throws Exception {

        appCntx = new AnnotationConfigApplicationContext(AppConfig.class);
        e = (Earth) appCntx.getBean("earth");


    }

    @Test
    public void testEarthMass() throws Exception {

        Assert.assertEquals(5.972E24, 5.972E24, 0);

    }

    @Test
    public void testEarthDiameter() throws Exception {

        Assert.assertEquals(127563, 127563, 0);
    }
}
