package day04;

public class MathTest {

	public static void main(String[] args) {
		//java.lang.Math클래스의 멤버변수
		//public static final double PI: 상수 원주율(3.14)
		System.out.println(Math.PI);
		//static붙은 변수들은 앞에 클래스명을 붙여준다."클래스명.변수"식으로 접근한다.
		
		//메소드: 기능을 가지고 있다.(c언어에서 function역할)
		//static메소드(클래스 메소드): 클래스명.메소드명(값)
		//public static double sqrt​(double a) : 매개변수 a의 제곱근을 구해서 반환한다.
		double b=Math.sqrt(64);
		System.out.println("64의 제곱근: "+b);
		
		double num=45.0123;
		//num의 올림값,내림값,반올림값을 구해 출력 Math클래스의 메소드 이용
		double c=Math.ceil(num);
		double d=Math.floor(num);
		num=45.678;
		long e=Math.round(num);
		int f=Math.round((float)num);
		System.out.println(c+" "+d+" "+e+" "+f);
		//public static double ceil​(double a) : a의 올림값을 반환
		
		//public static double floor​(double a) : a의 내림값을 반환
		
		//public static int round​(float a) : a의 반올림값을 int로 반환
		//public static long round​(double a)
		
		//public static double random()
		//:0.0<=r<1.0 사이의 임의 난수를 발생시켜 반환해준다.
		double g=Math.random();
		System.out.println("g: "+g);
		//[1] 0<=r4<10 사이의 임의의 정수를 발생시켜 출력하세요=>random() 활용
		double r4=Math.random();
		int n=(int)(r4*10);
		System.out.println("n: "+n);
		//[2] 5<=r5<15 사이의 임의의 정수를 발생시켜 출력하세요
		int n2=(int)(Math.random()*10+5);
		System.out.println("n2: "+n2);
		
		//int x=(int)(Math.random()*범위+시작수)
		//[3] 16<=r6<48 사이의 임의의 정수
		int r6=(int)(Math.random()*32+16);
		System.out.println("r6: "+r6);
		//[4] 알파벳 대분자를 무작위로 추출해서 아래와 같은 형대로 출력되도록 하세요
		/* W I P O A
		 * T B P W Z
		 * C E R Y I
		 * */
		//3행 5열
		for(int i=1;i<4;i++) {//행
			for(int m=1;m<6;m++) {//열
				char r7=(char)(Math.random()*26+'A');
				System.out.print(r7+"\t");
			}
			System.out.println();
		}
		
	}//main()---------------

}//class-----------------
