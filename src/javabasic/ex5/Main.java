package javabasic.ex5;

public class Main {
    public static void main(String[] args) {
        //Person 타입의 p1, p2 객체 생성
        Person p1 = new Person("lee", 20);
        Person p2 = new Person("kim", 30);

        //.으로 접근하여 출력 메서드 실행
        p1.printPerson();
        p2.printPerson();

        //Book 타입의 b1, b2 객체 생성
        Book b1 = new Book("a", "qq", 10000);
        Book b2 = new Book("b", "ww", 20000);

        //.으로 접근하여 출력 메서드 실행
        b1.printBook();
        b2.printBook();
    }
}