package javabasic.ex6;

public class StringUtil {

    //하나의 String을 매개변수로 받아 그 문자열을 뒤집을 결과를 반환하는 메서드
    public static String reverse(String str) {
        String reverseString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseString += str.charAt(i);
        }
        return reverseString;
    }

    //두 개의 String을 매개변수로 받아 이를 연결한 결과를 반환하는 메서드
    public static String concat(String str1, String str2) {
        return str1 + str2;
    }

    //하나의 String과 하나의 문자를 매개변수로 받아, 주어진 문자열이 해당 문자를 포함하는지 여부를 반환
    public static boolean contains(String str, char c) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                return true;
            }
        }
        return false;
        //return str.indexOf(c) != -1; //for문을 한 줄로 축약 가능
    }

    /*
    메서드 오버로딩 실습
     */
    //concat 메서드를 오버로딩 하여, 세 개의 String을 매개변수로 받아 이를 모두 연결한 결과를 반환하는 메서드
    public static String concat(String str1, String str2, String str3) {
        return str1 + str2 + str3;
    }

    //contains 메서드를 오버로딩하여, 두 개의 String을 매개변수로 받아 두 번째 문자열이 첫 번째 문자열을 포함하는지 여부를 반환하는 메서드
    public static boolean contains(String str1, String str2) {
        for (int i = 0; i <= str2.length() - str1.length(); i++) {
            boolean currentStringIsEqual = true;
            for (int j = i; j < i + str1.length(); j++) {
                if(str2.charAt(j) != str1.charAt(j - i)) {
                    currentStringIsEqual = false;
                }
            }
            if(currentStringIsEqual) {
                return true;
            }
        }
        return false;
        //return str2.contains(str1); //for문을 한 줄로 축약 가능
    }
}
