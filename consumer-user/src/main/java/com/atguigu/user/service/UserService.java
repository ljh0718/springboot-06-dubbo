package com.atguigu.user.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.ticket.service.TicketService;
import org.springframework.stereotype.Service;

/**
 * @author Mr.Z
 * @create 2019/8/14 10:08
 */
@Service
public class UserService {

    @Reference
    TicketService ticketService;

    public void hello(){
        String ticket = ticketService.getTicket();
        System.out.println("买到票了:"+ticket);
    }
}
