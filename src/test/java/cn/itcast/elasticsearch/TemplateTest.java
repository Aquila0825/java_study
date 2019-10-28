package cn.itcast.elasticsearch;

import cn.itcast.esDao.UserRepository;
import cn.itcast.mapper.UserMapper;
import cn.itcast.pojo.Article;
import cn.itcast.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author Zac Dong
 * @Date 2019/10/27 14:47
 * @Version 1.0
 */
@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class TemplateTest {
    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    /**
     * 测试创建index
     */
    @Test
    public void createIndex() {
        //根据实体类的@Document注解信息来创建索引
        elasticsearchTemplate.createIndex(Article.class);

        //配置映射，根据实体类的id，field等字段来自动创建映射
        elasticsearchTemplate.putMapping(Article.class);
    }

    /**
     * 测试删除index
     */
    @Test
    public void deleteIndex() {
        elasticsearchTemplate.deleteIndex(Article.class);
    }


    /**
     * 向elasticsearch中批量添加userList
     */
    @Test
    public void saveUser() {
        List<User> userList = userMapper.selectAll();
        Iterable<User> users = userRepository.saveAll(userList);
        log.info("【userList】= {}", users);
    }

    /**
     * 从elasticsearch中批量删除
     */
    @Test
    public void deleteAll() {
        userRepository.deleteAll(userRepository.findAll());
    }

}
