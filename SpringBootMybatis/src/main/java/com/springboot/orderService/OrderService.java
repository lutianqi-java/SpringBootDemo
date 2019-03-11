package com.springboot.orderService;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {

    @Insert("INSERT INTO `order`(orderName, money) VALUES(#{orderName}, #{money})")
    int insert(@Param("orderName") String orderName, @Param("money") String money);
}
