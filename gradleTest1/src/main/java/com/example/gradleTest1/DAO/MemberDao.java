package com.example.gradleTest1.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.gradleTest1.DTO.MemberDto;

@Repository
public class MemberDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<MemberDto> list(){
		String sql = "select * from myuser";
		List<MemberDto> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<MemberDto>(MemberDto.class)); // BeanPropertyRowMapper - 데이터베이스의 데이터를 가져올떄 지정한 타입으로 가져올수있다.
		
		return list;
	}
	
	public void insertMember(MemberDto memberDto) {
		String sql = "insert into myuser(email, name, password, city, state, zip_code) values(?,?,?,?,?,?)";
		jdbcTemplate.update(sql, memberDto.getEmail(), memberDto.getName(), memberDto.getPassword(), memberDto.getCity(), memberDto.getState(), memberDto.getZipCode());
		 
	}
}
