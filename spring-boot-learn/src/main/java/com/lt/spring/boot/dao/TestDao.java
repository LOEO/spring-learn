package com.lt.spring.boot.dao;

import org.springframework.stereotype.Repository;

/**
 * 功能：
 *
 * @author：dell
 * @create：2017-03-11 16:51:48
 * @version：2017 Version：1.0
 * @company：北京黄羊 Created with IntelliJ IDEA
 */
@Repository("testDao")
public class TestDao implements IDao {
	@Override
	public String find() {
		return this.getClass().getName();
	}

	@Override
	public String findAll() {
		return null;
	}
}
