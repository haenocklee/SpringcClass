package com.example.student.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.student.dto.StudentDTO;

@Repository
public class StudentRepository {
	
	@Autowired
	private SqlSessionTemplate sql; // mybatis 내에 있는 기능 (외워야함)
	
	public void save(StudentDTO studentDTO) {	
		sql.insert("Student.save", studentDTO);
	}

	public List<StudentDTO> findAll() {
		return sql.selectList("Student.findAll"); // db에 저장된 값 "Student.findAll"에 저장해서 가져오기
	}
	
}
