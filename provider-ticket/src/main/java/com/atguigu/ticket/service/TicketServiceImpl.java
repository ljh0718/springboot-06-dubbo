package com.atguigu.ticket.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.stereotype.Component;

/**
 * @author Mr.Z
 * @create 2019/8/14 10:05
 */
@EnableDubbo
@Component
@Service//将服务发布出去
public class TicketServiceImpl implements TicketService {

    @Override
    public String getTicket() {
        return "《上海堡垒》";
    }
}
