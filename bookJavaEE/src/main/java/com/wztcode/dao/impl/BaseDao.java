package com.wztcode.dao.impl;

import com.wztcode.utils.JdbcUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * 用来操作数据库
 */
public abstract class BaseDao {

    private final QueryRunner queryRunner = new QueryRunner();

    /**
     * update 方法相当于 数据库 的 update/insert/delete
     *
     * @param sql  执行的 sql 语句
     * @param para 参数
     * @return 如果返回 -1, 表示操作失败, 否则成功
     */
    public int update(String sql, Object... para) {
        Connection connection = JdbcUtils.getConnection();
        try {
            return queryRunner.update(connection, sql, para);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                JdbcUtils.close(connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return -1;
    }

    /**
     * 查询单个对象
     *
     * @param type 传入的 User 对象
     * @param sql  执行的 SQL 语句
     * @param para 参数
     * @return 返回对象 user
     * @throws SQLException
     */
    public <T> T queryForOne(Class<T> type, String sql, Object... para) {
        Connection connection = JdbcUtils.getConnection();
        T query = null;
        try {
            query = queryRunner.query(connection, sql, new BeanHandler<T>(type), para);
            JdbcUtils.close(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return query;
    }

    /**
     * 查询多个对象
     * @param type 类型
     * @param sql sql 语句
     * @param para 参数
     * @param <T>
     * @return
     * @throws SQLException
     */
    public <T> List<T> queryForList(Class<T> type, String sql, Object... para)  {
        Connection connection = JdbcUtils.getConnection();
        List<T> query = null;
        try {
            query = queryRunner.query(connection, sql, new BeanListHandler<T>(type), para);
            JdbcUtils.close(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return query;
    }

    /**
     * 查询单个值
     * @param sql sql 语句
     * @param para 参数
     * @return 返回单个值
     * @throws SQLException
     */
    public Object queryForStringValue(String sql, Object... para) {
        Connection connection = JdbcUtils.getConnection();
        Object query = null;
        try {
            query = queryRunner.query(connection, sql, new ScalarHandler<>(), para);
            JdbcUtils.close(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return query;
    }



}
