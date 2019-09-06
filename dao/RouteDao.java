package cn.bite.travel.dao;

import cn.bite.travel.domain.Route;

import java.util.List;

/**
 * 旅游线路商品的dao接口层
 */
public interface RouteDao {

    /**
     * 通过分类id查询总记录数
     * @param cid
     * @return
     */
    public int findTotalPage(int cid,String rname) ;


    /**
     * 查询当前页面数据集合,通过分页查询
     * @param cid
     * @param start
     * @param pageSize
     * @return
     */
    public List<Route> findByPage(int cid ,int start,int pageSize,String rname) ;
}
