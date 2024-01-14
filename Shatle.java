import java.util.Arrays;


public class Shatle {

    public static void main(String[] args) {


        double[] shatles = new double[100];

        for (int i = 0; i < shatles.length; i++) {
            shatles[i] = i + 1;
        }


        for (int j = 3; j < shatles.length; j += 5) {

                shatles[j] = j/(double)10;
        }

        double luckyKoef=300;
        double luckyKoef2=800;

        int counter=1;

                for(int i=39;i<49; i++){

                    shatles[i]=luckyKoef;
                        luckyKoef+=5;
                        counter++;
                        if(counter==9){
                            luckyKoef=350.0;
                        }
                    }

                counter=1;

        for(int i=89;i<99; i++){

            shatles[i]=luckyKoef2;
            luckyKoef2+=5;
            counter++;
            if(counter==9){
                luckyKoef2=850.0;
            }

        }
                    System.out.println(Arrays.toString(shatles));


                    }



                    }





























        //System.out.println(Arrays.toString(shatles));





