package com.ohgiraffers.section02.demesional_array.level02.normal;

import java.util.Scanner;

public class Application1 {

    public static <Str> void main(String[] args) {

        /* 가로와 세로 길이를 정수형으로 입력 받아
         * 입력받은 가로 세로 길이를 이용하여 이차원 배열을 할당하고
         * 각 인덱스에는 랜덤으로 알파벳 대문자 넣어서 출력
         *
         * 단, 가로 행 혹은 세로 열은 반드시 1~10 까지의 정수를 입력해야 하고
         * 그렇지 않은 경우에는 "반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요." 출력 후
         * 가로 행 또는 세로 열을 다시 입력받을 수 있도록 한다.
         *
         * -- 입력 예시 --
         * 가로 행의 수를 입력하세요 : 5
         * 세로 열의 수를 입력하세요 : 4
         *
         * -- 출력 예시 --
         * F H Z G
         * W F O T
         * O R X V
         * W H J X
         * W S S J
         * */

        Scanner sc = new Scanner(System.in);

        while (true) { /*while문을 true설정하고 break를 만나기전까지 블록을 계속 실행하도록 한다.
        (1 ~ 10 사이의 숫자를 입력하지 않으면 다시 입력받도록 하기 위해)*/

            System.out.println("가로 행의 수를 입력하세요(1 ~ 10) : ");
            int row = sc.nextInt();
            System.out.println("세로 열의 수를 입력하세요(1 ~ 10) : ");
            int col = sc.nextInt();
            if (row >= 1 && row <= 10 && col >= 1 && col <= 10) {
                //row가 1보다 크거나 같고, 10보다 작거나 같거나, col이 1보다 크거나 같고, 10보다 작거나 같아야 아래 실행
                char[][] arr = new char[row][col]; //대문자 알파벳을 문자형 배열로 받아준다.
                for(int i = 0; i < arr.length; i++){
                    for(int j = 0; j < arr[i].length; j++) {
                        int random = (int) (Math.random() * 26) + 65; //아스키코드에서 대문자의 범위는 65 ~ 90
                        char ch = (char) random; //생성한 random 정수를 문자 변수 ch에 담아준다.
                        arr[i][j] = ch; //배열에 문자 변수 ch를 담아준다.
                        System.out.print(arr[i][j] + " ");
                    }
                    System.out.println();
                }break; //제대로 실행된 문장이므로 break로 while문을 끝낸다.
            }else { //1 ~ 10 조건이 만족하지 않으면 아래 블록을 실행하고 다시 while문을 시작한다.
                System.out.println("반드시 1 ~ 10의 정수를 입력해야합니다.");
            }
        }
    }
}

