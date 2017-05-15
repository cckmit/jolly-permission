package com.jolly.upms.rpc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 服务启动类
 * Created by berkeley on 2017/2/3.
 */
public class ZhengUpmsRpcServiceApplication {

	private static Logger _log = LoggerFactory.getLogger(ZhengUpmsRpcServiceApplication.class);

	public static void main(String[] args) {
		_log.info(">>>>> jolly-upms-rpc-service 正在启动 <<<<<");
		new ClassPathXmlApplicationContext("classpath:META-INF/spring/*.xml");
		_log.info(">>>>> jolly-upms-rpc-service 启动完成 <<<<<");
	}

}
