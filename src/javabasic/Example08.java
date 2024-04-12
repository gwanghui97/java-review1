package javabasic;

public class Example08 {
    public static void main(String[] args) {
        /**
         * 1부터 100까지의 정수 중에서
         * 짝수만 출력하는 프로그램을 작성하세요.
         */
        //1부터 100까지 나머지가 0이라면 -> 짝수 -> 출력
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
