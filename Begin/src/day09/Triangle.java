package day09;
//직삼각형: 가로*세로/2
//shape추상클래스를 상속받아서 오류없게 메소드 재정의
public class Triangle extends Shape{
	public void area(int c, int d) {
		int l=c*d/2;
		System.out.println("직삼각형 면적: "+l);
	}
}
