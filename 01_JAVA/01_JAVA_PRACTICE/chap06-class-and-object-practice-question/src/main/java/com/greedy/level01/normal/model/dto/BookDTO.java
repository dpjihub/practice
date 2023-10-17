package com.greedy.level01.normal.model.dto;

import com.sun.jdi.connect.Connector;

public class BookDTO {
    private String title;
    private String publisher;
    private String author;
    private int price;
    private double discountRate;

    public BookDTO() {
        System.out.println("기본생성자 호출됨");
    }

    public BookDTO (String title, String publisher, String author){
        this.title = title;
        this.publisher = publisher;
        this.author = author;
    }

    public BookDTO(String title, String publisher, String author, int price, double discountRate){

//        this.title = title;
//        this.publisher = publisher;
//        this.author = author;
        this(title, publisher, author);
        this.price = price;
        this.discountRate = discountRate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public void printInformation(){
        System.out.println("title = " + this.title +
                ", publisher = " +this.publisher +
                ", author = " +this.author +
                ", price = " + this.price +
                ", discountRate = " +this.discountRate);

        }
}
