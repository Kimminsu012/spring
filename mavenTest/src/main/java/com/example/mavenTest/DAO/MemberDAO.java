package com.example.mavenTest.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.mavenTest.DTO.memberDTO;

@Repository
public class MemberDAO {
	private final JdbcTemplate jdbcTemplate;
	
	@Autowired // spring 자체적으로 관리를 하기 위해서 각각 하나씩 관리하는것보다 유용하다. / 자동으로 만들어주고 대입해주고 하기 때문에 개발자 입장에선 편하다.
	public MemberDAO(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	
	// 로그인 - 이메일 비번 확인
	public String findMemberByemailpw(String email, String pw) {
		String sql = "select name from member where email=? and pw=?";
		try {
			return jdbcTemplate.queryForObject(sql, String.class , email, pw);
		}catch(Exception e) {
			return null;
		}
	}
	
	// 회원가입 데이터베이스에 저장
	public void insert(memberDTO memberdto) {
		String sql="insert into member(email, pw, name, tel) values(?,?,?,?)";
		jdbcTemplate.update(sql, memberdto.getEmail(), memberdto.getPin(), memberdto.getName(), memberdto.getTel() );
	}
	
	public void update(String email, String pw, String name, String tel, String newPin) {
		
		System.out.println(pw);
		
		String sql = "update member set name=?, tel=?, pw=? where email=? and pw=?";
		jdbcTemplate.update(sql, name,tel,newPin,email,pw );
	}
}
