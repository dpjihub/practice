package com.ohjiraffers.hw1.run;

import com.ohjiraffers.hw1.model.dto.EmployeeDTO;

public class Application {
    public static void main(String[] args) {

        EmployeeDTO[] employeeDTOS = new EmployeeDTO[3];
        //객체 배열의 크기를 3으로 할당한 뒤

        for(int i = 0; i < employeeDTOS.length; i++){
            System.out.println(employeeDTOS[i]);
        }

        //생성한 배열 출력.
        //null, null, null 로 출력됨.


        employeeDTOS[0] = new EmployeeDTO(0, "김말똥", "영업부", "팀장",
                30, 'M', 3000000, 0.2, "01055559999", "전라도 광주");
        employeeDTOS[1] = new EmployeeDTO(1, "홍길동", "기획부", "부장",
                19,'M', 4000000, 0.3,"01022223333", "서울 잠실");
        employeeDTOS[2] = new EmployeeDTO(2, "강말순", "교육부" , "강사",
                20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");

        for(int i = 0; i < employeeDTOS.length; i++){
            System.out.println(employeeDTOS[i].getInformation());
        }
        System.out.println(employeeDTOS[0].getEmpName() + "의 월급 " + employeeDTOS[0].getSalary() + "원");
        System.out.println(employeeDTOS[1].getEmpName() + "의 월급 " + employeeDTOS[1].getSalary() + "원");
        System.out.println(employeeDTOS[2].getEmpName() + "의 월급 " + employeeDTOS[2].getSalary() + "원");

//        double result = new EmployeeDTO().avg(employeeDTOS);
//
//        System.out.println("직원들의 연봉의 평균 : " + EmployeeDTO.avg());


//        System.out.println(employeeDTOS[0].getSalary());


        double result = 0;
        double avg = 0;



        for (int i = 0; i < employeeDTOS.length; i++) {

            result = ((employeeDTOS[i].getSalary() + (employeeDTOS[i].getSalary() * employeeDTOS[i].getBonusPoint())) * 12);

            System.out.println(employeeDTOS[i].getEmpName() + "의 연봉은 " + (int) result + "원");

            avg += ((employeeDTOS[i].getSalary() + (employeeDTOS[i].getSalary() * employeeDTOS[i].getBonusPoint())) * 12);



        }
        System.out.println("직원들의 연봉의 평균 : " + (int) (avg / employeeDTOS.length) + "원");








//        Application app1 = new Application();
//
//        app1.signUpMembers();

//        EmployeeDTO[] employeeDTO = new EmployeeDTO[3];
//
//        for (int i = 0; i < employeeDTO.length; i++) {
//            employeeDTO[i] = new EmployeeDTO();
//            //EmployeeDTO 객체 생성 3번하는 for문
//        }




    }

//    public void signUpMembers(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("사원 번호 : ");
//        int empNo = sc.nextInt();
//        System.out.println("사원명 : ");
//        String empName = sc.next();
//        System.out.println("소속부서 : ");
//        String dept = sc.next();
//        System.out.println("직급 : ");
//        String job = sc.next();
//        System.out.println("나이 : ");
//        int age = sc.nextInt();
//        System.out.println("성별 : ");
//        char gender = sc.next().charAt(0);
//        System.out.println("급여 : ");
//        int salary = sc.nextInt();
//        System.out.println("보너스포인트 : ");
//        double bonusPoint = sc.nextDouble();
//        System.out.println("전화번호 : ");
//        String phone = sc.next();
//        System.out.println("주소 : ");
//        String address = sc.next();
//
//        EmployeeDTO[] employeeDTO = new EmployeeDTO[10];
//
//        employeeDTO[0] = new EmployeeDTO(empNo,empName,dept,job,age,gender,salary,bonusPoint,phone,address);
//        employeeDTO[1] = new EmployeeDTO(empNo,empName,dept,job,age,gender,salary,bonusPoint,phone,address);
//        employeeDTO[2] = new EmployeeDTO(empNo,empName,dept,job,age,gender,salary,bonusPoint,phone,address);
//        employeeDTO[3] = new EmployeeDTO(empNo,empName,dept,job,age,gender,salary,bonusPoint,phone,address);
//        employeeDTO[4] = new EmployeeDTO(empNo,empName,dept,job,age,gender,salary,bonusPoint,phone,address);
//        employeeDTO[5] = new EmployeeDTO(empNo,empName,dept,job,age,gender,salary,bonusPoint,phone,address);
//        employeeDTO[6] = new EmployeeDTO(empNo,empName,dept,job,age,gender,salary,bonusPoint,phone,address);
//        employeeDTO[7] = new EmployeeDTO(empNo,empName,dept,job,age,gender,salary,bonusPoint,phone,address);
//        employeeDTO[8] = new EmployeeDTO(empNo,empName,dept,job,age,gender,salary,bonusPoint,phone,address);
//        employeeDTO[9] = new EmployeeDTO(empNo,empName,dept,job,age,gender,salary,bonusPoint,phone,address);
//
//    }


}
