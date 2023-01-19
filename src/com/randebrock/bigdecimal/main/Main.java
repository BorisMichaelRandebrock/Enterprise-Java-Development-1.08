package com.randebrock.bigdecimal.main;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        System.out.println("hi cosmos");
        /*
         BigDecimal taskEarning = new BigDecimal("0.7");
        BigDecimal fee = new BigDecimal("0.1");


        BigDecimal result = taskEarning.add(fee).setScale(2);
        BigDecimal resultAdd;
        BigDecimal resultSubtract;
        BigDecimal resultDivide;
        BigDecimal resultMultiply;

        //BigDecimal result = taskEarning.add(fee).setScale(2);
        //BigDecimal result = taskEarning.add(fee).setScale(2);


        BigDecimal ten = new BigDecimal("10");
        BigDecimal three = new BigDecimal("3");

        result = ten.divide(three,2, RoundingMode.DOWN);
        resultAdd = ten.add(three);
        resultSubtract = ten.subtract(three);
        resultDivide = ten.divide(three, 2, RoundingMode.DOWN);
        resultMultiply = ten.multiply(three);

        System.out.println(result);
        System.out.println(resultAdd);
        System.out.println(resultSubtract);
        System.out.println(resultDivide);
        System.out.println(resultMultiply);
         */

        BigDecimal bigDecimalNumber = new BigDecimal(0.111111111111);
       // System.out.println(bigDecimalNumber);
        // System.out.println(bigDecimalToDouble(bigDecimalNumber));
        System.out.println("BigDecimal to Number: " + bigDecimalToDouble(new BigDecimal(0.11111111)));
        System.out.println("Reverse - to + and vice versa: " + turnNegativePositiveViceVersa(bigDecimalNumber));
    }
        public static double bigDecimalToDouble(BigDecimal bigDecimal) {
            return bigDecimal.setScale(2, RoundingMode.HALF_UP).doubleValue();
        }
        public static BigDecimal turnNegativePositiveViceVersa(BigDecimal bigDecimal){
        return bigDecimal.setScale(1,RoundingMode.HALF_DOWN).negate();
        }

    }

