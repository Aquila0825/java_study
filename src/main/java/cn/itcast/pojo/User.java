package cn.itcast.pojo;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author Zac Dong
 * @Date 2019/10/26 22:38
 * @Version 1.0
 */
@Data
@Table(name = "tb_user")
@Document(indexName = "user", type = "_doc")
public class User implements Serializable {
    @Id
    @KeySql(useGeneratedKeys = true) //开启主键自动回填功能
    private Long id;

    private String userName;

    private String password;

    private String name;

    private Integer age;

    private Integer sex;

    @Field(type = FieldType.Date)
    private Date birthday;

    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String note;

    @Field(type = FieldType.Date)
    private Date created;

    @Field(type = FieldType.Date)
    private Date updated;

}
