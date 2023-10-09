package com.ohgiraffers.section01.level01.basic;

public class Application1 {

    public static void main(String[] args) {

        /* 길이가 10인 정수형 배열을 선언 및 할당한 뒤
         * 각 인덱스에 차례대로 1부터 10까지 값을 넣고 출력하세요
         * */

        int[] ten = new int[10];

        for(int i = 0; i < ten.length; i++){
            ten[i] = i + 1;
            //ten[0] = 0 + 1, ten[1] = 1 + 1, ten[2] = 2 + 1, ten[3] = 3 + 1...
            System.out.print(ten[i] + " ");
            //ten 배열의 인덱스 0부터 9까지 출력. 1개 출력 후 공백문자를 주어서 좀 더 구분하기 좋게 하였다.
        }
    }
}
