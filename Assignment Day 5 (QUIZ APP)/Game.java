package com.quizapp;

public class Game {

    Question[] questions= new Question[3];
    Player player=new Player();

    public void initgame()
    {
        for(int i=0;i<3;i++)
        {
            questions[i]=new Question();
        }

        questions[0].question="Where is the Taj Mahal? ";
        questions[0].option1=" Delhi";
        questions[0].option2=" Agra";
        questions[0].option3=" Bhopal";
        questions[0].option4=" Haryana";
        questions[0].correctans=2;

        questions[1].question="India has the largest deposits of what in the world? ";
        questions[1].option1=" Gold";
        questions[1].option2=" Copper";
        questions[1].option3=" Mica";
        questions[1].option4=" Silver";
        questions[1].correctans=3;

        questions[2].question=" India's first satellite was named after whom?";
        questions[2].option1=" Aryabhatta";
        questions[2].option2=" Einstein";
        questions[2].option3=" APJ Abdul Kalam";
        questions[2].option4=" Bhaskara I";
        questions[2].correctans=1;


    }

    public void play()
    {
        player.getdetails();
        for(int i=0;i<3;i++)
        {
         boolean choice=questions[i].askques();
         if(choice==true)
         {
             System.out.println("Correct Answer... Bravo!!!!");
             player.score++;
         }
         else {
             System.out.println(" Ooops....Wrong Answer");
         }
        }
        System.out.println(player.name+" your score is "+player.score);

    }

}
