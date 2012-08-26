package org.summer.etu.common;

import java.util.Date;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class ContextInit implements InitializingBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		ServerInfoHolder.setStartTime(String.valueOf(new Date().getTime()));
		System.out.println("---------------- " + ServerInfoHolder.getStartTime());
	}

}
