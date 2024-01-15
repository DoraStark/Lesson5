import java.util.Arrays;


        public class Shatle {

            public static void main(String[] args) {



                int[] shatles = new int[100];

                int index = 0;
                int valueNum = 1;

                int unluckyMin1 =38;
                int unluckyMax1 =49;
                int unluckyMin2=88;
                int unluckyMax2=100;
                int unluckyMin3=138;
                int unluckyMax3=149;



                for (int i = 1; i <shatles.length+1; i++) {
                    shatles[index] = valueNum;

                    if (valueNum%10==4 || valueNum%10 == 9) {
                        shatles[index] = ++valueNum;
                    }

                    if (valueNum>=unluckyMin1 && valueNum<=unluckyMax1 ||
                            valueNum>=unluckyMin2 && valueNum<unluckyMax2 ||
                            valueNum>=unluckyMin3 && valueNum<=unluckyMax3) {

                        valueNum+=10;
                    }

                    valueNum++;
                    index+=1;
                }

                System.out.println(Arrays.toString(shatles));


            }

        }
