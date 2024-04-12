package javabasic;

public class Example06 {
    public static void main(String[] args) {
        /**
         * && || ! 연산자를 사용하여
         * 논리 연산을 수행하는 예제를 작성하세요
         */
        //boolean형 a, b 선언 및 초기화
        boolean a = false;
        boolean b = false;

        System.out.println(a && a); //a and a
        System.out.println(a && b); //a and b
        System.out.println(b && a); //b and a
        System.out.println(b && b); //b and b

        System.out.println(a || a); //a or a
        System.out.println(a || b); //a or b
        System.out.println(b || a); //b or a
        System.out.println(b || b); //b or b

        System.out.println(!a); //not a
        System.out.println(!b); //not b
    }
}
