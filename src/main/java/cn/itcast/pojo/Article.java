package cn.itcast.pojo;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import javax.persistence.Id;
import java.io.Serializable;

/**
 * @Author Zac Dong
 * @Date 2019/10/27 14:29
 * @Version 1.0
 */
@Data
@Document(indexName = "test", type = "article")
public class Article implements Serializable {
    @Id
    private Long id;

    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String title;

    private String content;
}
