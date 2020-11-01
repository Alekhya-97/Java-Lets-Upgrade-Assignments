package com.employee;
import java.util.Scanner;

public class Engineer {

    Scanner sc=new Scanner(System.in);

    String degreein;
    String companyname;
    String post;
    Double noofworkinghrs;

    public void enegineerdetails()
    {
        System.out.println("you did your degree in what?");
        degreein=sc.next();
        System.out.println(" enter the compnay you work for?");
        companyname=sc.nextLine();
        System.out.println("enter the post in the company");
        post=sc.nextLine();
        System.out.println("enter your working hours");
        noofworkinghrs=sc.nextDouble();

    }
    public void projectdetails(){}
    public void clientdetails(){}

}
