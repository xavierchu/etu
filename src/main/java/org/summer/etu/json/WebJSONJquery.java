package org.summer.etu.json;

import java.io.IOException;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.util.Assert;


/**
 * 
 * @author Rose.Dawson
 * 
 */
public class WebJSONJquery implements WebJSONString {
	private List jsonList = new ArrayList();
	private ObjectMapper objectMapper;
	private static final String DEFAULT_DATE_PATTERN = "yyyy-MM-dd";

	public WebJSONJquery(List objList, boolean hasDate, String dateType) {
		Assert.isTrue(objList.size() > 0, "��ʽ��JSON�쳣���б�Ϊ�գ�");
		jsonList = objList;
		objectMapper = new ObjectMapper();
		if (hasDate) {
			objectMapper.setDateFormat(DateFormat(dateType));
		}

	}

	public String getJsonString() {
		try {
			StringWriter sw = new StringWriter();
			objectMapper.writeValue(sw, jsonList);
			String json = sw.toString();
			sw.close();
			return json;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

	private DateFormat DateFormat(String dateType) {
		DateFormat dateFormat = null;
		try {
			dateFormat = new SimpleDateFormat(dateType);
		} catch (Exception ex) {
			dateFormat = new SimpleDateFormat(DEFAULT_DATE_PATTERN);
		}
		return dateFormat;

	}

}
