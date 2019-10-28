package cn.itcast.config;

import cn.itcast.interceptor.MyInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author Zac Dong
 * @Date 2019/10/26 23:04
 * @Version 1.0
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    /**
     * 将 interceptor 注册到 spring IOC 容器
     *
     * @return
     */
    @Bean
    public MyInterceptor myInterceptor() {
        return new MyInterceptor();
    }

    /**
     * 往拦截器链添加自定义拦截器
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //通过registry添加myInterceptor拦截器，设置拦截路径："/*"
        registry.addInterceptor(myInterceptor()).addPathPatterns("/*");
    }
}
