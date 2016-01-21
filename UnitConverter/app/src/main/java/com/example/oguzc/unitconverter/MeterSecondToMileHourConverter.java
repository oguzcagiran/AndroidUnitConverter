package com.example.oguzc.unitconverter;

public class MeterSecondToMileHourConverter implements ConvertToIntendedUnitCommand {

    @Override
    public double convertToIntendedUnit(double amount) {
        return (6.21371192E-4d * amount) / 2.7777777E-4d;
    }
}
