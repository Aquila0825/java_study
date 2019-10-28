package cn.itcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author Zac Dong
 * @Date 2019/10/25 22:29
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan("cn.itcast.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
