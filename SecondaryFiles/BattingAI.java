package CricketOnFinger.SecondaryFiles;

import java.util.Random;
import java.util.Scanner;

public class BattingAI {
    public int totalRuns;
    public BattingAI(){
        this.totalRuns = 0;
    }
    public void start(){
        Random ran = new Random();
        Scanner in = new Scanner(System.in);
        boolean gameOver = false;
        while(!gameOver){
            System.out.println("\t\t AI total runs = "+totalRuns);
            System.out.println("Enter your bowl : ");
            int playerBowl = in.nextInt();
            if(playerBowl < 7){
                int aiBat = ran.nextInt(7);
                System.out.println("AI shot : "+aiBat);
                if(aiBat == playerBowl){
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t YOU BOWLED AI GAME-OVER !!" );
                    System.out.println("AI final score is : "+totalRuns);
                    gameOver = true;
                }else{
                    totalRuns += aiBat;
                    System.out.println("\t\t\t\tKeeping going");
                    System.out.println();
                }
            }else{
                System.out.println("Invalid bowl");
            }
        }
    }
    public void start(int otherRuns){
        Random ran = new Random();
        Scanner in = new Scanner(System.in);
        boolean gameOver = false;
        while(!gameOver){
            System.out.println("\t\t AI total runs = "+totalRuns);
            System.out.println("Enter your bowl : ");
            int playerBowl = in.nextInt();
            if(playerBowl < 7){
                int aiBat = ran.nextInt(7);
                System.out.println("AI shot : "+aiBat);
                if (otherRuns > totalRuns){
                    break;
                }
                else if(aiBat == playerBowl){
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t YOU BOWLED AI GAME-OVER !!" );
                    System.out.println("AI final score is : "+totalRuns);
                    gameOver = true;
                }else{
                    totalRuns += aiBat;
                    System.out.println("\t\t\t\tKeeping going");
                    System.out.println();
                }
            }else{
                System.out.println("Invalid bowl");
            }
        }

    }

}
