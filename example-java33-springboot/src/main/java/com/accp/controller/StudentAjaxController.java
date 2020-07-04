package com.accp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Clazz;
import com.accp.domain.Student;
import com.accp.service.StudentService;
import com.github.pagehelper.PageInfo;

@Controller
public class StudentAjaxController {
	@Autowired
	StudentService service;

	@RequestMapping("/toAjaxFind")
	public String toAjaxFind() {
		return "ajaxFind";
	}

	@RequestMapping("/ajaxFind")
	@ResponseBody
	public PageInfo<Student> ajaxFind(Integer pageSize, Integer pageNum) {
		return service.findByPage(pageSize, pageNum);
	}

	@RequestMapping("/create")
	@ResponseBody
	public String create(@RequestBody Clazz clz) {
		int count = service.create(clz);
		if (count > 0) {
			return "00000";
		}
		return "00001";
	}

	@RequestMapping("/remove")
	@ResponseBody
	public String remove(Integer[] ids) {
		int count = service.remove(ids);
		if (count > 0) {
			return "00000";
		}
		return "00001";
	}

	@RequestMapping("/toEdit")
	@ResponseBody
	public Clazz toEdit(Integer cid) {

		return service.findClazz(cid);

	}
	
	@RequestMapping("/edit")
	@ResponseBody
	public String edit(@RequestBody Clazz clz) {
		int count = service.edit(clz);
		if (count > 0) {
			return "00000";
		}
		return "00001";
	}

}
