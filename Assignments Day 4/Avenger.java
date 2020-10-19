package com.assignment3;

import java.util.Scanner;

public class Avenger {
    Scanner sc=new Scanner(System.in);
     public String name;
     public int age;
     public String power,planet,weapon;

     public void getDetail(){
         System.out.println(" Enter the avenger character name");
         name=sc.nextLine();
         System.out.println(" Enter the age");
         age=sc.nextInt();
         System.out.println("Enter the power");
         power=sc.nextLine();
         sc.nextLine();
         System.out.println("Enter the weapon");
         weapon=sc.nextLine();
         System.out.println("Enter the planet");
         planet=sc.nextLine();


     }
      public void displayDetails(){
         System.out.println(" Avenger name is "+name);
         System.out.println(" Avenger age is "+age);
         System.out.println(" Avenger power is "+power);
         System.out.println(" Avenger weapon is "+weapon);
         System.out.println(" Avenger planet is "+planet);


      }
}
