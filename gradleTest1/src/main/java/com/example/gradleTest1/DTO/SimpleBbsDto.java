package com.example.gradleTest1.DTO;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class SimpleBbsDto {
	
	private int id;
	
	@NotBlank(message="작성자명이 입력 되지 않았습니다.")
	private String writer;
	
	@NotBlank(message="제목이 입력 되지 않았습니다.")
	private String title;
	
	@NotBlank(message="내용이 입력 되지 않았습니다.")
	private String content;
}
