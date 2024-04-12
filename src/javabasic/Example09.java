package javabasic;

import java.util.Scanner;

public class Example09 {
    public static void main(String[] args) {
        /**
         * 사용자로부터 숫자 n을 입력받아,
         * 1부터 n까지 합을 계산하여 출력하는 프로그램을 작성하세요.
         */
        //Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        //사용자로부터 숫자 입력 받기
        System.out.print("숫자를 입력하세요: ");
        int num = scanner.nextInt();

        //sum에 누적하여 더하여 출력
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}