package com.lt.spring.boot.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lt.spring.boot.dao.TestDao;
import com.lt.spring.boot.event.CustomEvent;
import com.lt.spring.boot.event.CustomEventPublisher;

/**
 * 功能：
 *
 * @author：dell
 * @create：2017-03-11 16:50:47
 * @version：2017 Version：1.0
 * @company：北京黄羊 Created with IntelliJ IDEA
 */
@Service
@Slf4j
public class TestService {
	@Autowired
	private TestDao testDao;

	@Autowired
	private CustomEventPublisher customEventPublisher;


	/**
	 * 发布事件测试
	 */
	public void testEvent() {
		customEventPublisher.publishEvent(new CustomEvent(this, "Content", "Type"));
	}

	public void test() {
		log.debug("调用test");
	}

}
