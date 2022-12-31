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
// 1: No play case
// 2: Ladder Case
// 3: Snake Case
        switch (game) {
            case 1 -> {                                 // No Play case
                player += 0;
                System.out.println("New Score of Player is => " + player);
            }
            case 2 -> {                                 // Ladder Case
                player = player + dice;
                System.out.println("New Score of Player is => " + player);
            }
            case 3 -> {                                 // Snake Case
                player = player - dice;
                System.out.println("New Score of Player is => " + player);
            }
        }
    }
}