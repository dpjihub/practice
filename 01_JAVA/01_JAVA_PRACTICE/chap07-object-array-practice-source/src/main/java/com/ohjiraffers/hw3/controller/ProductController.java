package com.ohjiraffers.hw3.controller;

import com.ohjiraffers.hw3.model.vo.ProductDTO;

import java.util.Scanner;

public class ProductController {

    private ProductDTO[] pro;
    private static int count;

    {
        pro = new ProductDTO[10];
    }

    Scanner sc = new Scanner(System.in);

    public void mainMenu(){
    int num = 0;
        do{
            System.out.println("====== 제품 관리 메뉴 ======");
            System.out.println("1. 제품 정보 추가");
            System.out.println("2. 제품 전체 조회");
            System.out.println("9. 프로그램 종료");




            num = sc.nextInt();
        switch(num){
            case 1 : productInput();
                break;
            case 2 : productPrint();
                break;
            case 9 : break;
            default:
                System.out.println("잘못 입력하셨습니다.");
                break;
        }



        }while(num != 9);

    }

    public void productInput(){
        System.out.print("제품 번호 : ");
        int pld = sc.nextInt();
        System.out.print("제품명 : ");
        String pName = sc.next();
        System.out.print("제품 가격 : ");
        int price = sc.nextInt();
        System.out.print("제품 세금 : ");
        double tax = sc.nextDouble();

        pro[count] = new ProductDTO(pld, pName, price, tax);
        System.out.println(pro[count].information() + " 등록되었습니다.");
        count++;
    }

    public void productPrint(){
        for(int i = 0; i < count; i++){
            System.out.println(pro[i].information());
        }

    }


}
