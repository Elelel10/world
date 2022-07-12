package day06;

public class Teacher {
	int no;
	String name;
	String sub;
	int num;
	
	public void TeacherInfo() {
		System.out.println("----교사 정보----");
		System.out.println("교번: "+no);
		System.out.println("이름: "+name);
		System.out.println("담당과목: "+sub);
		System.out.println("연락처: "+num);
	}
}
