package day10;

import day11.Member;

//도메인 객체 - VO(Value Object), DTO(Data Transfer Object)
public class Student {
	private int id;
	private String name;
	
	public Student() {
		this(0,"아무개");
	}
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
	}
	//setter, getter----
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
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student st=(Student)obj;
			boolean bool=st.name.equals(this.name)&&st.id==this.id;
			return bool;
		}else {
			return false;
		}
	}
}/////////////////////////
