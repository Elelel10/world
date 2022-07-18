package day09;
//도형클래스 => 추상클래스
//추상클래스: 일반 멤버변수, 멤버 메소드, + 추상메소드(메소드의 몸체 없이 헤더만 선언한 경우)
//    목적: 상속받은 자식 클래스에서 추상메소드를 오버라이딩 시킬 목적
public abstract class Shape {
	int x,y;//멤버변수
	public String getInfo() {
		return "나는 도형클래스입니다";
	}
	abstract public void area(int a, int b);
	//추상메소드 abstract를 붙여야 한다.
	//추상매소드를 1개 이상 가진 클래스는 역시 추상클래스여야 한다.
	//class 앞에 abstract를 붙여야 한다.
}
