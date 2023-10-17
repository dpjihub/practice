package com.greedy.level01.normal.book.run;

import com.greedy.level01.normal.model.dto.BookDTO;

import java.awt.print.Book;

public class Application {
    public static void main(String[] args) {
        //기본 생성자를 이용하여 인스턴스 생성 후 필드값 출력
        BookDTO bookDTO = new BookDTO();
        bookDTO.printInformation();
        System.out.println();

        //필드 3가지를 초기화하는 생성자를 이용하여 인스턴스 생성 후 필드 값 출력
        BookDTO bookDTO1 = new BookDTO("자바의 정석", "도우출판", "남궁성");
        bookDTO1.printInformation();
        System.out.println();

        //모든 필드를 초기화하는 생성자를 이용하여 인스턴스 생성 후 필드값 출력
        BookDTO bookDTO2 = new BookDTO("홍길동전", "활빈당", "허균", 5000000, 0.5);
        bookDTO2.printInformation();

    }
}
