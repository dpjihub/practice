package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /* 주민등록번호를 스캐너로 입력 받고 문자 배열로 저장한 뒤,
         * 성별 자리 이후부터 *로 가려서 출력하세요
         *
         * -- 입력 예시 --
         * 주민등록번호를 입력하세요 : 990101-1234567
         *
         * -- 출력 예시 --
         * 990101-1******
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("주민등록번호를 입력해주세요. 입력방식-> 000000-0000000 : ");
        String str = sc.next();
        char[] ch = new char[str.length()];

        for(int i = 0; i < ch.length - 6; i++) {
            System.out.print(str.charAt(i));
        }
        //주민등록번호 입력 자릿수를 보니 0 ~ 13 이다. 위 코드(ch.length - 6)는 총 길이에서 6을 뺀다.
        // 그러므로 뒤 6자리를 빼고 출력한다고 볼 수 있다. 결과는 990101-1 <-여기까지 출력된다.


        for(int j = 8; j < ch.length; j++) {

            System.out.print("*"); //ch 배열의 길이만큼 반복을 하되, j의 시작을 인덱스 8부터 하면 성별자리 이후부터 출력이 된다.
            //이건 출력만 * 로 해준거고, 아예 배열의 숫자를 *로 바꿔서 저장하는 방법을 뭘까?
        }

    }
}
