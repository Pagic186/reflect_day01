package cn.itcast.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectDemo {
	
	/**
	 * 反射构造函数
	 */
	@Test
	public void constractor() throws Exception {
		//1.获取class对象
		Class clazz = Student.class;
		//2.通过clazz获取构造函数
		Constructor c = clazz.getConstructor(null);
		//3.使用构造函数来构造类的对象
		Student stu = (Student) c.newInstance(null);
		System.out.println(stu);
		
		//反射有参数的构造函数
		Constructor c2 = clazz.getConstructor(int.class,String.class,int.class);
		Student stu2 = (Student) c2.newInstance(1,"张三",18);
		System.out.println(stu2);
	}
	
	/**
	 * 反射类中的成员属性
	 */
	@Test
	public void field() throws Exception {
		Student stu = new Student();
		Class clazz = stu.getClass();
		Field nameField = clazz.getDeclaredField("name");
		//暴力反射
		nameField.setAccessible(true);
		nameField.set(stu, "王五");
		Object obj = nameField.get(stu);
		System.out.println(obj);
		
	}
	
	/**
	 * 反射类中的成员方法
	 */
	@Test
	public void method() throws Exception{
		Class clazz = Class.forName("cn.itcast.reflect.Student");
		Method m = clazz.getMethod("setName", String.class);
		//通过Class获取类的实例
		Student stu = (Student) clazz.newInstance();
		m.invoke(stu, "赵六");
		System.out.println(stu);
	}
}
