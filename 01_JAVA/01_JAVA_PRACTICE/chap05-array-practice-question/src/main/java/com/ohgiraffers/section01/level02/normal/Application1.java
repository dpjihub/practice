package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        /* [문자열]을 하나 입력받아 [문자 자료형] [배열로 바꾼 뒤]
         * 검색할 [문자]를 하나 입력 받아
         * 입력 받은 [검색할 문자]가 [문자열]에 [몇개] 있는지를 출력하세요
         *
         * -- 입력 예시 --
         * 문자열을 하나 입력하세요 : helloworld
         *
         * -- 출력 예시 --
         * 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개 입니다.
         * */

        /* 문자열 클래스에서 제공하는 length(), charAt() */
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 입력해주세요 : "); //hello 입력했다고 가정.
        String inputStr = sc.next(); //먼저 문자열 변수 inputStr에 사용자에게 입력 받은 문자열을 담는다.
        char[] ch = new char[inputStr.length()];
        //문자 배열을 생성하는데, 입력 받은 문자열의 길이만큼 설정한다.
        // length() 함수는 문자열의 길이를 표현하는 메소드이다.

        for(int i = 0; i < ch.length; i++){
        System.out.print(inputStr.charAt(i));
        }
        System.out.println();
        //for문으로 반복횟수를 정해준다. 현재 char[] ch = {'h', 'e', 'l', 'l', 'o'} 인데,
        //ch.length는 ch 배열의 길이를 표현하는 코드이다. 예시 문구에서 길이는 5이므로, 5번 반복된다.

            System.out.print("검색할 문자를 입력하세요 : "); //검색할 문자 'l' 로 가정
            char inputCh = sc.next().charAt(0); //문자형을 입력받아 그 문자를 char 변수 inputCh에 저장한다.
            int count = 0; //갯수를 세어주어야 하니 count 변수를 하나 만들어주고 0으로 초기화한다.
            for(int i = 0; i < ch.length; i++){
                if(inputCh == inputStr.charAt(i)){
                    count++;
                }//inputStr의 0번째 문자부터 반복해준 i번째(이 예시에서는 5번째) 문자까지 charAt()메소드로 표현해줄 수 있다.
                //if문을 통해 inputch는 현재 'l'인데, 이 'l'이 0번째부터 5번째 for문을 순회하는 동안 일치할때마다 count에 1을 더해준다.

        }System.out.println("입력하신 문자열 " + inputStr + "에서 찾으시는 문자 " + inputCh + "은(는) " + count + "개 입니다.");
    }//ch.charAt(i) 은 왜 안되는 걸까?
}








