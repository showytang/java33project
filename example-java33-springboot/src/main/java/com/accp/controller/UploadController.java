package com.accp.controller;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.accp.domain.Student;

@Controller
public class UploadController {
	
	@RequestMapping("/toFile")
	public String toFile() {
		return "file";
	}
	
	@RequestMapping("/upload")
	public String upload(MultipartFile [] file,Student stu,HttpSession session) {
		for(MultipartFile f : file){
			String suffix = f.getOriginalFilename().substring(f.getOriginalFilename().lastIndexOf("."));
			String uuid = UUID.randomUUID().toString();
			File file1 = new File("d://images/"+uuid+suffix);
			try {
				stu.setUrl(uuid+suffix);
				session.setAttribute("stu",stu);
				f.transferTo(file1);
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "file";
	}
	
	
	@RequestMapping("/view")
	public String view(HttpSession session,Model model) {
		//从数据库查询
		Object obj = session.getAttribute("stu");
		model.addAttribute("student", obj);
		return "view";
	}
}
