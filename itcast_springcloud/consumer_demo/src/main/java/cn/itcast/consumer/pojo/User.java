package cn.itcast.consumer.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @Author Zac Dong
 * @Date 2019/10/29 14:52
 * @Version 1.0
 */
@Data
public class User {
    // id
    private Long id;

    // 用户名
    private String userName;

    // 密码
    private String password;

    // 姓名
    private String name;

    // 年龄
    private Integer age;

    // 性别，1男性，2女性
    private Integer sex;

    // 出生日期
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date birthday;

    // 创建时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date created;

    // 更新时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updated;

    // 备注
    private String note;
}
