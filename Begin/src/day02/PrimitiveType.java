package day02;

public class PrimitiveType {
	public static void main(String[] args) {
		System.out.println("기본자료형---------");
		//ctrl+D : 현재커서행 삭제
		//ctrl+F11 : 현재파일 실행(java)
		//ctrl+S : 저장+자동으로 컴파일(javac)
		int a=10;
		int b=010;//정수(8진수) : 8진수는 앞에 0을 접두어로 붙인다.(0~7로 표현) 1*8^1 + 0*8^0
		System.out.println("a="+a);
		System.out.println("b="+b);
		int c=0123;//1*8^2 + 2*8^1 + 3*8^0 = 83
		System.out.println("c="+c);
		
		int d=0x12;//정수(16진수) : 16진수는 앞에 0x를 접두어로 붙인다.
		//1*16^1 + 2*16^0 = 18
		//0~15로 표현 : 0~9 A(10) B(11) C(12) D(13) E(14) F(15)
		int e=0x2ac;
		//2*16^2 + 10*16^1 + 12*16^0 = 684
		System.out.println("d="+d);
		System.out.println("e="+e);
		
		char c1='a';
		System.out.println("c1="+c1);
		char c2='0';
		System.out.println("c2="+c2);
		//int 미만의 자료형 (byte,short,char) : 연산에 사용되면 int로 자동 형변환
		char c3=(char)(1+c1);//아스키 코드 97+48
		System.out.println(c3);
		
		double d2=.456e+2;//0.456*10^2=45.6
		System.out.println(d2);

	}

}
