package javabasic;

import java.util.Scanner;

public class Example04 {
    public static void main(String[] args) {
        /**
         * 사용자로부터 두 개의 숫자를 입력받아
         * 이들에 대한 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지
         * 연산의 결과를 출력
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력해 주세요: ");
        double num1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("두번째 숫자를 입력해 주세요: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("덧셈 결과는 : " + (num1 + num2));
        System.out.println("뺄셈 결과는 : " + (num1 - num2));
        System.out.println("곱셈 결과는 : " + (num1 * num2));
        //0으로 나눌 경우 -> '나눌 수 없는 수'라는 예외 메시지를 출력
        if (num2 != 0) {
            System.out.println("나눗셈 결과는 : " + (num1 / num2));
        } else {
            System.out.println("나눌 수 없는 수입니다.");
        }
    }
}
