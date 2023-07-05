package org.example;

public class SquareAreaCalculator {
    public Double lado;
    private Double area;

    public SquareAreaCalculator(Double lado) {
        this.lado = lado;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
    public Double calculateArea(){
        double result = this.lado * this.lado;
        setArea(result);
        System.out.println("The area of the square is: "+result);
        return getArea();
    }
}