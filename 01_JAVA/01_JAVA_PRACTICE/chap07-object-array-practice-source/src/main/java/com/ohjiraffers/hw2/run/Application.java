package com.ohjiraffers.hw2.run;

import com.ohjiraffers.hw2.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        StudentDTO[] studentDTOS = new StudentDTO[10]; //10명의 정보를 담을 객체배열 생성
        int index = 0;
        while (true) {


            System.out.print("학년 : ");
            int grade = sc.nextInt();
            System.out.print("반 : ");
            int classroom = sc.nextInt();
            System.out.print("이름 : ");
            String name = sc.next();
            System.out.print("국어점수 : ");
            int kor = sc.nextInt();
            System.out.print("영어점수 : ");
            int eng = sc.nextInt();
            System.out.print("수학점수 : ");
            int math = sc.nextInt();

            studentDTOS[index] = new StudentDTO(grade, classroom, name, kor, eng, math);

            System.out.println("계속 추가하시겠습니까? (y/n) : ");
            String answer = sc.next();
            if (answer.equals("y") || answer.equals("Y")) {
                index++;
            } else {

                break;
            }
        }
        for (int i = 0; i < studentDTOS.length; i++) {
            if (studentDTOS[i] != null) {
                System.out.println(studentDTOS[i].information());
            }


        }


        //NullPointerException <- 값을 안넣으니 이렇게 오류가 난다...
        //null이아닐때만 출력하라는걸추가해줘야겠죠 <- 선생님 답변
        //아직 모르겠다.

    }
}


