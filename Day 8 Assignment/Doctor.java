package com.employee;
import java.util.Scanner;
public class Doctor extends Employee {
Scanner sc=new Scanner(System.in);
    String specialisation;
    int appointments;
    int fees;

    public void doctordetails()
    {
        System.out.println(" enter your specialisation");
        specialisation=sc.next();
        System.out.println("enter the number of appointments for the day");
        appointments=sc.nextInt();
        System.out.println(" enter the consoltation fees");
        fees=sc.nextInt();
    }
    public void patientdetails(){}
    public void equipmentsstock(){}




}
