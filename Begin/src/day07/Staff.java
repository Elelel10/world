package day07;

public class Staff {
	private int no;
	private String name;
	private String dept;
	
	public void setNo(int a) {
		no=a;
	}
	public void setName(String b) {
		name=b;
	}
	public void setDept(String c) {
		dept=c;
	}
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	
	public void showInfo() {
		System.out.println("----직원정보----");
		System.out.println("사번: "+no);
		System.out.println("이름: "+name);
		System.out.println("부서: "+dept);
	}
}
