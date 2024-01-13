import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        final int Max_Tries = 3;
        int key = random.nextInt(10);
        int numberOfTries = 3;


        System.out.println("Please, enter the number starts 0 till 10.");


        for (int i = 0; i <= Max_Tries; i++) {
            int tryNumber = scanner.nextInt();
            if (tryNumber == key) {
                System.out.println("Congratulations! You have guessed the secret number!");
                i = 3;
            }


            else if (tryNumber != key) {
                numberOfTries--;
                if(numberOfTries>0){
                    System.out.println("Fail! Try one more time. Tries left: " + numberOfTries);}

                if (numberOfTries ==0){
                    System.out.println("The amount of maximal tries = 3. You reached the limit.");
                }

            }






        }
        scanner.close();
    }

}
