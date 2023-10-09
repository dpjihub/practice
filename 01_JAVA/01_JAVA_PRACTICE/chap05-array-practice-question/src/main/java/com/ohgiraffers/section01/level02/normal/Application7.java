package com.ohgiraffers.section01.level02.normal;

public class Application7 {

    public static void main(String[] args) {

        /*
         * 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
         * 1 ~ 10사이의 난수를 발생시켜 배열에 초기화 후
         * 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요
         *
         * ex.
         * 5 3 2 7 4 8 6 10 9 10
         * 최대값 : 10
         * 최소값 : 2
         * */

        int[] ten = new int[10];

        for(int i = 0; i < ten.length; i++) {
            int random = (int) (Math.random() * 10) + 1;
            ten[i] = random;
            //ten.length 횟수만큼(여기서는 10)만큼 랜덤함수를 생성하는 코드.
            // 생성된 랜덤 값 random을 ten배열에 1개씩 대입시킨다.
            System.out.print(ten[i] + " "); //잘 들어갔는지 출력
        }
        for(int i = 1; i < ten.length; i++){
            for(int j = 0; j < i; j++){

                if(ten[i] < ten[j]){
                    int temp;
                    temp = ten[i];
                    ten[i] = ten[j];
                    ten[j] = temp; //배열을 오름차순으로 순차정렬하는 코드
                }
            }
        }
        System.out.println();
        System.out.println("최대값 : " + ten[9]);
        System.out.println("최소값 : " + ten[0]);
    }//순차정렬하였으므로 최대값은 가장 마지막 인덱스인 9, 최소값은 제일 처음 인덱스인 0이 될 것이다.
}
