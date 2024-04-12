package javabasic.ex6;

public class StringUtilMain {
    public static void main(String[] args) {
        //reverse 메서드 실행
        System.out.println(StringUtil.reverse("hello"));
        //concat 메서드 실행
        System.out.println(StringUtil.concat("hello", "java"));
        //contains 메서드 실행
        System.out.println(StringUtil.contains("hello", 'e'));

        //오버로딩된 concat 메서드 실행
        System.out.println(StringUtil.concat("hello", "java", "hello"));
        //오버로딩된 contains 메서드 실행
        System.out.println(StringUtil.contains("hello", "hel"));
    }
}
