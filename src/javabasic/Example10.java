package javabasic;

import java.util.Arrays;

public class Example10 {
    public static void main(String[] args) {
        /**
         * 10개의 정수 값을 저장할 수 있는 배열을 생성하고,
         * 1부터 10까지의 합을 배열에 저장한 후, 이를 출력하세요
         */
        //크기 10인 intArr 배열 생성
        int[] intArr = new int[10];

        //i가 0부터 배열 길이보다 작을 때까지 배열에 저장하고 출력
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i + 1;
        }
        System.out.println(Arrays.toString(intArr));
    }
}