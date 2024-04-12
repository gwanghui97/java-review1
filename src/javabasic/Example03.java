package javabasic;

import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
        /**
         * 사용자로부터 이름과 나이를 입력받아
         * 그 정보를 화면에 출력하는 프로그램 작성
         *
         * 이름은 숫자가 들어오면 안됩니다.
         * 나이는 숫자만 들어와야 합니다.
         */
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        if(isNotDigit(name)) {
            System.out.println("이름에 숫자는 No!");
            return;
        }

        String age = sc.nextLine();



        if(!isDigit(age)) {
            System.out.println("No!");
            return;
        }

        System.out.printf("사용자의 이름은 %s 나이는 %s", name, age);
    }

    public static boolean isNotDigit(String str) {
        String digit = "0123456789";
        for(int i = 0; i <str.length(); i++) {
            if(digit.indexOf(str.charAt(i)) != -1) {
                return true;
            }
        }
        return false;
    }
    public static boolean isDigit(String str) {
        String digit = "0123456789";
        for(int i = 0; i <str.length(); i++) {
            if(digit.indexOf(str.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }
}