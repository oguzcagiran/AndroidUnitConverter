package com.example.oguzc.unitconverter;

public class KnotToMeterSecondConverter implements ConvertToMeterSecondCommand {
    @Override
    public double convertToMeterSecond(double amount) {

        return 0.514444d * amount;
    }
}
