package com.jiutian.service.impl;

import com.jiutian.pojo.Ticket;
import com.jiutian.service.TicketService;
import com.jiutian.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * ClassName: UserServiceImpl
 * Package: com.jiutian.service
 * Description:
 *
 * @Date: 2022/2/11 21:49
 * @Author: jiutian
 */
@Service
public class UserServiceImpl implements UserService {

    /**
     * 远程引用指定的服务，他会按照全类名进行匹配，看谁给注册中心注册了这个全类名
     * 引用，Pom坐标，可以定义路径相同的接口名
     * 版本号要一致
     */
    @DubboReference(version = "1.0.0")
    private TicketService ticketService;

    @Override
    public Ticket buyTicket() {
        Ticket ticket = ticketService.getTicket();
        System.out.println(ticket.toString());
        return ticket;
    }

}
