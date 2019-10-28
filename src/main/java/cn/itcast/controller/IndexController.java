package cn.itcast.controller;

import cn.itcast.pojo.User;
import io.netty.util.internal.ObjectUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author Zac Dong
 * @Date 2019/10/27 17:00
 * @Version 1.0
 */
@Controller
@Slf4j
public class IndexController {

    @GetMapping("/index")
    public ModelAndView index(HttpServletRequest request) {
        User user = new User();
        user.setUserName("Zac Dong");
        user.setPassword("123456");
        user.setAge(23);
        ModelAndView mv = new ModelAndView();
        mv.addObject("user", user);
        mv.setViewName("/userInfo.html");
        return mv;
    }
}
