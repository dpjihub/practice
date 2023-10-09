package com.ohgiraffers.section01.level01.basic;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /* 길이가 5인 String 배열을 선언하고
         * "딸기", "바나나", "복숭아", "키위", "사과" 로 초기화를 하고
         * 스캐너로 0부터 4까지의 정수를 입력 받아
         * 해당 정수의 인덱스에 있는 과일을 출력하세요
         *
         * 단, 배열의 인덱스 범위를 벗어나는 경우 "준비된 과일이 없습니다." 를 출력하세요
         *
         * -- 입력 예시 --
         * 0부터 4까지의 정수를 입력하세요 : 2
         *
         * -- 출력 예시 --
         * 복숭아
         *
         * -- 입력 예시 --
         * 0부터 4까지의 정수를 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 준비된 과일이 없습니다.
         * */

        String[] fruits = new String[5];
        fruits[0] = "딸기";
        fruits[1] = "바나나";
        fruits[2] = "복숭아";
        fruits[3] = "키위";
        fruits[4] = "사과";

        Scanner sc = new Scanner(System.in);
        System.out.print("0 ~ 4까지의 숫자를 입력해주세요 : ");
        int num = sc.nextInt();

        if(num > fruits.length){ //입력한 숫자가 후르츠배열의 길이보다 크면 출력하도록 설정. 0~4를 넣어야하므로 5이상부터 출력됨.
            System.out.println("준비된 과일이 없습니다.");
        }//이 부분은 뭔가 더 좋은 방법이 있을 것 같다. 일단은 되긴 됐는데..
        for(int i = 0; i < fruits.length; i++){
            if(num == i){
                System.out.println(fruits[i]);
                //num을 0부터 배열 길이만큼 반복시키면 i는 0 1 2 3 4의 값을 한번씩 갖게 되고
                //입력받은 num이 2라고 가정하면 2에서 한번 if문이 true가 되어 {}문장을 실행한다.
                //i가 2일 때 sout문장을 실행하므로 furits[i]도 그 시점에서는 2이다.
                //그래서 결국은 fruits[2]가 출력되어 "복숭아"가 나올 것이다.
            }
        }
    }



}

