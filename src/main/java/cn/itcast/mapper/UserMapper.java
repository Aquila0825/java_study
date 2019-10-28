package cn.itcast.mapper;

import cn.itcast.pojo.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Author Zac Dong
 * @Date 2019/10/27 09:14
 * @Version 1.0
 */
@Repository
public interface UserMapper extends Mapper<User> {
}
