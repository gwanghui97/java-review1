package javabasic;

import java.util.Scanner;

public class Example05 {
    public static void main(String[] args) {
        /**
         * 세 개의 다른 정수 값들을 비교하여
         * 가장 큰 수와 가장 작은 수를 결정하는 프로그램을 작성
         */
        //Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        //첫 번째 숫자 입력 받기
        System.out.print("첫 번째 숫자를 입력해주세요: ");
        int num1 = scanner.nextInt();

        //두 번째 숫자 입력 받기
        System.out.print("두 번째 숫자를 입력해주세요: ");
        int num2 = scanner.nextInt();

        //세 번째 숫자 입력 받기
        System.out.print("세 번째 숫자를 입력해주세요: ");
        int num3 = scanner.nextInt();

        //int형 numArr 배열 생성
        int[] numArr = {num1, num2, num3};
        //max와 min에 배열의 첫 번째 값으로 초기화
        int max = numArr[0];
        int min = numArr[0];

        //순회하며 max와 min 값 갱신
        for (int i = 1; i < numArr.length; i++) {
            if (numArr[i] > max) {
                max = numArr[i];
            }
            //max = Math.max(max, numArr[i]);
            if (numArr[i] < min) {
                min = numArr[i];
            }
            //min = Math.min(min, numArr[i]);
        }

        System.out.println("가장 큰 수는: " + max);
        System.out.println("가장 작은 수는: " + min);

    }
}
