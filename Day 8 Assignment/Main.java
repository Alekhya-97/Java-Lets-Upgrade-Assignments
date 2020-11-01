package com.employee;

public class Main {

    public static void main(String[] args) {

        Doctor[] doctor= new Doctor[3];
        Engineer[] engineer=new Engineer[4];
        Pilot[] pilot=new Pilot[3];

        for(int i=0;i<3;i++){
            doctor[i]=new Doctor();
            doctor[i].displaydetails();
        }
    }
}
