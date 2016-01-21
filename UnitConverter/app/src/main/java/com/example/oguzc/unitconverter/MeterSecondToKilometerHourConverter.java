package com.example.oguzc.unitconverter;

public class MeterSecondToKilometerHourConverter implements ConvertToIntendedUnitCommand {
    @Override
    public double convertToIntendedUnit(double amount) {

        return (0.001d * amount) / 2.7777777E-4d;

    }
}
