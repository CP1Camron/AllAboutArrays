package com.LickingHeights;

public class Main {

    public static void main(String[] args) {

        int size = 10;
        int lowestNumber = 80;
        int highestNumber = 90;


              int[] array = createNumberArray(size, lowestNumber, highestNumber);

              System.out.println("The sum of the array is "+sum(array));

    }

    public static int[] createNumberArray(int size, int lowestNumber, int highestNumber) {
        int[] array = new int[size];

        //fill with random values
        for (int i = 0; i < size; i++) {
            array[i] = createRandomNumber(lowestNumber, highestNumber);
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int createRandomNumber(int lowestNumber, int highestNumber) {

        int number = (int) ((Math.random() * (highestNumber - lowestNumber + 1)) + lowestNumber);
        return number;
    }

    public static void Pattern1() {
        for (int rows = 0; rows < 6; rows++) {
            for (int columns = 0; columns < 6; columns++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void Pattern2() {
        for (int patten = 1; patten < 7; patten++)
            for (int rows = 0; rows < 1; rows++) {
                for (int columns = 0; columns < 6; columns++) {
                    System.out.print(patten);

                }

                System.out.println();
            }
    }

    public static void Pattern3() {
        for (int rows = 0; rows < 6; rows++) {
            for (int columns = 1; columns < 7; columns++) {
                System.out.print(columns);

            }
            System.out.println();

        }


    }

    public static void Pattern4() {
        for (int rows = 1; rows < 7; rows++) {
            for (int columns = 0; columns < rows; columns++) {
                System.out.print("*");


            }
            System.out.println();

        }
    }

        public static void Pattern5 () {
            for (int rows = 2; rows < 8; rows++) {
                for (int columns = 1; columns < rows; columns++) {
                    System.out.print(columns);


                }
                System.out.println();
            }
        }

            public static int sum(int[] array){
                int sum = 0;

                for(int i=0; i<array.length; i++ ){
                    sum += array [i];

                }
                return sum;
            }


        }

