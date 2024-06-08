package CricketOnFinger;
import CricketOnFinger.SecondaryFiles.BattingAI;
import CricketOnFinger.SecondaryFiles.BattingYou;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Random ran = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Choose 'h'(head) or 't'(tail) : ");
        char ch = in.next().charAt(0);

        char char1 = 'h';
        char char2 = 't';
        int randomNumber = ran.nextInt(2);
        char result = (randomNumber == 0) ? char1 : char2;

        if(ch == result){
            System.out.println("You want the toss press |'0' Batting | |'1' Bowling | = ");
            int toDo = in.nextInt();
            if(toDo == 0){
                BattingYou a1 = new BattingYou();
                a1.start();
                int playerRuns = a1.totalRuns;
                System.out.println("Now AI Batting start");
                BattingAI a2 = new BattingAI();
                a2.start(playerRuns);
                int aiRuns = a2.totalRuns;
                if (playerRuns > aiRuns){
                    System.out.println("YOU WON THE GAME");
                }
                else if(playerRuns < aiRuns){
                    System.out.println("AI WON THE GAME");
                }else {
                    System.out.println("Match is Tie");
                }
            }
            else if (toDo == 1){
                BattingAI a3 = new BattingAI();
                a3.start();
                int aiRuns = a3.totalRuns;
                System.out.println("Now your batting start");
                BattingYou a4 = new BattingYou();
                a4.start(aiRuns);
                int yoursRuns = a4.totalRuns;
                if (yoursRuns > aiRuns){
                    System.out.println("YOU WON THE GAME");
                }
                else if(yoursRuns < aiRuns){
                    System.out.println("AI WON THE GAME");
                }else {
                    System.out.println("Match is Tie");
                }
            }
            else{
                System.out.println("Invalid Choose Game Over");
            }
        }else{
            int random = ran.nextInt(2);
            if(random == 0){
                System.out.println("AI won the toss he decided to 'BAT' first");
                BattingAI a1 = new BattingAI();
                a1.start();
                int aiRuns = a1.totalRuns;

                BattingYou a2 = new BattingYou();
                a2.start(aiRuns);
                int yoursRuns = a2.totalRuns;
                if (yoursRuns > aiRuns){
                    System.out.println("YOU WON THE GAME");
                }
                else if(yoursRuns < aiRuns){
                    System.out.println("AI WON THE GAME");
                }else {
                    System.out.println("Match is Tie");
                }
            }else{
                System.out.println("AI won the toss he decided to 'BOWL' first");
                BattingYou a3 = new BattingYou();
                a3.start();
                int yoursRuns = a3.totalRuns;
                System.out.println("Now AI Batting start");
                BattingAI a4 = new BattingAI();
                a4.start(yoursRuns);
                int aiRuns = a4.totalRuns;
                if (yoursRuns > aiRuns){
                    System.out.println("YOU WON THE GAME");
                }
                else if(yoursRuns < aiRuns){
                    System.out.println("AI WON THE GAME");
                }else {
                    System.out.println("Match is Tie");
                }
            }
        }
    }
}
