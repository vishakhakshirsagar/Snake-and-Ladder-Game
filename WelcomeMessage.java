package SnakeAndLadderGame;
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
                System.out.print(" Dice shows: 0");
                System.out.println(" New Score of Player is => " + player);
                System.out.println("");
                break;
        }
        }
    }