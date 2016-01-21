package com.example.oguzc.unitconverter;

import java.util.HashMap;

public class Converter {

    private HashMap<String, ConvertToIntendedUnitCommand> convertToIntendedUnitCommand;
    private HashMap<String, ConvertToMeterSecondCommand> convertToMeterSecondCommand;

    private HashMap<String, ConvertToMeterSecondCommand> getConvertToMeterSecondCommand() {
        if (this.convertToMeterSecondCommand == null) {
            this.convertToMeterSecondCommand = new HashMap();
            createMeterSecondMap();
        }
        return this.convertToMeterSecondCommand;
    }

    private HashMap<String, ConvertToIntendedUnitCommand> getConvertToIntendedUnitCommand() {
        if (this.convertToIntendedUnitCommand == null) {
            this.convertToIntendedUnitCommand = new HashMap();
            createMeterSecondToIntendedMap();
        }
        return this.convertToIntendedUnitCommand;
    }

    private void createMeterSecondToIntendedMap() {
        this.convertToIntendedUnitCommand.put("KM/H", new MeterSecondToKilometerHourConverter());
        this.convertToIntendedUnitCommand.put("MILE/H", new MeterSecondToMileHourConverter());
        this.convertToIntendedUnitCommand.put("KNOT", new MeterSecondToKnotConverter());
        this.convertToIntendedUnitCommand.put("M/S", new MeterSecondToMeterSecondConverter());
    }

    private void createMeterSecondMap() {
        this.convertToMeterSecondCommand.put("KM/H", new KilometerHourToMeterSecondConverter());
        this.convertToMeterSecondCommand.put("MILE/H", new MileHourToMeterSecondConverter());
        this.convertToMeterSecondCommand.put("KNOT", new KnotToMeterSecondConverter());
        this.convertToMeterSecondCommand.put("M/S", new MeterSecondToMeterSecondConverter());
    }

    public double calculateResult(String entered, String intended, double amount) {
        return convertToIntendedUnit(intended, convertToCommonUnit(entered, amount));
    }

    private double convertToCommonUnit(String type, double amount) {
        return ((ConvertToMeterSecondCommand) getConvertToMeterSecondCommand().get(type)).convertToMeterSecond(amount);
    }

    private double convertToIntendedUnit(String type, double amount) {
        return ((ConvertToIntendedUnitCommand) getConvertToIntendedUnitCommand().get(type)).convertToIntendedUnit(amount);
    }
}
