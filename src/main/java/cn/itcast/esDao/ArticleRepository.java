package cn.itcast.esDao;

import cn.itcast.pojo.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @Author Zac Dong
 * @Date 2019/10/27 14:40
 * @Version 1.0
 */
public interface ArticleRepository extends ElasticsearchRepository<Article,Long> {

}
