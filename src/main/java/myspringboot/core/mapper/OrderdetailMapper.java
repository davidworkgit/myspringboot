package myspringboot.core.mapper;

import java.util.List;
import myspringboot.core.model.Orderdetail;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface OrderdetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetail
     *
     * @mbg.generated Sat Jan 18 18:25:39 JST 2020
     */
    @Delete({
        "delete from orderdetail",
        "where NO = #{no,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long no);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetail
     *
     * @mbg.generated Sat Jan 18 18:25:39 JST 2020
     */
    @Insert({
        "insert into orderdetail (NO, CUSTID, ",
        "ITEMID, ORDERDATE, QUANTITY, ",
        "TAXID, STATUS)",
        "values (#{no,jdbcType=BIGINT}, #{custid,jdbcType=INTEGER}, ",
        "#{itemid,jdbcType=CHAR}, #{orderdate,jdbcType=DATE}, #{quantity,jdbcType=INTEGER}, ",
        "#{taxid,jdbcType=INTEGER}, #{status,jdbcType=INTEGER})"
    })
    int insert(Orderdetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetail
     *
     * @mbg.generated Sat Jan 18 18:25:39 JST 2020
     */
    @Select({
        "select",
        "NO, CUSTID, ITEMID, ORDERDATE, QUANTITY, TAXID, STATUS",
        "from orderdetail",
        "where NO = #{no,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="NO", property="no", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="CUSTID", property="custid", jdbcType=JdbcType.INTEGER),
        @Result(column="ITEMID", property="itemid", jdbcType=JdbcType.CHAR),
        @Result(column="ORDERDATE", property="orderdate", jdbcType=JdbcType.DATE),
        @Result(column="QUANTITY", property="quantity", jdbcType=JdbcType.INTEGER),
        @Result(column="TAXID", property="taxid", jdbcType=JdbcType.INTEGER),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.INTEGER)
    })
    Orderdetail selectByPrimaryKey(Long no);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetail
     *
     * @mbg.generated Sat Jan 18 18:25:39 JST 2020
     */
    @Select({
        "select",
        "NO, CUSTID, ITEMID, ORDERDATE, QUANTITY, TAXID, STATUS",
        "from orderdetail"
    })
    @Results({
        @Result(column="NO", property="no", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="CUSTID", property="custid", jdbcType=JdbcType.INTEGER),
        @Result(column="ITEMID", property="itemid", jdbcType=JdbcType.CHAR),
        @Result(column="ORDERDATE", property="orderdate", jdbcType=JdbcType.DATE),
        @Result(column="QUANTITY", property="quantity", jdbcType=JdbcType.INTEGER),
        @Result(column="TAXID", property="taxid", jdbcType=JdbcType.INTEGER),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.INTEGER)
    })
    List<Orderdetail> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderdetail
     *
     * @mbg.generated Sat Jan 18 18:25:39 JST 2020
     */
    @Update({
        "update orderdetail",
        "set CUSTID = #{custid,jdbcType=INTEGER},",
          "ITEMID = #{itemid,jdbcType=CHAR},",
          "ORDERDATE = #{orderdate,jdbcType=DATE},",
          "QUANTITY = #{quantity,jdbcType=INTEGER},",
          "TAXID = #{taxid,jdbcType=INTEGER},",
          "STATUS = #{status,jdbcType=INTEGER}",
        "where NO = #{no,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Orderdetail record);
}