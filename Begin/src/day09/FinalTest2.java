package day09;
class SuperDemo{
	void sub() {
		System.out.println("SuperDemo's sub()");
	}
	final void bar() {
		System.out.println("SuperDemo's bar()");
	}
}//////////////////////
class SubDemo extends SuperDemo{
	//sub() 오버라이딩하기
	@Override
	void sub() {
		System.out.println("sub()*******");
	}
	//final + method : 오버라이딩 할 수 없다
	//bar()오버라이딩 하기
	//@Override
	/*void bar() {
		System.out.println("bar()*******");
	
	}*/
	
}/////////////////////////////
public class FinalTest2 {

	public static void main(String[] args) {
		//SuperDemo의 sub, bar 출력
		SuperDemo s=new SuperDemo();
		s.sub();
		s.bar();
		SubDemo sd=new SubDemo();
		sd.sub();
		sd.bar();
	}

}
