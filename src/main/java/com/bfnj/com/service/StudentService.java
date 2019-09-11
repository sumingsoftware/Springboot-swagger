package com.bfnj.com.service;

import java.util.List;

import com.bfnj.com.entity.Student;

public interface StudentService {
    public Student selectStudentById(int id);

	public List<Student> selectStudentList();
}
