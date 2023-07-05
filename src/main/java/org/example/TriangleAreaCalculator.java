package org.example;

public class TriangleAreaCalculator {
    public Double base;
    public Double altura;
    private Double area;

    public TriangleAreaCalculator(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    public Double areaCalculate(){
        Double result = (this.base * this.altura)/2;
        setArea(result);
        System.out.println("The area of the triangle is: "+result);
        return getArea();
    }
}