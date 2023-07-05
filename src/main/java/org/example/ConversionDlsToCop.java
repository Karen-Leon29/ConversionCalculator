package org.example;

public class ConversionDlsToCop {
    public double dolar;
    private double peso;
    private static final double CHANGE = 4100;
    public ConversionDlsToCop(double dolar) {
        this.dolar = dolar;
    }
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double conversion(){
        double result = this.dolar * CHANGE;
        setPeso(result);
        System.out.println("The conversion of "+ dolar + " dollars to COP pesos is: "+ result);
        return getPeso();
    }
}
