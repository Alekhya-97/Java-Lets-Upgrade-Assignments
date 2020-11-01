package com.employee;
import java.util.Scanner;

public class Pilot {
    Scanner sc=new Scanner(System.in);


    String company;
    int flights;
    String rank;

    public void pilotdetails()
    {
        System.out.println("Enter your company name");
        company=sc.next();
        System.out.println("enter the number of flights for today");
        flights=sc.nextInt();
        System.out.println("enter your rank");
        rank=sc.nextLine();
    }

    public void firsttakeoff(){}



}
