package org.example;

public class SquareCalculator {
    public Integer number;
    private Integer square;

    public SquareCalculator(Integer number) {
        this.number = number;
    }
    public Integer getSquare() {
        return square;
    }
    public void setSquare(Integer square) {
        this.square = square;
    }
    public Integer calculateSquare(){
        Integer result = number * number;
        setSquare(result);
        System.out.println("the square of "+number+" is: "+result);
        return getSquare();
    }
}
