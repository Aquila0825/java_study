package cn.itcast.service;

import cn.itcast.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * @Author Zac Dong
 * @Date 2019/10/27 09:35
 * @Version 1.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    /**
     * 按照id查询用户名
     */
    @Test
    public void queryById() {
        User user = userService.findById(11L);
        System.out.println("user -> " + user);

    }


    /**
     * 新增用户
     */
    @Test
    public void saveUser() {
        User user = new User();
        user.setName("测试");
        user.setAge(88);
        user.setBirthday(new Date());
        user.setCreated(new Date());
        user.setNote("哼哼哈嘿");
        user.setPassword("0825");
        user.setSex(1);
        user.setUpdated(new Date());
        user.setUserName("test");
        userService.saveUser(user);
    }
}
