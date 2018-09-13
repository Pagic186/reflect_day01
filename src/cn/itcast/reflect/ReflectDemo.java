package cn.itcast.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.Test;

public class ReflectDemo {
	
	/**
	 * ���乹�캯��
	 */
	@Test
	public void constractor() throws Exception {
		//1.��ȡclass����
		Class clazz = Student.class;
		//2.ͨ��clazz��ȡ���캯��
		Constructor c = clazz.getConstructor(null);
		//3.ʹ�ù��캯����������Ķ���
		Student stu = (Student) c.newInstance(null);
		System.out.println(stu);
		
		//�����в����Ĺ��캯��
		Constructor c2 = clazz.getConstructor(int.class,String.class,int.class);
		Student stu2 = (Student) c2.newInstance(1,"����",18);
		System.out.println(stu2);
	}
	
	/**
	 * �������еĳ�Ա����
	 */
	@Test
	public void field() throws Exception {
		Student stu = new Student();
		Class clazz = stu.getClass();
		Field nameField = clazz.getDeclaredField("name");
		//��������
		nameField.setAccessible(true);
		nameField.set(stu, "����");
		Object obj = nameField.get(stu);
		System.out.println(obj);
		
	}
	
	/**
	 * �������еĳ�Ա����
	 */
	@Test
	public void method() throws Exception{
		Class clazz = Class.forName("cn.itcast.reflect.Student");
		Method m = clazz.getMethod("setName", String.class);
		//ͨ��Class��ȡ���ʵ��
		Student stu = (Student) clazz.newInstance();
		m.invoke(stu, "����");
		System.out.println(stu);
	}
}
