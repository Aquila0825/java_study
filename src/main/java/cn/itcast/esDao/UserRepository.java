package cn.itcast.esDao;

import cn.itcast.pojo.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @Author Zac Dong
 * @Date 2019/10/27 16:05
 * @Version 1.0
 */
public interface UserRepository extends ElasticsearchRepository<User, Long> {

}
