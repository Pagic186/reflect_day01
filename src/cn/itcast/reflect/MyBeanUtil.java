package cn.itcast.reflect;

import java.lang.reflect.Field;

import javax.servlet.http.HttpServletRequest;

public class MyBeanUtil {
	/**
	 * �Զ��巽��,ʹ�÷��似����װ����
	 */
	
	public static void populate(Object obj,HttpServletRequest request) {
		Class clazz = obj.getClass();
		Field[] fields = clazz.getDeclaredFields();
		try {
			for (Field field : fields) {
				field.setAccessible(true);
				String fieldName = field.getName();
				String value = request.getParameter(fieldName);
				field.set(obj, value);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
}
