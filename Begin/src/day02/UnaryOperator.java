package day02;

public class UnaryOperator {
	public static void main(String[] agrs) {
		System.out.println("1. 단항 연산자(부호연산자:+,-)");
		int a=-8;
		System.out.println(+a);
		System.out.println(-a);
		System.out.println("2. 증감연산자 : ++ , --");
		int b=5;
		long c=9;
		b++;//b=b+1
		c--;//c=c-1
		System.out.println(b);//6
		System.out.println(c);//8
		++b;
		--c;
		System.out.println(b);//7
		System.out.println(c);//7
		//++, --가 단독으로 사용될 때는 변수 앞에오나 뒤에오나 별 차이 없다.
		//하지만 다른 수식과 함께 사용되면 ++,--가 앞에 오는 것과 뒤에 오는 것은 차이가 있다.
		float d=5.3f;
		double e=7.3;
		System.out.println(d++);//5.3 출력 먼저하고 +1
		System.out.println("d: "+d);//6.3
		
		System.out.println(e--);//7.3 출력 먼저하고 -1
		System.out.println("e: "+e);//6.3
		
		int x=10;
		int y=x++;//y에 10 넣고 x+1됨
		System.out.println("x="+x);//11
		System.out.println("y="+y);//10
		
		x=10;
		int z=++x;//x+1하고 z에 값 넣음
		System.out.println("x="+x);//11
		System.out.println("z="+z);//11
		
		System.out.println("3.비트별 not연산자: ~");
		//정수값을 비트(2진수)로 바꾸고 연산을 수행하는데,
		//비트별 not 연산자는 1을 0으로 0은 1로 바꾸는 연산자
		// 3 : 00000000 00000000 00000000 00000011 (양수)
		//~3 : 11111111 11111111 11111111 11111100 (음수)
		//-1*2^31 + 1*2^30 + ... = 앞에 다 떼고 맨 뒤에 100만 10진수로 바꾸면 됨
		//-1*2^2 + 0 + 0 = -4
		int m=3;
		System.out.println(m);
		System.out.println(~m);
		
		//문제1]
		int n=0xfffffff1;
		//1111 1111 1111 1111 1111 1111 1111 0001
		//0000 0000 0000 0000 0000 0000 0000 1110
		//14 = 0x0000000e
		System.out.println("~n:"+(~n));
		// 42 : 00000000 00000000 00000000 00101010
		//~42 : 11111111 11111111 11111111 11010101
		//-1*2^6+1*2^4+1*2^2+1*2^0 = -43
		System.out.println(~42);
		
		System.out.println("4. 논리 부정 연산자 : !");
		//boolean형에만 사용가능. int형에는 사용 불가
		//true를 false로, false를 true로 바꾼다.
		boolean bo=true;//true
		System.out.println(!bo);//false
		//System.out.println(!(3>2));
		
		int fo=5;
		System.out.println(fo==5.0);//==등가연산자 : 기본자료형에서는 값이 같은지 비교.
		System.out.println(fo!=5.0);//!= : 기본자료형에서는 값이 다르면 true, 같으면 false.
	}

}
