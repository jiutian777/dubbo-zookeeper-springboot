package com.jiutian.service;

import com.jiutian.pojo.Ticket;
import org.apache.dubbo.config.annotation.DubboService;

import java.math.BigDecimal;


/**
 * ClassName: TicketServiceImpl
 * Package: com.jiutian.service
 * Description:
 *
 * @Date: 2022/2/11 20:09
 * @Author: jiutian
 */

// 规定版本号 version，可以用版本号从早期的接口实现过渡到新的接口实现，版本号不同的服务相互间不引用
// interfaceClass，通过反射引用远程接口服务
@DubboService(version = "1.0.0",interfaceClass = TicketService.class)
public class TicketServiceImpl implements TicketService {
    @Override
    public Ticket getTicket() {
        return new Ticket(1001L,"《功夫》",new BigDecimal("150.5"));
    }
}
