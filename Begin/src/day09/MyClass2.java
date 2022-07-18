package day09;
interface Inter1{
	void a();
}////////////////////
interface Inter2{
	String b();
}///////////////////

abstract class AbsClass{
	abstract void c();
}//////////////////
//인터페이스가 인터페이스를 상속받을 때는 extends로 상속받고, 다중 상속도 가능하다
interface HisInter extends Inter1, Inter2{
	String STR="Hello";
}//////////////////
//[1] MyClass2가 AbsClass와 HisInter를 상속받도록 하세요
//		에러 없게 처리하세요 

public class MyClass2 extends AbsClass implements HisInter {
	public void a() {
		System.out.println("MyClass2's a");
	}
	public String b() {
		//System.out.println("MyClass2's b");
		return "hi";
	}
	void c() {
		System.out.println("MyClass2's c");
	}
	public static void main(String[] args) {
		//[2] MyClass2타입의 객체 생성해서 메소드 각각 호출하고
		//STR값도 출력해보기
		MyClass2 mc=new MyClass2();
		mc.a();		
		String d=mc.b();
		System.out.println(d);
		mc.c();
		System.out.println(MyClass2.STR);
		//[3] HisInter타입의 변수 선언하고 MyClass2객체 생성해서
		//메소드 각각 호출하고 STR값 출력해보기
		HisInter h=new MyClass2();
		h.a();
		String e=h.b();
		System.out.println(e);
		((MyClass2)h).c();
		System.out.println(HisInter.STR);
		
		//[4] AbsClass타입의 변수 선언하고 MyClass2객체 생성해서
		//메소드 각각 호출하고 STR값 출력해보기
		AbsClass ac=new MyClass2();
		((MyClass2)ac).a();
		String f=((MyClass2)ac).b();
		System.out.println(f);
		ac.c();
	    System.out.println(STR);
	}

}
