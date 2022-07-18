package day09;
//MyInter 상속 받아서 에러나지 않게 처리
//인터페이스는 implements로 상속
//YourInter도 상속받아 에러나지 않게 처리

public class MyClass implements MyInter,YourInter{
	@Override
	public void demo() {
		System.out.println("MyClass's demo()");
	}
	public int inter1() {
		return 100;
	}
	public void inter2(String a) {
		System.out.println(a.toUpperCase());
	}
	public static void main(String[] args) {
		//MyInter mi=new MyInter();[x]
		//인터페이스는 타입선언은 할 수 있으나
		//new에서 객체 생성은 할 수 없다
		MyInter mi=new MyClass();
		YourInter yi=new MyClass();
		
		//demo
		mi.demo();		
		//inter1
		System.out.println(((MyClass)mi).inter1());
		System.out.println(yi.inter1());
		//inter2		
		yi.inter2("hello");
		//PI
		System.out.println(YourInter.PI);
		System.out.println(MyClass.PI);
	}
}
