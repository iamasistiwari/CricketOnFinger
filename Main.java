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
                BattingYou a2 = new BattingYou();
                a2.start();
                int yoursRuns = a2.getTotalRuns();
                System.out.println("Now AI Batting start");
                BattingAI a1 = new BattingAI();
                a1.start(yoursRuns);
                int aiRuns = a1.getTotalRuns();
                if (yoursRuns > aiRuns){
                    System.out.println("YOU WON THE GAME");
                }
                if(yoursRuns < aiRuns){
                    System.out.println("AI WON THE GAME");
                }else {
                    System.out.println("Match is Tie");
                }
            }
            if(toDo == 1){
                BattingAI a1 = new BattingAI();
                a1.start();
                int aiRuns = a1.getTotalRuns();
                BattingYou a2 = new BattingYou();
                a2.start(aiRuns);
                int yoursRuns = a2.getTotalRuns();
                if (yoursRuns > aiRuns){
                    System.out.println("YOU WON THE GAME");
                }
                if(yoursRuns < aiRuns){
                    System.out.println("AI WON THE GAME");
                }else {
                    System.out.println("Match is Tie");
                }
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
                BattingAI a1 = new BattingAI();
                a1.start();
                int aiRuns = a1.getTotalRuns();

                BattingYou a2 = new BattingYou();
                a2.start(aiRuns);
                int yoursRuns = a2.getTotalRuns();
                if (yoursRuns > aiRuns){
                    System.out.println("YOU WON THE GAME");
                }
                if(yoursRuns < aiRuns){
                    System.out.println("AI WON THE GAME");
                }else {
                    System.out.println("Match is Tie");
                }
            }else{
                System.out.println("AI won the toss he decided to 'BOWL' first");
                BattingYou a3 = new BattingYou();
                a3.start();
                int yoursRuns = a3.getTotalRuns();
                System.out.println("Now AI Batting start");
                BattingAI a1 = new BattingAI();
                a1.start(yoursRuns);
                int aiRuns = a1.getTotalRuns();
                if (yoursRuns > aiRuns){
                    System.out.println("YOU WON THE GAME");
                }
                if(yoursRuns < aiRuns){
                    System.out.println("AI WON THE GAME");
                }else {
                    System.out.println("Match is Tie");
                }
            }
        }
    }
}
