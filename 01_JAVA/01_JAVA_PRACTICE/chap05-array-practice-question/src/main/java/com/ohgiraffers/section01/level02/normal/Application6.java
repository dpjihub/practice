package com.ohgiraffers.section01.level02.normal;

import java.util.Arrays;
import java.util.Scanner;

public class Application6 {

    public static void main(String[] args) {

        /*
         * 사용자가 입력한 값이 배열에 있는지 검색하여
         * 있으면 "OOO 치킨 배달 가능", 없으면 "OOO 치킨은 없는 메뉴입니다."를
         * 출력하세요.
         * 단, 치킨메뉴가 들어가 있는 배열은 본인이 스스로 정하세요
         *
         * ex.
         * 치킨 이름을 입력하세요 : 양념     치킨 이름을 입력하세요 : 불닭
         * 양념치킨 배달 가능              불닭치킨은 없는 메뉴입니다.
         * */
        Scanner sc = new Scanner(System.in);

        String[] chicken = {"후라이드", "핫후라이드", "양념", "간장", "마늘", "뿌링클"};

        System.out.print("치킨 이름을 입력하세요 : ");
        String order = sc.next();

//        for(int i = 0; i < chicken.length; i++){
//            if(order.equals(chicken[i])){ //입력받은 치킨이름 order가 chicken[]배열 안에 있는지 확인
//                System.out.println(chicken[i] + "치킨 배달 가능");
//            }
//
//        }

        boolean check = false; //위 주석처리한 것처럼 푸니까 "불닭치킨은 없는 메뉴입니다." 이 부분을 도저히 모르겠어서
        // 선생님 답 보고 풀이. 맨 아래 if조건식검사를 위해 check를 false로 먼저 세팅

        for (String string : chicken) {
            if (order.equals(string)) { //입력받은 치킨이름이 치킨배열에 있는지 반복문으로 돌리면서 확인
                check = true; //있으면 check를 true로 바꿔줌.
                break; //맞는 조건을 찾으면 루프를 종료하도록 하라고 인텔리제이가 추천해줘서 break 달아줌.
            }
        }
        if (check) { //조건문이 true면 아래{} 실행
            System.out.println(order + "치킨은 배달 가능 합니다.");
        }else { //그대로 false라면 아래{} 실행
            System.out.println(order + "치킨은 없는 메뉴입니다.");
        }

    }

}

