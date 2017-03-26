package nl.hu.iac.service;

import nl.hu.iac.solarpositioning.ZonnestandCalculator;

/**
 * Created by Arash on 26-Mar-17.
 */
public class ServiceProvider {
    private static ZonnestandCalculator z = new ZonnestandCalculator();
    public static ZonnestandCalculator getZonnestandService() {
        return z;
    }
}
