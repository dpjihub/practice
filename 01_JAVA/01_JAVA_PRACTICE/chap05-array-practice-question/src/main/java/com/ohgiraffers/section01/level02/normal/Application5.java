package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application5 {

    public static void main(String[] args) {

        /*
         * 문자열을 입력받아 문자 하나하나를 배열에 넣고 검색할 문자가
         * 문자열에 몇 개 들어가 있는지 개수와 몇 번째 인덱스에 위치하는지
         * 인덱스를 출력하세요.
         *
         * ex.
         *	문자열 : application
         *	문자 : i
         *	application에 i가 존재하는 위치(인덱스) : 4 8
         *	i 개수 : 2
         * */
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력해주세요 : ");
        String Str = sc.next();
        char[] ch = new char[Str.length()];

        System.out.print("검색하실 문자를 입력하세요 : ");
        char search = sc.next().charAt(0);

        int count = 0;
        String sStr = "";

        for(int i = 0; i < ch.length; i++){
            if(search == Str.charAt(i)) {
                count++;
                sStr += i + " "; //이부분은 선생님 답 보고 함. 계산을 받아줄 String 타입 변수 sStr을 선언하고,
                //search (내가 입력한 문자)가 Str.charAt(i) 에 있는 부분이 i번째 이므로 그 때마다 sStr에 i를 넣어준다.
                //다음 인덱스 숫자랑 구분하도록 공백도 해준다.

            }
        }System.out.println(search + " 의 개수 : " + count);
        System.out.println(Str + "에 " + search + "가 존재하는 인덱스 : " + sStr);
    }
}
