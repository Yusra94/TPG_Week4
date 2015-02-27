package za.ac.cput.week4_assignment.PlanetAppConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.week4_assignment.question_1.Earth;
import za.ac.cput.week4_assignment.question_1.Mercury;
import za.ac.cput.week4_assignment.question_1.Planet;
import za.ac.cput.week4_assignment.question_1.Saturn;

/**
 * Created by student on 2015/02/26.
 */
@Configuration

public class AppConfig {
    @Bean(name = "earth")
    public Planet getEarthMet()
    {
        return new Earth(71, 7, 5.972E24, 127563, 15, 1);
    }

    @Bean(name = "mercury")
    public Planet getMercuryMet()
    {
        return new Mercury(328.5E21, 4879, 166.86, 5);
    }

    @Bean(name = "saturn")
    public Planet getSaturnMet()
    {
        return new Saturn(282000, 568.3E24, 120536, 139.15, 14.3);
    }
}
