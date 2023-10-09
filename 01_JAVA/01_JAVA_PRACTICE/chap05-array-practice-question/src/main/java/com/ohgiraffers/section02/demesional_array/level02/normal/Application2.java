package com.ohgiraffers.section02.demesional_array.level02.normal;

public class Application2 {

    public static void main(String[] args) {

        /* 길이 12의 문자열 배열을 생성하여 12명의 학생들을 출석부 순으로 1차원 배열에 할당하고,
         * 2열 3행 2차원 배열을 2개 할당하여 각 1분단 2분단이라고 칭한다.
         * 순차적으로  1분단 부터, 왼쪽부터 오른쪽, 1행에서 아래 행으로 번호 순으로 자리를 배치하고 출력하세요
         *
         * -- 출석부 --
         * 1. 홍길동
         * 2. 이순신
         * 3. 유관순
         * 4. 윤봉길
         * 5. 장영실
         * 6. 임꺽정
         * 7. 장보고
         * 8. 이태백
         * 9. 김정희
         * 10. 대조영
         * 11. 김유신
         * 12. 이사부
         *
         * -- 출력 예시 --
         * == 1분단 ==
         * 홍길동 이순신
         * 유관순 윤봉길
         * 장영실 임꺽정
         *
         * == 2분단 ==
         * 장보고 이태백
         * 김정희 대조영
         * 김유신 이사부
         */
        String[] sArr = {"홍길동", "이순신", "유관순", "윤봉길", "장영실", "임꺽정", "장보고", "이태백", "김정희", "대조영", "김유신", "이사부"};
        String[][] s1 = new String[3][2];
        String[][] s2 = new String[3][2];


//        for(int i = 0; i < s1.length; i++){
//            for(int j = 0; j < s1[i].length; j++){
//                for(int z = 0; z < (sArr.length)/2; z++){
//                        s1[i][j] = sArr[z];
////                    System.out.print(s1[i][j] + " ");
//                }
//            }
//
//        }
//        for(int i = 0; i < s1.length; i++){
//            String[] inArr = s1[i];
//            for (int j = 0; j < inArr.length; j++){
//                System.out.print(inArr[j] + " ");
//            }
//            System.out.println();
//        }

        /*위처럼 풀었다가
         * 임꺽정 임꺽정
         * 임꺽정 임꺽정
         * 임꺽정 임꺽정
         *
         * 이렇게 출력되서 선생님 답지 보고 다시 풉니당
         *
         * */
        System.out.println("== 1분단 ==");
        int count = 0; //sArr의 인덱스 값을 누적시킬 변수 하나 선언 후 초기화. 인덱스 0번부터 시작
        for (int i = 0; i < s1.length; i++){
            for(int j = 0; j < s1[i].length; j++){
                s1[i][j] = sArr[count]; //sArr[0] 을 대입
                count++; //count - > 1 증가
                System.out.print(s1[i][j] + " ");
                //[3][2] 모양이 되게 for문을 돌리면 총 6개의 count가 누적된다. sArr 0 ~ 5번 인덱스까지 넣어짐.
            }System.out.println();
        }
        System.out.println();
        System.out.println("== 2분단 ==");

        for (int i = 0; i < s2.length; i++){
            for(int j = 0; j < s2[i].length; j++){
                s2[i][j] = sArr[count]; //현재 count 값은 7이고 6번 인덱스부터 시작한다.
                count++;
                System.out.print(s2[i][j] + " ");
            }System.out.println();
        }
    }
}
