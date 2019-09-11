package com.bfnj.com.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bfnj.com.entity.Student;
import com.bfnj.com.service.StudentService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("api")
@Api("swaggerDemoController相关的api")
public class SwaggerDemoController {
	@Autowired
	private StudentService studentServiceImpl;

	private static final Logger logger = LoggerFactory.getLogger(SwaggerDemoController.class);

	@ApiOperation(value = "根据id查询学生信息", notes = "查询数据库中某个的学生信息")
	@ApiImplicitParam(name = "id", value = "学生ID", paramType = "path", required = true, dataType = "Integer")
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Student getStudent(@PathVariable int id) {
		logger.info("开始查询某个学生信息");
		return studentServiceImpl.selectStudentById(id);
	}
	
	@ApiOperation(value = "查询所有学生信息", notes = "查询数据库中所有的学生信息")
	@RequestMapping(value = "/getAllStudent", method = RequestMethod.GET)
	public List<Student> getAllStudent() {
		logger.info("开始查询所有学生信息");
		return studentServiceImpl.selectStudentList();
	}
}
