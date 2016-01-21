package com.example.oguzc.unitconverter;

public class KilometerHourToMeterSecondConverter implements ConvertToMeterSecondCommand {
    @Override
    public double convertToMeterSecond(double amount) {

        return (1000.0d * amount) / 3600.0d;
    }
}
