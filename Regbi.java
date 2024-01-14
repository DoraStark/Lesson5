import java.util.Arrays;
import java.util.Random;

public class Regbi {
    public static void main(String[] args) {

        Random random = new Random();

        int[] team1 = new int[25];
        int[] team2 = new int[25];
        int minAge = 18;
        int maxAge = 40;

        for(int i=0; i<=team1.length-1; i++){
            team1[i] = random.nextInt(maxAge-minAge)+minAge;

        }
        System.out.println("Вік гравців першої команди: "+Arrays.toString(team1));

        for(int i=0; i<=team2.length-1; i++){
            team2[i] = random.nextInt(maxAge-minAge)+minAge;

        }
        System.out.println("Вік гравців другої команди: "+Arrays.toString(team2));
    }



    }






