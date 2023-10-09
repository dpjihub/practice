package com.ohgiraffers.section01.level02.normal;

public class Application4 {

    public static void main(String[] args) {

     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  단, 중복 값 없이 오름차순으로 정렬하여 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	   */
        int random = 0;
        int[] rotto = new int[6];
        int n = 6; //기본은 6번을 돌릴 것이지만 중복 숫자가 나오면 그만큼 더 반복할수 있어서 n을 명명하고 6으로 초기화.
        for(int i = 0; i < n; i++) {
            random = (int) (Math.random() * 45) + 1; // (45 - 1 + 1) + 1 (최대값 - 최소값 + 1) + 1
            for(int j = 0; j < rotto.length; j++){
                if(random == rotto[j]){
                    n++;
                }
            }
//            if(random != rotto[i]){ //rotto 배열에 있는 원소와 랜덤숫자가 다르면 rotto배열에 random을 담아주는 실행문을 수행한다.
//            rotto[i] = random;
//            }else{
//                n++; //중복숫자가 나오면 그건 배열에 담지 않을 것이므로 n값(반복돌릴횟수)을 증가시켜서 중복숫자가 나올때마다 1번씩 더 돌린다.
//            }
//            System.out.println(rotto[i]);
        }

    }
}

