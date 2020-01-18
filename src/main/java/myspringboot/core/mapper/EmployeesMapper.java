package myspringboot.core.mapper;

import java.util.List;
import myspringboot.core.model.Employees;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface EmployeesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employees
     *
     * @mbg.generated Sat Jan 18 18:25:39 JST 2020
     */
    @Delete({
        "delete from employees",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employees
     *
     * @mbg.generated Sat Jan 18 18:25:39 JST 2020
     */
    @Insert({
        "insert into employees (id, firstname, ",
        "lastname, emailaddress)",
        "values (#{id,jdbcType=INTEGER}, #{firstname,jdbcType=VARCHAR}, ",
        "#{lastname,jdbcType=VARCHAR}, #{emailaddress,jdbcType=VARCHAR})"
    })
    int insert(Employees record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employees
     *
     * @mbg.generated Sat Jan 18 18:25:39 JST 2020
     */
    @Select({
        "select",
        "id, firstname, lastname, emailaddress",
        "from employees",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="firstname", property="firstname", jdbcType=JdbcType.VARCHAR),
        @Result(column="lastname", property="lastname", jdbcType=JdbcType.VARCHAR),
        @Result(column="emailaddress", property="emailaddress", jdbcType=JdbcType.VARCHAR)
    })
    Employees selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employees
     *
     * @mbg.generated Sat Jan 18 18:25:39 JST 2020
     */
    @Select({
        "select",
        "id, firstname, lastname, emailaddress",
        "from employees"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="firstname", property="firstname", jdbcType=JdbcType.VARCHAR),
        @Result(column="lastname", property="lastname", jdbcType=JdbcType.VARCHAR),
        @Result(column="emailaddress", property="emailaddress", jdbcType=JdbcType.VARCHAR)
    })
    List<Employees> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employees
     *
     * @mbg.generated Sat Jan 18 18:25:39 JST 2020
     */
    @Update({
        "update employees",
        "set firstname = #{firstname,jdbcType=VARCHAR},",
          "lastname = #{lastname,jdbcType=VARCHAR},",
          "emailaddress = #{emailaddress,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Employees record);
}