package com.fundemtals.practice;


public class Arrays {

    public static void main(String[] args) {
        // 0  1  2  3 ........
        int[] numbers = {1, 2, 3, 4, 5, 7, 10, 11, 16};
        int[] evenNumbers = {}; // -> { 2, 4, 10 }
        String[] stringArray = {"Hello", " ", "java", " ", "dev"};
        double[] doubles = {2.0, 6.0, 8.0, 10.0, 12.0};  // { 0.0, 0.0, 0.0, 0.0, 0.0}
        doubles[4] = 55.4;


        String s = "Hello \" from Java";
        String s2 = "Hello  from Java";
        char[] chars = s.toCharArray();


        String res = "";
        for(int i = 0; i < s.length(); i++) {
            if (chars[i] != ' ') {
                res += chars[i];
            }
        }
        System.out.println(res);

        int[][] arrayOfArrayNumbers = {
                {1, 2, 3},
                {5, 6, 7},
                {8, 11, 15}
        }; // X and Y and Z

        arrayOfArrayNumbers[1][1] = 60;

        for (int index = 0; index < arrayOfArrayNumbers.length; index++) {
            int[] liniearNumber = arrayOfArrayNumbers[index];
            printArray(liniearNumber);

            System.out.println();
        }


    }

    public static int[] getEverEvenNumber(int[] array) {
        int evenCount = 0;

        for (int value : array) {
            if (value % 2 == 0) {
                evenCount++;
            }
        }


//        for (int index = 0; index < array.length; index++) {
//            if (array[index] % 2 == 0) {
//                evenCount++;
//            }
//        }
        int[] result = new int[evenCount];

        int resultIndex = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] % 2 == 0) {
                result[resultIndex] = array[index];
                resultIndex++;
            }
        }
        return result;
    }


    public static void printArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
    }

    public static void printStringArray(String[] array) {
        System.out.println("Size of array is " + array.length);
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index]);
        }
    }

}
