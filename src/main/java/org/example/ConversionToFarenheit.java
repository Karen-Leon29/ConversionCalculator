package org.example;

public class ConversionToFarenheit {
    public Double centigrade2;
    private Double Farenheit;
    public ConversionToFarenheit(Double centigrade) {
        this.centigrade2 = centigrade;
    }

    public Double getFarenheit() {
        return Farenheit;
    }

    public void setFarenheit(Double farenheit) {
        Farenheit = farenheit;
    }
    public Double calculateConversion (){
        double calculate = (this.centigrade2 * 9/5)+32;
        setFarenheit(calculate);
        System.out.println("The conversion of "+ centigrade2 + " degrees celcius to degrees Farenheit is: "+ calculate);
        return getFarenheit();
    }
}