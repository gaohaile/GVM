package com.dt.dao;

import java.util.List;
import java.util.Map;

import com.dt.util.Paging;

public interface EntityDao {
	public List<Object> createQuery(final String queryString);

	public Paging createQueryFy(final Class ca, final Map<String, Object> map,
			final Map<String, Object> pxmap, final Integer curPage,
			final Integer pageSize);

	/**
	 * Criteria的查询
	 * 
	 * @param cs 查询类
	 * @param map 查询条件 (key：字段名,value：字段值)
	 * @param orderMap 排序条件 (key：字段名,value：字段值)
	 * @return 对象集合
	 */
	@SuppressWarnings("unchecked")
	public List createCriteria(final Class cs, final Map<String, Object> map, Map<String, Object> orderMap);

	/**
	 * 带有分页的查询
	 * @param cs 查询类
	 * @param map 查询条件 当前页码
	 * @param pageSize 每页显示条数
	 * @return 对象集合
	 */
	public Paging createQueryPaging(final Class cs,
			final Map<String, Object> map, final Map<String, Object> orderMap,
			final Integer curPage, final Integer pageSize);
	public Paging createQueryPaging(final String queryString,final String countQueryString,final String type,final Integer curPage,final Integer pageSize);
	public Object saveOrUpdate(final Object model);

	public void delete(final Object model);

	public Object getObjectById(final Class cs, final Integer id);
	/**
	 * 执行sql语句
	 * @param queryString
	 * @return
	 */
	public List<Object[]> createSqlQuery(final String queryString);
	/**
	 * 使用SQL更新并返回条数
	 * @author ztb
	 * 2014-1-26 上午10:36:14
	 * @param sql
	 * @return
	 */
	public int updateBySQL(String sql,String type);

}
