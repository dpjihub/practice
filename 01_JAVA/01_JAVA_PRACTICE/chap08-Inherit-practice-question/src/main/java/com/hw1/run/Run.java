package com.hw1.run;

import com.hw1.model.dto.Employee;
import com.hw1.model.dto.Person;
import com.hw1.model.dto.Student;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] student = new Student[3];

        student[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
        student[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
        student[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
        for(int i = 0; i < student.length; i++){
            System.out.println(student[i].information());
        }

        Employee[] employee = new Employee[10];

        int count = 0;
        String answer = "";

        while(true) {
        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("나이 : ");
        int age = sc.nextInt();
        System.out.print("신장 : ");
        double height = sc.nextDouble();
        System.out.print("몸무게 : ");
        double weight = sc.nextDouble();
        System.out.print("급여 : ");
        int salary = sc.nextInt();
        System.out.print("부서 : ");
        String dept = sc.next();

        employee[count] = new Employee(name,age,height,weight,salary,dept);
        count++;

            System.out.print("계속 추가하시겠습니까? (y/n) : ");
            answer = sc.next();

            if(answer.equals("n") || answer.equals("N")){
                break;
            }

        }
        for(int i = 0; i <count; i++){
            System.out.println(employee[i].information());
        }

    }
}
