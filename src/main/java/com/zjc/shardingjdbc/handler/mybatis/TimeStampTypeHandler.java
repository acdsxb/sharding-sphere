package com.zjc.shardingjdbc.handler.mybatis;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.*;

/**
 * create by zhaojinchao on 2019/1/4
 */
public class TimeStampTypeHandler extends BaseTypeHandler<Long> {
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Long parameter, JdbcType jdbcType) throws SQLException {
        ps.setTimestamp(i, new Timestamp(parameter));

    }

    @Override
    public Long getNullableResult(ResultSet rs, String columnName) throws SQLException {
        Timestamp time = rs.getTimestamp(columnName);
        if (time !=null) {
            return time.getTime();
        }
        return null;
    }

    @Override
    public Long getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        Timestamp time = rs.getTimestamp(columnIndex);
        if (time !=null) {
            return time.getTime();
        }
        return null;
    }

    @Override
    public Long getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        Timestamp time = cs.getTimestamp(columnIndex);
        if (time !=null) {
            return time.getTime();
        }
        return null;
    }
}
