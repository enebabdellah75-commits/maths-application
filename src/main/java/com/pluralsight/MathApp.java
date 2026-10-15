package com.pluralsight;

public class MathApp {
public static void main(String[] args) {
    // question 1:
    int bobsalary=15000;
    int garysalary=17000;
    int highestsalary= Math.max( bobsalary,garysalary);
    System.out.println( "The highest salary is" + highestsalary);

    // Question 2:
    int carprice=5000;
    int truckprice=7000;
    int lowestprice = Math.min(carprice,truckprice);
    System.out.println(" The lowest price is " +lowestprice);

    // Question 3:
    double radius=7.25;
    double area = Math.PI * Math.pow (radius, 2);
    System.out.println("The area of the circle is " + area);

    // Question 4
    double number = 5.0;
    double squareRoot = Math.sqrt(number);

    System.out.println("The square root is " + squareRoot);

    // Question 5:

    double x1 = 5;
    double y1 = 10;
    double x2 = 85;
    double y2 = 50;

    double distance = Math.sqrt(
            Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
     );

    System.out.println("The distance between the points is " + distance);

    // Question 6
    double negativeNumber = -3.8;
    double absoluteValue = Math.abs(negativeNumber);

    System.out.println("The absolute value is " + absoluteValue);

    // Question 7
    double randomNumber = Math.random();

    System.out.println("The random number is " + randomNumber);

    // Question 8
    int days = 24;
    int hoursPerDay = 24;
    int minutesPerHour = 60;
    int millisecondsPerMinute = 60000;

    int totalHours = days * hoursPerDay;
    int totalMinutes = totalHours * minutesPerHour;
    long totalMilliseconds = (long) totalMinutes * millisecondsPerMinute;

    System.out.println("There are " + totalMinutes + " minutes in 24 days.");
    System.out.println("There are " + totalMilliseconds + " milliseconds in 24 days.");





    }
}
