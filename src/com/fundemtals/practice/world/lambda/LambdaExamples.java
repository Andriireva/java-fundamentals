package com.fundemtals.practice.world.lambda;

import com.fundemtals.practice.world.Cat;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExamples {

    public static void main(String[] args) {
        ExampleFunctionInterface i = new ConvertIntegerToString();
        String s = i.doSomething(5);
        ExampleFunctionInterface i2 = new RandomCharGenerator();
        String s1 = i2.doSomething(10);


        // int * int and convert to String
        ExampleFunctionInterface i3 = ( integer -> String.valueOf(integer * integer));
        System.out.println(i3.doSomething(2));
        ExampleFunctionInterface i4 = new SelfMultiplier();
        System.out.println(i4.doSomething(2));

        System.out.println("===  Custom function interface implementation ====");

        TwoArgumentFunction plusFunction = ( (a,b) -> a + b);
        TwoArgumentFunction minusFunction = ( (a,b) -> a - b);
        TwoArgumentFunction multiplyFunction = ( (a,b) -> a * b);
//        Object anotherOne = new Object();
        // we need to assing to some Class that implements with interfaces
        // or create a lambda function () -> ....
        // or create annomious class in this line
        // TwoArgumentFunction t1 = new TwoArgumentFunction();


        System.out.println(doCalculation(5, 6d, multiplyFunction));// + / - *.....
        System.out.println(doCalculation(2L, 6, ((a, b) -> a * a * b)));// + / - *.....
        System.out.println(doCalculation(2.0f, 6, ((a, b) -> a * a * b)));// + / - *.....
        System.out.println(doCalculation(2.0f, 6, ((a, b) -> a / b)));// + / - *.....


        // lost of functional interfaces can be found in package java.util.function
        String thisValue = checkSomeThingAndReturnIf("thisValue", () -> "anotherValues");
        System.out.println(thisValue);
        System.out.println(checkSomeThingAndReturnIf(null, () -> "anotherValues2"));

        // Muliline lambda
        Supplier<String> stringSupplier = () -> {
            double res = doCalculation(1, 3, ((a, b) -> a + a + b + b));
            return "anotherValues2" + res;
        };
        System.out.println(checkSomeThingAndReturnIf(null, stringSupplier));

        // Most useful functional interfaces Predicate, Function, Supplier, Consumer

        System.out.println("===== BiFunction example ====== ");
        // Math is class that helps with "simple" calculation
        System.out.println(doCalculation2(4f, 5L, (a, b) -> Math.atan2(a, b)));

        System.out.println("===== Default method example ====== ");
        TwoArgumentFunction twoArgumentFunction = (a, b) -> a / b;
        System.out.println(twoArgumentFunction.checkOnNull( 7d, 6d));// + / - *.....

        System.out.println("===== Default method example 2 predicates ====== ");

        Cat cat = new Cat("Snow", 5, false);

        boolean isCatNameSnowAge5AndIsMultiColor;
        if (cat.getName().equals("Snow") && cat.getAge() == 5 && cat.isMultiColor()) {
            isCatNameSnowAge5AndIsMultiColor = true;
        } else {
            isCatNameSnowAge5AndIsMultiColor = false;
        }

        Predicate<Cat> catPredicate = ((c) -> c.getName().equals("Snow"));

        isCatNameSnowAge5AndIsMultiColor = catPredicate
                .and((cat1 -> cat1.getAge() == 5))
                .and((cat1 -> cat1.isMultiColor()))
                .test(cat) ;
        System.out.println(isCatNameSnowAge5AndIsMultiColor);


    }

    public static double doCalculation(Number a, Number b, TwoArgumentFunction function) {
        return function.calculate(a.doubleValue(), b.doubleValue());
    }

    public static double doCalculation2(Number a, Number b, BiFunction<Double, Double, Double> function) {
        return function.apply(a.doubleValue(), b.doubleValue());
    }

    public static String checkSomeThingAndReturnIf(String s, Supplier<String> stringSupplier) {
        if (s != null) {
            return s;
        }
        return stringSupplier.get();
    }

//    public static double doCalculation(VarargFunction function, Number... numbers) {
//
//    }
}
