package com.accp.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.StudentMapper;
import com.accp.domain.Clazz;
import com.accp.domain.Student;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class StudentService {
	
	@Autowired
	private StudentMapper mapper;
	
	public List<Student> find(){
		return mapper.selectByExample(null);
	}
	
	public PageInfo<Student> findByPage(Integer pageSize,Integer pageNum){
		Page page = PageHelper.startPage(pageNum, pageSize);
		//List<Student> list = mapper.selectByExample(null);
		mapper.find();
		return page.toPageInfo();
	}
	
	public int create(Clazz clz) {
		int count = mapper.createClazz(clz);
		if(count>0) {
			return mapper.create(clz.getSlist(), clz.getId());
		}
		return 0;
	}
	
	public int remove(Integer [] ids) {
		return mapper.remove(ids);
	}
	
	public Clazz findClazz(Integer id) {
		Clazz clz = mapper.findClazz(id);
		List<Student> slist = mapper.findByClazzId(id);
		clz.setSlist(slist);
		return clz;
	}

	
	public int edit(Clazz clz) {
		int count = mapper.edit(clz);
		List<Integer> list = clz.getSlist().stream().map(item->item.getId()).collect(Collectors.toList());
		Integer[] ids = list.toArray(new Integer[list.size()]);
		int removeCount = mapper.remove(ids);
		int createCount = mapper.create(clz.getSlist(), clz.getId());
		return createCount;
	}
}
