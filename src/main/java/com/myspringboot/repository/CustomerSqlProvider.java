package com.myspringboot.repository;

import org.apache.ibatis.jdbc.SQL;

public class CustomerSqlProvider {
	public String findbytel(String tel) {
        return new SQL() {{
            SELECT("custid, custname, kana,tel,address");
            FROM("customer");
            if (tel != null && !tel.isEmpty()) {
                WHERE("tel = #{tel}");
            }
        }}.toString();
    }

	public String findMaxid() {
        return new SQL() {{
            SELECT("max(custid) + 1");
            FROM("customer");
        }}.toString();
    }
}
