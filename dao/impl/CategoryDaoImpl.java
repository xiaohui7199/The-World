package cn.bite.travel.dao.impl;

import cn.bite.travel.dao.CategoryDao;
import cn.bite.travel.domain.Category;
import cn.bite.travel.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * 旅游分类dao的实现层
 */
public class CategoryDaoImpl implements CategoryDao {
    //声明模板对象,执行查询
    private JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource()) ;
    @Override
    public List<Category> findAll() {
        //准备sql
        String sql = "select * from tab_category" ;
        return template.query(sql,new BeanPropertyRowMapper<Category>(Category.class));
    }
}
