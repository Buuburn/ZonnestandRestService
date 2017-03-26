package nl.hu.iac.solarpositioning;

import nl.hu.iac.solarpositioning.AzimuthZenithAngle;
import nl.hu.iac.solarpositioning.DeltaT;
import nl.hu.iac.solarpositioning.Grena3;

import java.util.GregorianCalendar;

/**
 * Created by Arash on 20-Mar-17.
 */
public class ZonnestandCalculator {
    public AzimuthZenithAngle Calculate(int year, int month, int dayofmonth, int hourofday, int minutes, double latitude, double longtitude){
        final GregorianCalendar dateTime = new GregorianCalendar(year, month, dayofmonth, hourofday, minutes);

        AzimuthZenithAngle position = Grena3.calculateSolarPosition(dateTime, latitude, longtitude, DeltaT.estimate(dateTime));
        return position;
    }
}
