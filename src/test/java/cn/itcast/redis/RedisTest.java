package cn.itcast.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Set;

/**
 * @Author Zac Dong
 * @Date 2019/10/27 10:23
 * @Version 1.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class RedisTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void test() {
        redisTemplate.boundZSetOps("ZSet").add("aaa", 3);
        redisTemplate.boundZSetOps("ZSet").add("bbb", 2);
        redisTemplate.boundZSetOps("ZSet").add("ccc", 1);
        Set zSet = redisTemplate.boundZSetOps("ZSet").range(0, -1);
        System.out.println(zSet);
    }

}
