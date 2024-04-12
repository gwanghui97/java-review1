package javabasic.ex6;

public class StringUtil {

    public static String reverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }

    public static String concat(String str1, String str2) {
        return str1 + str2;
    }

    public static boolean contains(String str, char a) {
        return str.indexOf(a) != -1;
    }

    //메서드 오버로딩 실습
    public static String concat(String str1, String str2, String str3) {
        return str1 + str2 + str3;
    }

    public static boolean contains(String str1, String str2) {
        return str1.contains(str2);
    }
}
