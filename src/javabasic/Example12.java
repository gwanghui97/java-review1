package javabasic;

public class Example12 {
    public static void main(String[] args) {
        /**
         * 주어진 정수 배열에서
         * 최댓값과 최솟값을 찾아 출력하는 프로그램을 작성하세요
         */
        int[] intArr = {1, 5, 6, 7, 8, 9};

        int max = intArr[0];
        int min = intArr[0];

        for (int i = 1; i < intArr.length; i++) {
            if (intArr[i] > max) {
                max = intArr[i];
            } else if (intArr[i] < min) {
                min = intArr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
