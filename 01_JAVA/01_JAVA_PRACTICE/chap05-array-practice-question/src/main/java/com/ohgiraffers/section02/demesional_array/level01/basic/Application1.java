package com.ohgiraffers.section02.demesional_array.level01.basic;

public class Application1 {

    public static void main(String[] args) {

        /* 행의 길이가 3, 열의 길이가 4인 정수형 2차원 배열을 선언 및 할당하고,
         * 각 인덱스에 차례대로 1부터 12까지의 정수를 대입한 뒤
         * 그 값을 출력하는 코드를 작성하시오.
         *
         * -- 출력 예시 --
         * 1  2  3  4
         * 5  6  7  8
         * 9 10 11 12
         *
         * 단, 출력물의 줄맞춤은 신경쓰지 말고 풀어보세요
         * */
        int[][] arr = new int[3][4];
        int value = 1; //배열에 대입해줄 값 1로 시작하도록 초기화
        for(int i = 0; i < arr.length; i++){ //바깥쪽 for문이 배열의 길이만큼(3만큼) 돌도록 설정
            for(int j = 0; j < arr[i].length; j++){ //안쪽 for문이 arr[i]길이만큼 돌도록 설정(length = 4)
                // arr[3][4]는 길이가 4인 배열이 3개가 있는 것이다.
                arr[i][j] = value++; //첫번째 배열 (i인덱스 0)의 첫번째 값(j)은 value = 1을 준다. ++되어 다음값은 2가 들어갈 것이다.
                System.out.print(arr[i][j] + " ");

            }System.out.println();
        }

//        for(int i = 0; i < arr.length; i++){
//            int[] inArr = arr[i];
//            for (int j = 0; j < inArr.length; j++){
//                System.out.print(inArr[j] + " ");
//            }
//            System.out.println();
//        }
    }
}
