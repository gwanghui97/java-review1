package javabasic.ex5;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("lee", 20);
        Person p2 = new Person("kim", 30);

        p1.printPerson();
        p2.printPerson();

        Book b1 = new Book("a", "qq", 10000);
        Book b2 = new Book("b", "ww", 20000);

        b1.printBook();
        b2.printBook();
    }
}