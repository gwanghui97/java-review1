package javabasic.ex6;

public class StringUtil {

    //하나의 String을 매개변수로 받아 그 문자열을 뒤집을 결과를 반환하는 메서드
    public static String reverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }

    //두 개의 String을 매개변수로 받아 이를 연결한 결과를 반환하는 메서드
    public static String concat(String str1, String str2) {
        return str1 + str2;
    }

    //하나의 String과 하나의 문자를 매개변수로 받아, 주어진 문자열이 해당 문자를 포함하는지 여부를 반환
    public static boolean contains(String str, char a) {
        return str.indexOf(a) != -1;
    }

    /*
    메서드 오버로딩 실습
     */
    //concat 메서드를 오버로딩 하여, 세 개의 String을 매개변수로 받아 이를 모두 연결한 결과를 반환하는 메서드
    public static String concat(String str1, String str2, String str3) {
        return str1 + str2 + str3;
    }

    //contains 메서드를 오버로딩하여, 두 개의 String을 매개변수로 받아 첫 번째 문자열이 두 번째 문자열을 포함하는지 여부를 반환하는 메서드
    public static boolean contains(String str1, String str2) {
        return str1.contains(str2);
    }
}
