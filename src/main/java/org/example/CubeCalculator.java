package org.example;

public class CubeCalculator {
    public Integer number;
    private Integer cube;
    public CubeCalculator(Integer number) {
        this.number = number;
    }
    public Integer getCube() {
        return cube;
    }
    public void setCube(Integer cube) {
        this.cube = cube;
    }
    public Integer cubeCalculate(){
        Integer result = (int) Math.pow(this.number, 3);
        setCube(result);
        System.out.println("The cube of "+number+" is: "+result);
        return getCube();
    }
}