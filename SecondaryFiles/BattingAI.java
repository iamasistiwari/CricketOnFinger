package CricketOnFinger.SecondaryFiles;

import java.util.Random;
import java.util.Scanner;

public class BattingAI {
    private static int totalRuns;
    public BattingAI(){
        BattingYou.totalRuns = 0;
    }
    public static void start(){
        Random ran = new Random();
        Scanner in = new Scanner(System.in);
        boolean gameOver = false;
        while(!gameOver){
            System.out.println("\t\t AI total runs = "+totalRuns);
            System.out.println("Enter your bowl : ");
            int playerRun = in.nextInt();
            if(playerRun < 7){
                int aiBowl = ran.nextInt(7);
                System.out.println("AI shot : "+aiBowl);
                if(aiBowl == playerRun){
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t YOU BOWLED AI GAME-OVER !!" );
                    System.out.println("AI final score is : "+totalRuns);
                    gameOver = true;
                }else{
                    totalRuns += playerRun;
                    System.out.println("\t\t\t\tKeeping going");
                    System.out.println();
                }
            }else{
                System.out.println("Invalid bowl");
            }
        }

    }

}
