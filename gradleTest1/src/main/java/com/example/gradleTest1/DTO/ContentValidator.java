package com.example.gradleTest1.DTO;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
// Validator - Spring 내장 객체
public class ContentValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// 검증할 객체의 클래스 확인
		return ContentDto.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		ContentDto dto = (ContentDto)target;
		
		String writer = dto.getWriter(); // trim - 앞뒤 빈공간 제거
		if( writer == null || writer.trim().isEmpty() ) {
			errors.rejectValue("writer", "No input", "작성자를입력하세요");
		}
		
		String content = dto.getContent();
		if( content == null || content.trim().isEmpty() ) {
			errors.rejectValue("content", "No input Content", "내용을입력하세요");
		}
		
	}
	
}








