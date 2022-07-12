package day07;

public class MyTest {

	public static void main(String[] args) {
		//MyDemo클래스의 변수 x,y값을 출력하세요
		System.out.println("MyDemo.y: "+MyDemo.y);//객체 생성 안해도 됨
		MyDemo dm=new MyDemo();
		System.out.println("dm.x: "+dm.x);
		//foo(),bar() 메소드 호출하기
		MyDemo.foo();
		dm.bar();
		//MyDemo의 star(),snail()메소드 호출해서 결과를 출력하세요.
		String s2=dm.star(5);
		System.out.println(s2);
		String s=MyDemo.snail();
		System.out.println(s);
	}

}
