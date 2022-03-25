package com.atguigu.springcloud.service;

/**
 * @auther jin
 * @create 2022 03 2022/3/23 15:26
 */
import com.atguigu.springcloud.entities.Payment;

import org.apache.ibatis.annotations.Param;

/**
 */
public interface PaymentService
{
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}


