package com.quizapp;
import java.util.Scanner;
public class Question {
Scanner sc=new Scanner(System.in);
    String question,option1,option2,option3,option4;
    int correctans,userans;

    public boolean askques()
    {

        System.out.println(question);
        System.out.println("1. "+option1);
        System.out.println("2. "+option2);
        System.out.println("3. "+option3);
        System.out.println("4. "+option4);
        userans=sc.nextInt();
        if(userans==correctans)
        {
            return true;
        }
        return false;
    }
}
