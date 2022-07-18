package my.mypack;
//패키지 선언문: 제일 첫 문장으로 기술해야 한다
//패키지명과 디렉토리명은 대소문자까지 같아야한다
public class AAA {//public 클래스: 어디서든 접근 가능한 지정자
	public static void main(String [] agrs) {
		BBB b=new BBB();
		b.funcB();
		AAA a=new AAA();
		a.funcA();
	}
	public void funcA() {
		System.out.println("AAA");
	}
}/////////////////
class BBB{//생략형 지정자(default 지정자, package 지정자): 같은 패키지 내에서만 접근 가능
	public void funcB() {
		System.out.println("BBB");
	}
}///////////////