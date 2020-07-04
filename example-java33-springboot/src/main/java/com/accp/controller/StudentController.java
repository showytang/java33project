package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.accp.domain.Student;
import com.accp.service.StudentService;

/**
 * 
 * 这是我的功能功能
 * 
 * 
 * @author admin
 *
 */
@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService service;

	@GetMapping
	public String find(Model model) {
		List<Student> list = service.find();
		model.addAttribute("list",list);
		return "find";
	}
}
