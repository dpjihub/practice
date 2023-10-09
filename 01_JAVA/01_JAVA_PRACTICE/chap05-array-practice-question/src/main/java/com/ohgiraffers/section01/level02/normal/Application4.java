package com.ohgiraffers.section01.level02.normal;

public class Application4 {

    public static void main(String[] args) {

     /*
		  로또 번호 자동 생성기 프로그램을 작성하세요.
		  단, 중복 값 없이 오름차순으로 정렬하여 출력하세요.

		  Random 클래스 사용 혹은 Math.random() 메소드를 사용
	   */

        int[] rotto = new int[6]; //배열 이름을 rotto 로 하고 길이 6으로 생성
        int random = 0; //랜덤 함수로 뽑을 값을 담아줄 random 변수 선언 및 초기화
        int temp = 0; //순차정렬을 위해 임시로 값을 담아줄 temp 선언 및 초기화


        for(int i = 0; i < rotto.length; i++) { //rotto 배열의 길이만큼 반복
            random = (int) (Math.random() * 45) + 1;
            // (45 - 1 + 1) + 1 (최대값 - 최소값 + 1) + 1 -> 1부터 45까지 난수 생성
            rotto[i] = random; //위에서 생성한 난수를 rotto 배열의 현재 i 인덱스에 담는다.

            for(int j = 0; j < i; j++){ //순차정렬을 위해 첫번째 인덱스는 0 < 0 false 이므로 비교하지 않고(첫 수는 중복여부 아직 없으니)
                //두번째 인덱스부터 중복여부를 검사하기 위해 조건식을 j < i 로 한다. false가 되면 다시 위쪽 반복문이 되어 i++ 이 되면
                //j < i 가 0 < 1이 되어 true 가 되므로 아래의 중복검사를 실행한다.

                if(rotto[i] == rotto[j]){ //만약 첫번째 랜덤수인 인덱스 0의 값과 두번째 랜덤수인 인덱스 1의 값이 같다면

                    temp = rotto[i];
                    rotto[i] = rotto[j];
                    temp = rotto[j];
                    //순차정렬로 처리해준다.

                    i--;//i값을 감소시켜 rotto.length 루프를 한번 더 할수있도록 한다.
                    System.out.print("중복검사 ");
                }
            }System.out.print(rotto[i] + " "); //중복도 같이 나오는 출력문(아직 랜덤 뽑고 정렬하는 연산 과정중임)
        }
        System.out.println();
        for(int i = 0; i < rotto.length; i++){
            System.out.print(rotto[i] + " "); //완성된 배열 출력문
        }

    }
}

