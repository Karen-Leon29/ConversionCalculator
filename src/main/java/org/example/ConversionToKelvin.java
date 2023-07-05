package org.example;

public class ConversionToKelvin {
    public double centigrade;
    private double kelvins;
    private static final double CONVERSION = 273.15;

    public ConversionToKelvin(double centigrade) {
        this.centigrade = centigrade;
        this.kelvins =0.0;
    }
    public double getKelvins() {
        return kelvins;
    }

    public void setKelvins(double kelvins) {
        this.kelvins = kelvins;
    }
    public double calculateConversion(){
        double calculate = this.centigrade + CONVERSION;
        setKelvins(calculate);
        System.out.println("The conversion of "+ centigrade + " degrees celcius to degrees kelvin is: "+ calculate);
        return getKelvins();
    }
}