package com.example.oguzc.unitconverter;

public class MileHourToMeterSecondConverter implements ConvertToMeterSecondCommand {
    @Override
    public double convertToMeterSecond(double amount) {
        return (1609.344d * amount) / 3600.0d;
    }
}
