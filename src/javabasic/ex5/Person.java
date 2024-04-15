package javabasic.ex5;

public class Person {
    //이름
    public String name;
    //나이
    public int age;

    //이름과 나이를 파라미터로 받는 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //이를 출력할 수 있는 메서드
    public void printPerson() {
        System.out.println("이름 : " + name + ", 나이 : " + age);
    }
}