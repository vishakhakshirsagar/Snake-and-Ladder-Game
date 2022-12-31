package SnakeAndLadderGame;
import com.sun.source.tree.ContinueTree;

import java.util.Random;
public class WelcomeMessage {

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Game");
        int player = 0;// uc1
        System.out.println("Player position => " + player);
        Random random = new Random();
        int dice = random.nextInt(6) + 1;// uc2
        int game = random.nextInt(3) + 1; // uc3
        switch (game) {
            case 1:// uc4
                player = player + 0;  // No Play Case
                System.out.print(" No play! ");
                System.out.println(" Score of Player is still => " + player);
                System.out.println("");
                break;

            case 2: //uc5
                int temp = player;
                player = player + dice; // Ladder Case
                if (player > 100) {
                    int zero =0;
                    player =  zero + temp;
                    System.out.print(" Dice shows: "+dice);
                    System.out.println(" Try Again! ");
                    System.out.println(" New Score of Player is => " + player);

                } else if (player ==100) { //uc5
                    System.out.print(" Dice shows: "+dice);
                    System.out.println(" New Score of Player is => " + player);
                    System.out.println("Player won!");

                } else {
                    System.out.print(" Dice shows: "+dice);
                    System.out.println(" Its a Ladder! Move "+dice+" ahead!");
                    System.out.println(" New Score of Player is => " + player);
                    System.out.println("");
                }
                break;

            case 3:

                player = player - dice; // Snake Case

                if (player <= 0) {
                    int tempp = 0;
                    player = tempp;
                    System.out.print(" Dice shows: "+dice);
                    System.out.println(" Its a Snake! Go back 0(start) position");
                    System.out.println(" New Score of Player is => " + player);
                    System.out.println("");
                } else {
                    System.out.print(" Dice shows: " + dice);
                    System.out.println(" Its a Snake! Go back " + dice + " position");
                    System.out.println(" New Score of Player is => " + player);
                    System.out.println("");
                }
                break;
        }
        }
    }