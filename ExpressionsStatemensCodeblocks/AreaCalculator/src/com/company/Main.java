package com.company;

public class Main {

    public static final double INVALID_VALUE_MESSAGE = -1.0;
    public static void main(String[] args) {

        System.out.println(Area(5));
        System.out.println(Area(5,2));

    }
    public static double Area (double radius){
        if (radius < 0){
            return INVALID_VALUE_MESSAGE;
        }

         double areaCircle = Math.PI * (radius*radius);
         return  areaCircle;
    }
    public static double Area (double x, double y){
        if (x < 0 || y < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        double areaRectangle = x * y;
        return areaRectangle;
    }
}
