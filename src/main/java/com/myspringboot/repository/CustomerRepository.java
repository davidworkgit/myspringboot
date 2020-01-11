package com.myspringboot.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;

import com.myspringboot.Form.SearchForm.Customer;

@Mapper
public interface CustomerRepository {
	@Select("select * from customer")
    public List < Customer > findAll();
	
	@SelectProvider(type = CustomerSqlProvider.class, method = "findbytel")
    public Customer findByTel(String tel);

    @Delete("DELETE FROM customer WHERE custid = #{custid}")
    public int deleteById(long custid);

    @Insert("INSERT INTO customer(custid, custname, kana,tel,adress) " +
        " VALUES (#{custid}, #{custname}, #{kana}, #{tel}, #{adress})")
    public int insert(Customer customer);

    @Update("Update customer set custid=#{custid}, " +
        " custname=#{custname}, kana=#{kana}," +
        " tel=#{tel}, adress=#{adress}," +	"where custid=#{custid}")
    public int update(Customer customer);
}
