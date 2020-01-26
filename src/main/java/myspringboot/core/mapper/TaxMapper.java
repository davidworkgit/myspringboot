package myspringboot.core.mapper;

import java.util.List;
import myspringboot.core.model.Tax;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface TaxMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.tax
     *
     * @mbg.generated Sun Jan 26 18:55:42 JST 2020
     */
    @Delete({
        "delete from dbo.tax",
        "where TAXID = #{taxid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer taxid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.tax
     *
     * @mbg.generated Sun Jan 26 18:55:42 JST 2020
     */
    @Insert({
        "insert into dbo.tax (TAXID, RATE, ",
        "ENDDATE)",
        "values (#{taxid,jdbcType=INTEGER}, #{rate,jdbcType=DECIMAL}, ",
        "#{enddate,jdbcType=DATE})"
    })
    int insert(Tax record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.tax
     *
     * @mbg.generated Sun Jan 26 18:55:42 JST 2020
     */
    @Select({
        "select",
        "TAXID, RATE, ENDDATE",
        "from dbo.tax",
        "where TAXID = #{taxid,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="TAXID", property="taxid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="RATE", property="rate", jdbcType=JdbcType.DECIMAL),
        @Result(column="ENDDATE", property="enddate", jdbcType=JdbcType.DATE)
    })
    Tax selectByPrimaryKey(Integer taxid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.tax
     *
     * @mbg.generated Sun Jan 26 18:55:42 JST 2020
     */
    @Select({
        "select",
        "TAXID, RATE, ENDDATE",
        "from dbo.tax"
    })
    @Results({
        @Result(column="TAXID", property="taxid", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="RATE", property="rate", jdbcType=JdbcType.DECIMAL),
        @Result(column="ENDDATE", property="enddate", jdbcType=JdbcType.DATE)
    })
    List<Tax> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dbo.tax
     *
     * @mbg.generated Sun Jan 26 18:55:42 JST 2020
     */
    @Update({
        "update dbo.tax",
        "set RATE = #{rate,jdbcType=DECIMAL},",
          "ENDDATE = #{enddate,jdbcType=DATE}",
        "where TAXID = #{taxid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Tax record);
}