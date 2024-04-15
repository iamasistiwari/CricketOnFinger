package CricketOnFinger;

import CricketOnFinger.SecondaryFiles.Batting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Press '0' for batting || Press '1' for batting :- ");
        int toDo = in.nextInt();

//        if(toDo == 0){
//            Batting.start();
//        }
        if(toDo == 1){
            Batting.start();
        }
        else{
            System.out.println("Invalid Choose");
        }
    }
}
