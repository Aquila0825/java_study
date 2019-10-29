package cn.itcast.consumer.controller;

import cn.itcast.consumer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author Zac Dong
 * @Date 2019/10/29 16:42
 * @Version 1.0
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public User queryById(Long id) {
        String url = "http://localhost:9091/user/11";
        return restTemplate.getForObject(url, User.class);
    }

}
