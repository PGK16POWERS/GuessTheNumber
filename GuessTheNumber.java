import java.util.Scanner;
import java.lang.Math;

public class GuessTheNumber {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name");
        String name = scanner.next();

        System.out.println("Welcome, Mr " + name + ", to GuessTheNumber...."  );
        System.out.println("You must choose a number between 1 and 16 \nIf you choose correctly you'll win the game, however, if you choose incorrectly you need to keep trying");
        System.out.println("Do you Understand the game? \nEnter (y) to continue");

        System.out.println("Enter a number between 1 and 16");
        int userNum = scanner.nextInt();

        double genNum = Math.random() * 16;
        int genRound = (int) genNum;

        boolean compare = userNum == genRound;

        String response = "";

        if (compare == true) {
            System.out.println("Congratulations you chose correctly");
            System.out.println("The number you Chose was: " + userNum);
            System.out.println("The Generated number was: " + genRound);
            System.out.println("Great Job, feel free to play again");
        } else {
            System.out.println("Unfortunately you chose incorrectly");
            System.out.println("The number you Chose was: " + userNum);
            System.out.println("The Generated number was: " + genRound);
            System.out.println("feel free to play again");
        }

        System.out.println(response);

        scanner.close();
    }
}