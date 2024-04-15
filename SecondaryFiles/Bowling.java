package CricketOnFinger.SecondaryFiles;

import java.util.Random;
import java.util.Scanner;

public class Bowling {
    private static int totalRuns;
    public Bowling(){
        Batting.totalRuns = 0;
    }
    public static void start(){
        Random ran = new Random();
        Scanner in = new Scanner(System.in);
        boolean gameOver = false;
        while(!gameOver){
            System.out.println("\t\t Your total runs = "+totalRuns);
            System.out.println("Enter your runs : ");
            int playerRun = in.nextInt();
            if(playerRun < 7){
                int aiBowl = ran.nextInt(7);
                System.out.println("Ai bowl : "+aiBowl);
                if(aiBowl == playerRun){
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t AI BOWLED YOU GAME-OVER !!" );
                    System.out.println("Your final score is : "+totalRuns);
                    gameOver = true;
                }else{
                    totalRuns += playerRun;
                    System.out.println("\t\t\t\tKeeping going");
                    System.out.println();
                }
            }else{
                System.out.println("Invalid runs");
            }
        }

    }

}
