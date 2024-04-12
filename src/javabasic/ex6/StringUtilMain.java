package javabasic.ex6;

public class StringUtilMain {
    public static void main(String[] args) {
        System.out.println(StringUtil.reverse("hello"));
        System.out.println(StringUtil.concat("hello", "java"));
        System.out.println(StringUtil.contains("hello", 'e'));

        System.out.println(StringUtil.concat("hello", "java", "hello"));
        System.out.println(StringUtil.contains("hello", "hel"));
    }
}
