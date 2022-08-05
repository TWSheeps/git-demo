package com.lby.mybatis.mapper;

import com.lby.mybatis.pojo.Emp;

import java.util.List;

/**
 * @author 李博洋
 * @Description
 * @create 2022-07-29 21:30
 */
public interface EmpMapper {

    //查询所有员工信息
    List<Emp> getAllEmp();
}
