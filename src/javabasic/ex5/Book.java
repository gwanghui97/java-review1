package javabasic.ex5;

public class Book {
    public String title;
    public String author;
    public int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void printBook() {
        System.out.println("제목 : " + title + ", 저자 : " + author + ", 가격 : " + price);
    }
}
