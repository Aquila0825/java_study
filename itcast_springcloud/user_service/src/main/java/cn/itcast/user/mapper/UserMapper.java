package cn.itcast.user.mapper;

import cn.itcast.user.pojo.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Author Zac Dong
 * @Date 2019/10/29 15:13
 * @Version 1.0
 */
@Repository
public interface UserMapper extends Mapper<User> {
}
