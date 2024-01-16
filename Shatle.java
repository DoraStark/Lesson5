import java.util.Arrays;


        public class Shatle {

            public static void main(String[] args) {

                int[] shatles = new int[100];
                int valueNum = 1;
                int unluckyPart = 4;
                int increaser = 5;


                for (int i = 1; i <= shatles.length; i++) {

                    if (valueNum % 10 == 4 || valueNum % 10 == 9) {
                        valueNum = ++valueNum;
                    }

                    if (valueNum / unluckyPart == 10) {

                        valueNum += 10;
                        unluckyPart += increaser;

                    }
                    System.out.println(valueNum);
                    valueNum++;


                }
            }


        }

