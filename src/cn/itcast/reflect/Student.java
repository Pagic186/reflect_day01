package cn.itcast.reflect;

public class Student {
	
	private int id;
	private String name;
	private int age;
	
	/**
	 * 无参构造函数
	 */
	public Student() {
		
	}
	
	/**
	 * 有参构造函数
	 */
	public Student (int id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	/**
	 * get,set方法
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	/**
	 * 自我介绍的方法
	 */
	private void info() {
		System.out.println("我的名字叫"+name+",我今年"+age+"岁,我的ID是"+id);
	}
	
}
