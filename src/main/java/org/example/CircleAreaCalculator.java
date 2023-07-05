package org.example;

public class CircleAreaCalculator {
    public Double radio;
    private Double area;

    public CircleAreaCalculator(Double radio) {
        this.radio = radio;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }
    public Double calculateArea(){
        Double area = Math.PI * Math.pow(this.radio, 2);
        setArea(area);
        System.out.println("The area of the circumference is: "+area);
        return getArea();
    }
}