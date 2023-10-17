package com.hw1.view;

import com.hw1.controller.LibraryManager;
import com.hw1.medel.dto.Book;
import com.hw1.medel.dto.Member;

import java.util.Scanner;

public class LibraryMenu {
    LibraryManager lm = new LibraryManager();

    Scanner sc = new Scanner(System.in);

    public void mainMenu(){


        System.out.println("회원정보를 입력해주세요.");
        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("나이 : ");
        int age = sc.nextInt();
        System.out.print("성별 : ");
        char gender = sc.next().charAt(0);

        Member mem = new Member(name, age, gender);
        lm.insertMember(mem); //위에서 입력받은 내용은 mem에 저장되고, 인서트멤버 메소드를 불러와서 mem 인자를 전달해준다.

        System.out.println("반갑습니다, " + name + "님");



        int input = 0;
        do{
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("0. 프로그램 종료하기");
            input = sc.nextInt();
            sc.nextLine();/*버퍼에 입력된 값을 읽어와 반환하며, 입력 버퍼에서 그 값을 지우는 역할을 한다.
             *따라서 다음 입력 작업에서 이전 입력 값이 의도하지 않게 남아있는 것을 방지하기 위해,
             *nextLine()을 호출하여 버퍼를 비우는 것이 좋다. InputMismatchException */

            switch (input) {
                case 1 :
                    System.out.println(lm.myInfo());
                    break;
                case 2 :
                    selectAll();
                    break;
                case 3 :
                    searchBook();
                    break;
                case 4 :
                    rentBook();
                    break;
                case 0 :
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
                    break;
            }

        }while(input != 0);


    }

    public void selectAll(){
        Book[] blist = lm.selectAll();
        for(int i = 0; i < blist.length; i++)
            System.out.println("" + i + "번 도서 : "
                    + blist[i].getTitle() + "/" + blist[i].getAuthor()
                    + "/" + blist[i].getPublisher() + "/" + blist[i].getAccessAge()
                    + "/" + blist[i].isCoupon());
    }

    public void searchBook(){
        System.out.print("검색할 도서를 입력하세요 : ");
        String keyword = sc.nextLine();
        Book[] searchList = lm.searchBook(keyword);
            for(Book b : searchList){
                if(b != null){
                if(b.getTitle().equals(keyword)){
                    System.out.println("검색하신 도서는 (" + b.toString() + ") 입니다.");

                }
                }
            }
    }
    public void rentBook(){

    }
}
