package com.assignment3;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Avenger[] av = new Avenger[5];
        for (int i = 0; i < 5; i++) {
            av[i] = new Avenger();
            av[i].getDetail();
        }
        for (int i = 0; i < 5; i++) {
            av[i].displayDetails();
        }


//ASSIGNMENT 2:

        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 0;
        array[4] = 99;
        for (int i = 0; i < 5; i = i + 2) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            } else {
                System.out.println(" ");
            }
        }


// ASSIGNMENT 3 :

          int[] ar= new int[5];
            for(int j=0;j<5;j++) {
                System.out.println("Enter a number");
                ar[j] = sc.nextInt();
            }
            int sum=ar[0]+ar[1]+ar[2]+ar[3]+ar[4];
            System.out.println("sum is "+sum);


            }

    }

