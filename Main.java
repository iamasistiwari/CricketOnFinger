package CricketOnFinger;

import CricketOnFinger.SecondaryFiles.BattingAI;
import CricketOnFinger.SecondaryFiles.BattingYou;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Random ran = new Random();
        Scanner in = new Scanner(System.in);

        System.out.println("Choose 'h' or 't' : ");
        char ch = in.next().charAt(0);

        char char1 = 'h';
        char char2 = 't';
        int randomNumber = ran.nextInt(2);
        char result = (randomNumber == 0) ? char1 : char2;

        if(ch == result){
            System.out.println("You want the toss press |'0' Batting | |'1' Bowling | = ");
            int toDo = in.nextInt();
            if(toDo == 0){
                BattingYou.start();
            }
            if(toDo == 1){
                BattingAI.start();
            }
            else{
                System.out.println("Invalid Choose");
            }
        }else{
            int q1 = 0;
            int q2 = 1;
            int random = ran.nextInt(2);
            int result1 = (random == 0) ? q1 : q2;
            if(result1 == 0){
                System.out.println("AI won the toss he decided to 'BAT' first");
                BattingAI.start();
            }else{
                System.out.println("AI won the toss he decided to 'BOWL' first");
                BattingYou.start();
            }
        }
    }
}
