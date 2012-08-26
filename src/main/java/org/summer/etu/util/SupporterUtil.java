package org.summer.etu.util;

import java.util.UUID;

import org.springframework.util.DigestUtils;

/**
 * ���߰���
 * 
 * @author Administrator
 * 
 */
public final class SupporterUtil {
	private SupporterUtil() {

	}

	/**
	 * ����32ΪUUID�������������
	 * 
	 * @return
	 */
	public static String getId() {
		StringBuffer id = new StringBuffer("");
		UUID uuid = UUID.randomUUID();
		String uuid_str = uuid.toString();
		String[] uuid_array = uuid_str.split("-");
		for (String string : uuid_array) {
			id.append(string);
		}
		return id.toString();
	}

	/**
	 * �������ļ���
	 * 
	 * @param psw
	 * @return
	 */
	public static String getMd5Psw(String psw) {
		if (psw == null || psw.length() == 0)
			return "";
		return DigestUtils.md5DigestAsHex(psw.getBytes());
	}
	
}
