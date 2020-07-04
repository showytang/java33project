package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.domain.Clazz;
import com.accp.domain.Student;
import com.accp.domain.StudentExample;
public interface StudentMapper {
	
	int edit(Clazz clz);
	
	List<Student> findByClazzId(Integer cid);
	
	Clazz findClazz(Integer id);
	
	List<Student> find();
	
	int remove(Integer [] ids);
	
	int createClazz(Clazz clz);
	
	int create(@Param("slist")List<Student> list,@Param("cid")Integer cid);
	
    int countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}