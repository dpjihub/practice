package com.ohgiraffers.section01.level02.normal;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        /* 홀수인 양의 정수를 입력 받아 입력 받은 크기 만큼의 정수형 배열을 할당하고
         * 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
         * 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값 넣어 출력하세요
         *
         * 단, 홀수인 양의 정수를 입력하지 않은 경우에는 "양수 혹은 홀수만 입력해야 합니다."를 출력하세요
         *
         * -- 입력 예시 --
         * 홀수인 양의 정수를 입력하세요 : 7
         *
         * -- 출력 예시 --
         * 1 2 3 4 3 2 1
         *
         * -- 입력 예시 --
         * 홀수인 양의 정수를 입력하세요 : 8
         *
         * -- 출력 예시 --
         * 양수 혹은 홀수만 입력해야 합니다.
         */
        // 3을 입력 받으면 1 2 1        -> 2
        // 5을 입력 받으면 1 2 3 2 1     -> 3
        // 7을 입력 받으면 1 2 3 4 3 2 1   -> 4
        // 9을 입력 받으면 1 2 3 4 5 4 3 2 1  -> 5

        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수 홀수를 입력해주세요 : ");
        int num = sc.nextInt();
        if (num < 0 || num % 2 == 0) { //num이 0보다 작거나, num이 2로 나눈 나머지가 0이면(짝수) 출력하도록 설정
            System.out.println("양수 혹은 홀수만 입력해야 합니다.");
        }
        int[] iarr = new int[num]; //입력받은 num의 길이만큼 정수형 배열 iarr 생성

        for (int i = 0; i < (iarr.length)/2 + 1; i++){
            iarr[i] = i + 1;
            System.out.print(iarr[i] + " ");
        } //iarr배열의 길이의 2를 나누고, 홀수이므로 + 1을 해줘서 중간값에서 한번 더 오름차순으로 값을 넣어주었다.
        // 7을 넣었다고 가정하면, 2로 나누면 3인데 그럼 3번 반복된다. 하지만 1 2 3 4 3 2 1 <-이렇게 표현되어야 한다.
        // 그러려면 오름차순 반복횟수를 4번까지 해줘야 해서 + 1을 한 것이다.
        int n = 1; //밑의 계산식을 위해 정수변 변수 n을 하나 1로 초기화하였다.
        for(int j = (iarr.length)/2 + 1; j < iarr.length; j++){
            iarr[j] = j - n;
            n++; n++;
            System.out.print(iarr[j] + " ");
        } //7을 넣었다 가정할 때 int j = (iarr.length)/2 + 1; <-초기값으로 해서 j는 7의 2를 나누고 1을 더한 값 4부터 시작한다.
        //그러면 조건식을 처음에 보면 4 < 7 이다. 그래서 j가 7보다 작을 때까지, 즉 4, 5, 6 <- 3번 반복문 작동할 것이다.
        // 3 2 1 을 찍어줄 것이므로(3번이니까) 딱이다. iarr[j] = j - n; 식에 의해 처음은 iarr[4] = 4 - 1 이라 3이 잘 들어간다.
        //그러나 다음 반복 때 j가 5가 되면 iarr[5] = 5 - n 인데, n값을 2번 올려줘야 n이 1에서 3이 되므로  n++; 을 두 번했다.

        //왠지 뭔가 이렇게 하는거 아닌것 같지만 7 넣으면 1 2 3 4 3 2 1 되긴 됐다. 다른 홀수들 넣어도 잘 출력된다.
    }
}

