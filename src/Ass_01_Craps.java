import java.util.Random;
import java.util.Scanner;
public class Ass_01_Craps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int die1 = -1;
        int die2 = -1;
        int diceSum = 0;
        int thePoint;
        boolean playingForPoint;
        Random rand = new Random();

        boolean playing = SafeInput.getYNConfirm(sc, "Would you like to play craps?");
        while (playing) {
            die1 = rand.nextInt(6) + 1;
            die2 = rand.nextInt(6) + 1;

            diceSum = die1 + die2;
            if (diceSum == 2 || diceSum == 3 || diceSum == 12) {
                System.out.println("Die 1 = " +die1 +", Die 2 = " +die2 + ", a total of " + diceSum + ", you crapped out!");
            }else if (diceSum == 7 || diceSum == 11){
                System.out.println("Die 1 = " +die1 +", Die 2 = " +die2 + ", a total of " + diceSum + ", a natural! You win!");
            }
            else{thePoint = diceSum; playingForPoint = true;
                System.out.println("Die 1 = " +die1 +", Die 2 = " +die2 + ", a total of " + diceSum + ", the point is " + thePoint);
                while (playingForPoint) {
                    die1 = rand.nextInt(6) + 1;
                    die2 = rand.nextInt(6) + 1;
                    diceSum = die1 + die2;
                    if (diceSum == thePoint) {
                        System.out.println("Die 1 = " +die1 +", Die 2 = " +die2 + ", a total of " + diceSum + ", you matched the point, you win!");
                        playingForPoint = false;
                    }
                    else if(diceSum == 7){
                        System.out.println("Die 1 = " +die1 +", Die 2 = " +die2 + ", a total of " + diceSum + ", you lose!");
                        playingForPoint = false;
                    }
                    else;
                }
            }
                playing = SafeInput.getYNConfirm(sc,"Would you like to play again?");
                die1 = -1;
                die2 = -1;
            }
        System.out.println("Thank you for playing!");
    }
}
