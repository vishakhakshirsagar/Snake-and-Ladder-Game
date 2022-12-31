package SnakeAndLadderGame;
import java.util.Random;
public class WelcomeMessage {

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Game");
        int player = 0;// uc1
        System.out.println("Player position => "+player);
        Random random = new Random();
        int dice = random.nextInt(6)+1;// uc2
    }
}
