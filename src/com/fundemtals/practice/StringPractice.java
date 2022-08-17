package com.fundemtals.practice;

public class StringPractice {
    public static void main(String[] args) {
        String s = "Hello_qwertyuio!!!!___##$$   ###"; //
        boolean isStringStarWithHello = s.startsWith("Hello");
        String sUpperCased = s.toUpperCase();
        String sLowerCased = s.toLowerCase();

        char charAt5 = s.charAt(1);
        String concatString = s.concat(" Extended String");// s + " Extended String"
        boolean endWithString = s.endsWith("#___");
        boolean stringContainSings = s.contains("AAA!!!!___##");

        String subStringFrom5 = s.substring(5);
        String subStringFrom5to10 = s.substring(1, 5);
        String s2 = "        ";
        boolean isEmpty = s2.isEmpty();
        boolean isBlank = s2.isBlank();

        String s3 = "I want \\ those \" be in console";

        char[] chars = s.toCharArray();

        String result = "";
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '!' && chars[i] != '#') {
                result = result + chars[i];
            }
        }

        String s1 = "first";
        String otherVariable = "first";
        String s4 = new String("first");

        //
        System.out.println(s1 == s4);
        System.out.println(s1.equals(s4));
    }
}
