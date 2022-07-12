package day07;
//멤버변수들을 모두 캡슐화하고
//setter,getter메소드를 구성하세요
public class Student {
	private int no;
	private String name;
	private String major;
	
	public void setNo(int no) {
		//멤버변수와 지역변수의 이름이 동일할 경우
		//지역변수가 우선권이 있다.
		//멤버변수와 지역변수를 구분하기 위해서
		//멤버변수 앞에 this. 을 붙인다.
		//this:자기자산의 객체(instance)를 참조할 때 사용하는 키워드
		this.no=no;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setMajor(String major) {
		this.major=major;
	}
	public int getNo() {
		return no;//this.no인데 this. 생략
	}
	public String getName() {
		return name;
	}
	public String getMajor() {
		return major;
	}
	
	public void showInfo() {
		System.out.println("----학생정보----");
		System.out.println("학번: "+no);
		System.out.println("이름: "+name);
		System.out.println("전공: "+major);
	}
		
}
