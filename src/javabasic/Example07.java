package javabasic;

import java.util.Scanner;

public class Example07 {
    public static void main(String[] args) {
        /**
         * 사용자로부터 숫자를 하나 입력받아,
         * 이 숫자가 양수인지, 음수인지, 아니면 0인지를 판단하는 프로그램을 작성하세요.
         */
        //Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        //사용자로부터 숫자를 하나 입력 받기
        System.out.print("숫자를 입력하세요: ");
        double num = scanner.nextDouble();

        //양수인지 0인지 음수인지 판단
        if (num > 0) {
            System.out.println("양수입니다.");
        } else if (num == 0) {
            System.out.println("0입니다.");
        } else {
            System.out.println("음수입니다.");
        }
    }
}
