package com.example.oguzc.unitconverter;

public class MeterSecondToMeterSecondConverter implements ConvertToIntendedUnitCommand,
                                                          ConvertToMeterSecondCommand {
    @Override
    public double convertToIntendedUnit(double amount) {
        return amount;
    }

    @Override
    public double convertToMeterSecond(double amount) {
        return amount;
    }
}
