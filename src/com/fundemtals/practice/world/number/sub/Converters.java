package com.fundemtals.practice.world.number.sub;

import com.fundemtals.practice.world.number.AdvancedLongConverter;
import com.fundemtals.practice.world.number.IntegerConverter;
import com.fundemtals.practice.world.number.LongConverter;

public class Converters {
    public static void main(String[] args) {
        LongConverter converter = new AdvancedLongConverter();
        IntegerConverter converter2 = new IntegerConverter();
        Long number = converter.convert("XXXXX");
        Integer number2 = converter2.convert("66");



////        if (number instanceof Long) {
////            Long longNumber = (Long) number;
//            System.out.println(number);
////        }

//        if (number2 instanceof Integer) {
//            // do our best code here
//        }

//        System.out.println(number);
    }
}
