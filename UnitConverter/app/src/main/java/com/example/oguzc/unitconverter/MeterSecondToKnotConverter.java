package com.example.oguzc.unitconverter;

public class MeterSecondToKnotConverter implements ConvertToIntendedUnitCommand {
    @Override
    public double convertToIntendedUnit(double amount) {
        return amount / 0.514444d;
    }
}
