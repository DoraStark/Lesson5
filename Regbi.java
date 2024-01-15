import java.util.Arrays;
import java.util.Random;

public class Regbi {
    public static void main(String[] args) {

        Random random = new Random();

        int[] team1 = new int[25];
        int[] team2 = new int[25];
        int minAge = 18;
        int maxAge = 40;
        int average1=0;
        int average2=0 ;

        for(int i=0; i<team1.length; i++){
            team1[i] = random.nextInt(maxAge-minAge)+minAge;
        }

        System.out.println("Вік гравців першої команди: "+(Arrays.toString(team1)));

        for (int age1 :team1) {
            average1+=age1;}

        average1/=team1.length;


        for(int i=0; i<team2.length; i++){
            team2[i] = random.nextInt(maxAge-minAge)+minAge;
        }

        System.out.println("Вік гравців другої команди: "+(Arrays.toString(team2)));

        for (int age2 :team2) {
            average2+=age2;
        }

        average2/=team2.length;




        System.out.println("Середній вік гравців першої команди: "+(average1));

        System.out.println("Середній вік гравців другої команди: "+(average2));

    }
}
