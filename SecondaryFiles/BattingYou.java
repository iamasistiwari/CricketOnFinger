package CricketOnFinger.SecondaryFiles;

import java.util.Random;
import java.util.Scanner;

public class BattingYou {
    static int totalRuns;
    public BattingYou(){
        BattingYou.totalRuns = 0;
    }
    public int getTotalRuns(){
        return totalRuns;
    }
    public static void start(){
        Random ran = new Random();
        Scanner in = new Scanner(System.in);
        boolean gameOver = false;
        while(!gameOver){
            System.out.println("\t\t Your total runs = "+totalRuns);
            System.out.println("Enter your shot : ");
            int playerRun = in.nextInt();
            if(playerRun < 7){
                int aiBowl = ran.nextInt(7);
                System.out.println("AI bowl : "+aiBowl);
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
                System.out.println("Invalid shot");
            }
        }
    }

    public static void start(int otherRuns){
        Random ran = new Random();
        Scanner in = new Scanner(System.in);
        boolean gameOver = false;
        while(!gameOver){
            System.out.println("\t\t Your total runs = "+totalRuns);
            System.out.println("Enter your shot : ");
            int playerRun = in.nextInt();
            if(playerRun < 7){
                int aiBowl = ran.nextInt(7);
                System.out.println("AI bowl : "+aiBowl);
                if (otherRuns > totalRuns){
                    break;
                }
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
                System.out.println("Invalid shot");
            }
        }
    }
}
