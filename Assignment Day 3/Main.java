package com.assignment;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter five subject marks out of 100");
        int one = sc.nextInt();
        int two = sc.nextInt();
        int three = sc.nextInt();
        int four = sc.nextInt();
        int five = sc.nextInt();
        int percentage = ((one + two + three + four + five) * 100) / 500;

        System.out.println(" percentage is " + percentage);

        if (percentage >= 90) {
            System.out.println("A GRADE");

        } else if (percentage >= 80) {
            System.out.println("B GRADE");

        } else if (percentage >= 70) {
            System.out.println("C GRADE");

        } else if (percentage >= 60) {
            System.out.println("D GRADE");

        } else {
            System.out.println("FAIL");

        }


// ASSIGNMENT 2:

        employee e = new employee();
        e.getDetails();
        e.displayDetails();
    }
}

