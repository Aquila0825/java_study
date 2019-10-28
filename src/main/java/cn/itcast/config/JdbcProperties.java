package cn.itcast.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author Zac Dong
 * @Date 2019/10/26 08:43
 * @Version 1.0
 */
//@ConfigurationProperties(prefix = "jdbc")
public class JdbcProperties {

    private String driverClassName;

    private String url;

    private String username;

    private String password;

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
