package com.atguigu.springcloud.springcloud.dao;

/**
 * @auther jin
 * @create 2022 03 2022/3/23 15:21
 */
import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 */
@Mapper
//@Repository不用Spring的
public interface PaymentDao
{
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}

