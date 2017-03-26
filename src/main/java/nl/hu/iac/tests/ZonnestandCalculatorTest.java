package nl.hu.iac.tests;

import nl.hu.iac.service.ServiceProvider;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Arash on 26-Mar-17.
 */
class ZonnestandCalculatorTest {
    @Test
    void calculate() {
        assertEquals("azimuth 131.565587°, zenith angle 37.851662°", ServiceProvider.getZonnestandService().Calculate(1996, 10, 2, 4, 2, 10.2, 102).toString());
        assertEquals("azimuth 132.602819°, zenith angle 37.121178°" ,ServiceProvider.getZonnestandService().Calculate(1996, 10, 2, 4, 2, 10.2, 103).toString());
        assertEquals("azimuth 133.680847°, zenith angle 36.402992°",ServiceProvider.getZonnestandService().Calculate(1996, 10, 2, 4, 2, 10.2, 104).toString());
        assertEquals("azimuth 134.801369°, zenith angle 35.697848°",ServiceProvider.getZonnestandService().Calculate(1996, 10, 2, 4, 2, 10.2, 105).toString());
    }

}