package cn.itcast.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * @Author Zac Dong
 * @Date 2019/10/25 22:31
 * @Version 1.0
 */
@RestController
public class HelloController {

    @Autowired
    private DataSource dataSource;

    @Value("${itcast.url}")
    private String itcastUrl;

    @Value("${itheima.url}")
    private String itheimaUrl;

    @GetMapping("hello")
    public String hello() {
        System.out.println("datasource = " + dataSource);
        System.out.println("itcastUrl:" + itcastUrl);
        System.out.println("itheima:" + itheimaUrl);
        return "hello, spring boot!";
    }
}
