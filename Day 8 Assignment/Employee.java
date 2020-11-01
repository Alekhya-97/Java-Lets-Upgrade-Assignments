package com.employee;
import java.util.Scanner;

public class Employee {

    Scanner sc= new Scanner(System.in);
    String name;
    int age;
    double salary;
    String designation;


    public void getdetails()
    {

        System.out.println("Enter your name ");
        name=sc.next();
        System.out.println("Enter your age ");
        age=sc.nextInt();
        System.out.println("Enter your salary ");
        salary=sc.nextDouble();
        System.out.println("Enter your designation ");
        designation=sc.nextLine();

    }


    public void displaydetails()
    {
        System.out.println(name+" "+age+" "+salary+" "+designation);

    }
}
