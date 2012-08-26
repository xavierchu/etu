package org.summer.etu.service;

import java.util.Date;
import java.util.List;

import org.summer.etu.entity.User;


/**
 * ϵͳ��¼����
 * 
 * @author Administrator
 * 
 */

public interface LoginService {
	// �Ƿ���Ե�¼
	boolean canAccess(User user);

	// ���ض�Ӧ��Ȩ��
	// Permission getPermission(User user);
	// �˺��Ƿ��ѱ�ע��
	boolean nameIsUsed(String name);

	// ��¼���ǳ�ʱ��
	Date getLogonDate();

	// ��ȡIP��ַ
	String getIp();
	
	void regit(User user);
	
	List<User> findAll();
	
	List<User> listPage(int index,int size);

}
