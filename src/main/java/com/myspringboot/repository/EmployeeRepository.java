package com.myspringboot.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.myspringboot.model.Employee;

@Mapper
public interface EmployeeRepository {
    @Select("select * from employees")
    public List < Employee > findAll();

    @Select("SELECT * FROM employees WHERE id = #{id}")
    public Employee findById(long id);

    @Delete("DELETE FROM employees WHERE id = #{id}")
    public int deleteById(long id);

    @Insert("INSERT INTO employees(id, firstname, lastname,emailaddress) " +
        " VALUES (#{id}, #{firstName}, #{lastName}, #{emailId})")
    public int insert(Employee employee);

    @Update("Update employees set firstname=#{firstName}, " +
        " lastname=#{lastName}, emailaddress=#{emailaddress} where id=#{id}")
    public int update(Employee employee);
}