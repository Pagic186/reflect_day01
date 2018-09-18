package cn.itcast.reflect;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;

public class MyBeanUtil {
	/**
	 * 自定义方法,使用反射技术封装对象
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
	
	public static void main(String[] args) {
		
	}
}
