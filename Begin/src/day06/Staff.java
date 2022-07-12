package day06;

public class Staff {
	int no;
	String name;
	String dept;
	int num;
	//메소드는 소문자로 시작이 좋음
	public void staffInfo() {
		System.out.println("----직원 정보----");
		System.out.println("사번: "+no);
		System.out.println("이름: "+name);
		System.out.println("소속부서: "+dept);
		System.out.println("연락처: "+num);
	}
}
