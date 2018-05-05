package com.example.dao;

import com.example.pojo.Order;
import org.springframework.dao.DataAccessException;

import java.sql.Date;
import java.util.List;

/**
 * 订单DAO接口
 * 无需实现类，通过mybatis的OrderMapper.xml实现
 */
public interface IOrderDao {
    /**
     * 获取所有订单
     * @return 订单列表
     */
    public List<Order> getAllOrders();

    /**
     * 获取某时间段内所有订单
     * @param begin 开始时间
     * @param end 结束时间
     * @return 订单列表
     */
    public List<Order> getOrdersListByPeriod(Date begin, Date end);

    /**
     * 获取某一状态下的所有订单
     * @param status 指定状态
     * @return 订单列表
     */
    public List<Order> getOrdersListByStatus(int status);

    /**
     * 根据订单id获取对应订单
     * @param id
     * @return Order对象 or null
     */
    public Order getOrderById(int id);

    /**
     * 插入新的订单
     * @param order
     * @return 数据库变更行数
     * @throws DataAccessException 操作异常
     */
    public int insertOrder(Order order) throws DataAccessException;

    /**
     * 根据id删除订单
     * @param id
     * @return 数据库变更行数
     * @throws DataAccessException
     */
    public int deleteOrderById(int id) throws DataAccessException;

    /**
     * 更新订单
     * @param order 待更新的订单
     * @return 数据库变更行数
     * @throws DataAccessException
     */
    public int updateOrder(Order order) throws DataAccessException;
}