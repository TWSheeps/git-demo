package com.lby.mybatis;

import com.lby.mybatis.mapper.EmpMapper;
import com.lby.mybatis.pojo.Emp;
import com.lby.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author 李博洋
 * @Description
 * @create 2022-07-29 21:35
 */
public class ResultMapTest {
    @Test
    public void testGetAllEmp(){
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> allEmp = mapper.getAllEmp();
        allEmp.forEach(emp -> System.out.println(emp));
    }
}
