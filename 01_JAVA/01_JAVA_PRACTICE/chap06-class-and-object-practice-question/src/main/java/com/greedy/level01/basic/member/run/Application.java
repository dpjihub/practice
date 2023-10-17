package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.dto.MemberDTO;

public class Application {
    public static void main(String[] args) {

        MemberDTO memberDTO = new MemberDTO();


        System.out.println("memberDTO.Id = " + memberDTO.getId());
        System.out.println("memberDTO.Pwd = " + memberDTO.getPwd());
        System.out.println("memberDTO.Name = " + memberDTO.getName());
        System.out.println("memberDTO.Age = " + memberDTO.getAge());
        System.out.println("memberDTO.Gender = " + memberDTO.getGender());
        System.out.println("memberDTO.Phone = " + memberDTO.getPhone());
        System.out.println("memberDTO.Email = " + memberDTO.getEmail());

        memberDTO.setId("user01");
        memberDTO.setPwd("pass01");
        memberDTO.setName("홍길동");
        memberDTO.setAge(20);
        memberDTO.setGender('M');
        memberDTO.setPhone("010-1234-5678");
        memberDTO.setEmail("hong123@greedy.com");

        System.out.println();
        System.out.println("변경 후 memberDTO.Id = " + memberDTO.getId());
        System.out.println("변경 후 memberDTO.Pwd = " + memberDTO.getPwd());
        System.out.println("변경 후 memberDTO.Name = " + memberDTO.getName());
        System.out.println("변경 후 memberDTO.Age= " + memberDTO.getAge());
        System.out.println("변경 후 memberDTO.Gende = " + memberDTO.getGender());
        System.out.println("변경 후 memberDTO.Phone = " + memberDTO.getPhone());
        System.out.println("변경 후 memberDTO.Email = " + memberDTO.getEmail());
    }
}
