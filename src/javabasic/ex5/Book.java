package javabasic.ex5;

public class Book {
    //제목
    public String title;
    //저자
    public String author;
    //가격
    public int price;

    //제목, 저자, 가격을 파라미터로 받는 생성자
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    //이를 출력할 수 있는 메서드
    public void printBook() {
        System.out.println("제목 : " + title + ", 저자 : " + author + ", 가격 : " + price);
    }
}