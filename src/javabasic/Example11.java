package javabasic;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        /**
         * 사용자로부터 5명의 학생의 점수를 입력받아
         * 배열에 저장한 다음,
         * 평균 점수를 계산하여 출력하세요.
         */
        //Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        //크기 5인 studentArr double 배열 생성
        double[] studentArr = new double[5];

        //학생의 점수를 for문으로 입력 받기
        for (int i = 0; i < studentArr.length; i++) {
            System.out.print((i+1) + "번째 학생의 점수를 입력해 주세요: ");
            studentArr[i] = scanner.nextDouble();
        }

        //합은 sum, 평균은 average로 선언 후 0으로 초기화
        //합에 누적하여 더하기
        double sum = 0;
        double average = 0;
        for (int i = 0; i < studentArr.length; i++) {
            sum += studentArr[i];
        }

        //평균은 합에서 studentArr.length 길이만큼 나누기
        for (int i = 0; i < studentArr.length; i++) {
            average = sum / studentArr.length;
        }
        System.out.println("평균 점수는 " + average + "입니다.");

    }
}