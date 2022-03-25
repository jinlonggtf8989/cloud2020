package com.atguigu.springcloud.service.impl;

/**
 * @auther jin
 * @create 2022 03 2022/3/23 15:28
 */
import com.atguigu.springcloud.service.PaymentService;
import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 */
@Service
public class PaymentServiceImpl implements PaymentService
{
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment)
    {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id)
    {
        return paymentDao.getPaymentById(id);
    }
}

