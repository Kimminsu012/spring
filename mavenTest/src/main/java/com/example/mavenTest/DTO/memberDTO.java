package com.example.mavenTest.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@toString - toString의 내용을 변경할려면 @toString만 하면 된다.
@Getter
@Setter
@Data // equals toString 등등 모든 것들을 자동으로 만들어줌
public class memberDTO {
	private String email;
	private String pin;
	private String name;
	private String tel; 
}


// 데이터와 관련 있는 클래스들을 지정하는 용어
// DTO(Data Transfer Object) - 읽기전용 , 데이터 전송을 위한 객체(전달 목적)
// VO(Value Object) - 여러 데이터들을 통합하여 다루는 객체 , 데이터 가공을 위한 알고리즘
// ENTITY - 데이터베이스 테이블과 매칭 되는 객체 , 데이터베이스를 다루기 위한 객체이다.