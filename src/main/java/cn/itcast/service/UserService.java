package cn.itcast.service;

import cn.itcast.mapper.UserMapper;
import cn.itcast.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author Zac Dong
 * @Date 2019/10/27 01:20
 * @Version 1.0
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 按照id查询用户
     *
     * @param id
     * @return
     */
    public User findById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    /**
     * 新增用户
     *
     * @param user
     */
    @Transactional
    public void saveUser(User user) {
        System.out.println("添加用户...");
        userMapper.insertSelective(user);
    }

}
