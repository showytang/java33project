package com.accp.dao;

import com.accp.domain.RoleModule;
import com.accp.domain.RoleModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleModuleMapper {
    int countByExample(RoleModuleExample example);

    int deleteByExample(RoleModuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RoleModule record);

    int insertSelective(RoleModule record);

    List<RoleModule> selectByExample(RoleModuleExample example);

    RoleModule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RoleModule record, @Param("example") RoleModuleExample example);

    int updateByExample(@Param("record") RoleModule record, @Param("example") RoleModuleExample example);

    int updateByPrimaryKeySelective(RoleModule record);

    int updateByPrimaryKey(RoleModule record);
}