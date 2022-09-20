package com.fundemtals.practice.world.exceptions;

public class ExceptionExample {

    public static void main(String[] args) {
        // Throwable - Top level
        // Error, Exception are level deep
        // Error - are type of throwable that cannot be handled, OutOfMemoryError - JVM cannot allocate more memory
        // Exception - the main type of exception class, are checked
        // Exceptions are mandatory to be handled

        // RuntimeException - sub class of Exception, are not checked exception, not mandatory to be handled

        String myString = "abc111111";

        boolean isContains = false;
        try {
            // We try execute this statement
            isContains = myString.contains("abc");
        } catch (RuntimeException exception) {
            // do if RuntimeException appears
            System.out.println("Runtime exception appeared");
        }

        System.out.println(isContains);

        int[] numbers = {1, 2, 3};

        try {
            System.out.println(numbers[2]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Hello from ArrayIndexOutOfBoundsException ");
        }

        // Integer cannot be assing to int in case Integer variable is null
//        int result = devide(null, 0);
        // on the background it calls result.intValue()




        Person person = new Person();
        try {
            person.setName("1annnnnn");
        } catch (SubApplicationException | NotValidNameException e) { // if you want to catch Child Exception it Must be before Parent Exception
            System.out.println("Your have provided incorrect name");
        } catch (ApplicationException applicationException) { // Is ApplicationException thrown or any SUB CLASS
            System.out.println("Generic application Exception appears");
        } catch (MyVeryStrictException e) {
            System.out.println("Length is bigger than something. " + e.getMessage() + ". Length is " + e.getNameLength());
        }
        System.out.println("====== devide =======");

        Integer result = divide(10, 5);
        System.out.println("divide result is " + result);
    }

    private static Integer divide(Integer k, Integer n) {
        try {
            // System.exit(0);
            return k / n;
        } catch (NullPointerException exception) {
            System.out.println("K cannot be null");
            return null;
        } catch (ArithmeticException exception) {
            System.out.println("It is not possible to divide on zero");
            return null;
        } finally { // This part is ALWAYS executed

            System.out.println("Finally is always here");

            // return in finally is always primary
            return 8;
            // return part is OPTIONAL
        }
    }
}
