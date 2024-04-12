package javabasic;

import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {
        /**
         * 다음 타입을 가진 변수를 선언하고,
         * 각각 적절한 값을 할당하세요
         * int, double, char, boolean, String
         */
        int intVariable = 2100000000;
        intVariable = Integer.MIN_VALUE;
        intVariable = Integer.MAX_VALUE;

        double doubleVariable = 0.123456789012345;
        doubleVariable = Double.MAX_VALUE;

        char charVariable = 'a';
        char charVariable2 = 'A';

        boolean isTrue = false;

        String strVariable = "Spring";
        strVariable.charAt(2);
    }
}
