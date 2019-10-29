package cn.itcast.user.controller;

import cn.itcast.user.pojo.User;
import cn.itcast.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Zac Dong
 * @Date 2019/10/29 15:39
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 根据id查询用户
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public User queryById(@PathVariable Long id) {
        return userService.queryById(id);
    }

}
