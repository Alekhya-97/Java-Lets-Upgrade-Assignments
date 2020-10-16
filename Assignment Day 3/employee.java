package com.assignment;
import java.util.Scanner;
public class employee {
    Scanner sc=new Scanner(System.in);
    public String name;
     public int date,month,year,age,msalary,asalary;
     float tax;

     public void getDetails(){

         System.out.println(" Enter Employee Name");
         name=sc.nextLine();
         System.out.println(" Enter your date of birth");
         date= sc.nextInt();
         System.out.println(" Enter your month(number) of birth");
         month= sc.nextInt();
         System.out.println(" Enter your year of birth");
         year= sc.nextInt();
         System.out.println("Enter your monthly salary ");
         msalary=sc.nextInt();

     }

     public void displayDetails() {
         System.out.println("Your name is "+name);

         age = 2020 - year;
         System.out.println("age is " + age);
         asalary = msalary * 12;
         System.out.println(" Anual Salary "+asalary);
         if (asalary > 500000) {
             tax = (20 * asalary) / 100;
             System.out.println("tax= " + tax);

         }
         if (asalary > 400000) {
             tax = (15 * asalary) / 100;
             System.out.println("tax= " + tax);
         }
         if (asalary > 300000) {
             tax = (10 * asalary) / 100;
             System.out.println("tax= " + tax);
         }
         if (asalary > 200000) {
             tax = (5 * asalary) / 100;
             System.out.println("tax= " + tax);
         }
     }


}
