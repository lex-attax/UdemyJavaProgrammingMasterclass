package com.company;

public class Main {

    public static void main(String[] args) {
        double cm = calcFeetAndInchesToCentimeters(50.00);
        System.out.println(cm);
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet <= 0 || inches <=0 && inches >=12) {
            return -1;
        } else {
            double sumInches = (feet * 12) + inches;
            double cm = sumInches *2.54;
            return cm;
        }
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches <= 0){
            return -1;
        } else {
            double cm = 0;
            double feet = inches / 12;
            double inchesRest = inches %12;
            return calcFeetAndInchesToCentimeters(feet, inchesRest);
         }
    }
}