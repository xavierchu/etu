package org.summer.etu.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.summer.etu.page.LimitPage;

public interface JdbcDao<PK, T> {
	/**
	 * ����
	 * 
	 * @param entiry
	 */
	void insert(T entiry);

	/**
	 * ����
	 * @param entity
	 */
	void update(T entity);

	/**
	 * ɾ��
	 * @param pk
	 */
	void delete(PK pk);

	/**
	 * ����ȫ��
	 * @param sql
	 * @return
	 */
	List<T> findAll(String sql);

	/**
	 * ���id����
	 * @param pk
	 * @return
	 */
	T findById(PK pk);

	/**
	 * ��ҳ
	 * @param sql
	 * @param index
	 * @param size
	 * @param page ��ҳ��
	 * @return
	 */
	List<T> getLimipage(String sql, int index, int size, LimitPage page);

	/**
	 * ��������
	 * @param sql
	 * @return
	 */
	int getCount(String sql);

	/**
	 * ��ҵ��㷵��jdbcTemplateʵ��
	 * @return
	 */
	JdbcTemplate getJdbcTemplate();
}
