package com.bfnj.com.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bfnj.com.entity.Student;
import com.bfnj.com.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	public Student selectStudentById(int id) {
		return new Student(1, "Jason");
	}

	@Override
	public  List<Student> selectStudentList() {
		List<Student> studList = new ArrayList<Student>();
		Student stud1 = new Student(1, "Jason");
		Student stud2 = new Student(2, "Frank");
		Student stud3 = new Student(3, "Terry");
		Student stud4 = new Student(4, "Hunrry");
		studList.add(stud1);
		studList.add(stud2);
		studList.add(stud3);
		studList.add(stud4);
		return studList;
	}

}
