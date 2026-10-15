package com.pluralsight;

public class MathApp {
public static void main(String[] args) {
    // question 1:
    int bobsalary=15000;
    int garysalary=17000;
    int highestsalary= Math.max(15000,17000);
    System.out.println( "The highest salary is" + highestsalary);

    // Question 2:
    int carprice=5000;
    int truckprice=7000;
    int lowestprice= Math.min(5000,7000);
    System.out.println("The lowest price is" +lowestprice);

    // Question 3:
    double radius=7.25;
    double area = Math.PI * Math.pow (radius, 2);
    System.out.println("The area of the circle is," + area);

    // Question 4
    double number = 5.0;
    double squareRoot = Math.sqrt(number);

    System.out.println("The square root is " + squareRoot);



}
}
