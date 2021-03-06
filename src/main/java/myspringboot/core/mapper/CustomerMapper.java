package myspringboot.core.mapper;

import java.util.List;
import myspringboot.core.model.Customer;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface CustomerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.customer
     *
     * @mbg.generated Sun Jan 26 18:55:42 JST 2020
     */
    @Delete({
        "delete from dbo.customer",
        "where CUSTID = #{custid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer custid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.customer
     *
     * @mbg.generated Sun Jan 26 18:55:42 JST 2020
     */
    @Insert({
        "insert into dbo.customer (CUSTID, CUSTNAME, ",
        "KANA, TEL, ADDRESS)",
        "values (#{custid,jdbcType=INTEGER}, #{custname,jdbcType=VARCHAR}, ",
        "#{kana,jdbcType=VARCHAR}, #{tel,jdbcType=CHAR}, #{address,jdbcType=VARCHAR})"
    })
    int insert(Customer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.customer
     *
     * @mbg.generated Sun Jan 26 18:55:42 JST 2020
     */
    @Select({
        "select",
        "CUSTID, CUSTNAME, KANA, TEL, ADDRESS",
        "from dbo.customer",
        "where CUSTID = #{custid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="CUSTID", property="custid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CUSTNAME", property="custname", jdbcType=JdbcType.VARCHAR),
        @Result(column="KANA", property="kana", jdbcType=JdbcType.VARCHAR),
        @Result(column="TEL", property="tel", jdbcType=JdbcType.CHAR),
        @Result(column="ADDRESS", property="address", jdbcType=JdbcType.VARCHAR)
    })
    Customer selectByPrimaryKey(Integer custid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.customer
     *
     * @mbg.generated Sun Jan 26 18:55:42 JST 2020
     */
    @Select({
        "select",
        "CUSTID, CUSTNAME, KANA, TEL, ADDRESS",
        "from dbo.customer"
    })
    @Results({
        @Result(column="CUSTID", property="custid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CUSTNAME", property="custname", jdbcType=JdbcType.VARCHAR),
        @Result(column="KANA", property="kana", jdbcType=JdbcType.VARCHAR),
        @Result(column="TEL", property="tel", jdbcType=JdbcType.CHAR),
        @Result(column="ADDRESS", property="address", jdbcType=JdbcType.VARCHAR)
    })
    List<Customer> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.customer
     *
     * @mbg.generated Sun Jan 26 18:55:42 JST 2020
     */
    @Update({
        "update dbo.customer",
        "set CUSTNAME = #{custname,jdbcType=VARCHAR},",
          "KANA = #{kana,jdbcType=VARCHAR},",
          "TEL = #{tel,jdbcType=CHAR},",
          "ADDRESS = #{address,jdbcType=VARCHAR}",
        "where CUSTID = #{custid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Customer record);
}