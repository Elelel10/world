package day02;

public class MyOperator {
	public static void main(String[] agrs) {
		System.out.println("1. 산술 연산자-----");
		//+, -, *, /(나눈 몫), %(나머지 값)
		int a=10;
		System.out.println(a-6);//4
		System.out.println(a*3);//30
		System.out.println(a/3);//3 int/int => 결과 int
		System.out.println(a%3);//1
		//float%int=>float
		//byte*char=>int
		double b=10;
		System.out.println(b/3);//double/int =>결과 double
		System.out.println(b%3);
		
		// 42 : 00000000 00000000 00000000 00101010
		System.out.println("2. Shift 연산자(<<, >>, >>>)---");
		System.out.println(42<<3);
		System.out.println(42>>3);
		System.out.println(42>>>3);
		/* 시프트 연산자
		1) >> :  오른쪽으로 비트수 만큼 이동
					앞에 남은 빈칸은 부호비트로 채운다.
	    2) << : 왼쪽으로 비트수 만큼 이동
					뒤에 남은 빈칸은 0으로 채운다.
		3) >>> : 오른쪽으로 비트수 만큼 이동
					앞에 남은 빈칸은 무조건 0으로 채운다.
	*/
		//-43 : 11111111 11111111 11111111 11010101
		System.out.println(-43<<2);
		//11111111 11111111 11111111 01010100 -172
		System.out.println(-43>>2);
		//11111111 11111111 11111111 11110101 -11
		System.out.println(-43>>>2);
		//00111111 11111111 11111111 11110101 
		
		System.out.println("3. 비교연산자: ==, 1=, >, >=, <, <=, instanceof");
		int m=60;
		int n=60;
		/* 1) > : 큰가?
		 * 2) >= : 크거나 같은가?
		 * 3) < : 작은가?
		 * 4) <= : 작거나 같은가?
		 * 5) == : 같은가?
		 * 6) != : 다른가?
		 * 7) 참조변수 instanceof 클래스명 : 참조변수가 클래스의 객체인가?
		 */
		
		System.out.println(m>=n);
		
		if(m>=n) {
			System.out.println("@@@@");
			
		}else if(m<n) {
			System.out.println("####");
		}
		

	}

}
