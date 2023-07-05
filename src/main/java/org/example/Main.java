package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        Menu menuPrint = new Menu();
        Integer option;

        do {
            menuPrint.printMenu();
            System.out.println("Enter the number of the option you want to make: ");

            option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("Enter the degrees celcius you want to convert");
                    double centigrade = sc.nextDouble();
                    ConversionToKelvin kelvin = new ConversionToKelvin(centigrade);
                    kelvin.calculateConversion();
                    break;
                case 2:
                    System.out.println("Enter the degrees celcius you want to convert");
                    double centigrade2 = sc.nextDouble();
                    ConversionToFarenheit farenheit = new ConversionToFarenheit(centigrade2);
                    farenheit.calculateConversion();
                    break;
                case 3:
                    System.out.println("Enter the dollars you want to convert");
                    double dolar = sc.nextDouble();
                    ConversionDlsToCop change = new ConversionDlsToCop(dolar);
                    change.conversion();
                    break;
                case 4:
                    System.out.println("Enter a number to find the square of it");
                    Integer number = sc.nextInt();
                    SquareCalculator square = new SquareCalculator(number);
                    square.calculateSquare();
                    break;
                case 5:
                    System.out.println("Enter a number to find the cube of it");
                    Integer number2 = sc.nextInt();
                    CubeCalculator cube = new CubeCalculator(number2);
                    cube.cubeCalculate();
                    break;
                case 6:
                    System.out.println("Enter how much the square side measures to find your area");
                    Double lado = sc.nextDouble();
                    SquareAreaCalculator area = new SquareAreaCalculator(lado);
                    area.calculateArea();
                    break;
                case 7:
                    System.out.println("Enter how much the triangle base measures");
                    Double base = sc.nextDouble();
                    System.out.println("Enter how high the triangle is");
                    Double altura = sc.nextDouble();
                    TriangleAreaCalculator area2 = new TriangleAreaCalculator(base,altura);
                    area2.areaCalculate();
                    break;
                case 8:
                    System.out.println("Enter how much the circle radius measures");
                    Double radio = sc.nextDouble();
                    CircleAreaCalculator area3 = new CircleAreaCalculator(radio);
                    area3.calculateArea();
                    break;
            }
        } while (option != 9);
    }
}