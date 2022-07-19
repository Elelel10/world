package day11;
import java.util.*;
import day10.Student;
public class ObjectTest {

	public static void main(String[] args) {
		//java.lang.object 클래스 : 모든 클래스의 부모가 된다.
	Object o1=new Object();
	Object o2=new Object();
	System.out.println("o1: "+o1);
	System.out.println("o1.toString(): "+o1.toString());
	/*toString()메소드는 해당 객체에 대한 정보를 문자열로 반환한다.
	 * 재정의하지 않았다면 "클래스이름@해시코드"를 반환한다
	 * */
	String s1=new String("Hello");
	String s2=new String("Hello");
	System.out.println("s1: "+s1);
	System.out.println("s1.toString(): "+s1.toString());
	//String클래스에서는 toString()을 오버라이드(재정의)하고 있다.
	
	Date d1=new Date();
	System.out.println(d1);
	
	Student st1=new Student(100,"김학생");
	Student st2=new Student(101,"이철수");
	Student st3=st2;
	Student st4=new Student(101,"이철수");
	
	System.out.println(st1);
	//==:기본자료형일 때 값을 비교, 참조형일 때는 주소값을 비교
	System.out.println("st1==st2: "+(st1==st2));//false
	System.out.println("st2==st3: "+(st2==st3));//true
	
	//Object클래스의 equals() 메소드: 주소값을 비교하여 같으면 true반환
	System.out.println("st1.equals(st2): "+st1.equals(st2));
	System.out.println("st3.equals(st2): "+st3.equals(st2));
	System.out.println("st2.equals(st4): "+st2.equals(st4));
	
	//Student 클래스에서 equals()메소드를 오버라이드 하세요
	//id값과 name값이 같으면 true를 반환하도록 재정의하세요
	System.out.println("--------String 클래스--------");
	String a1="Hello";
	String a2="Hello";
	String a3=new String("Hello");
	String a4=new String("Hello");
	//==:주소값 비교
	//a1==a2:true
	System.out.println("a1==a2: "+(a1==a2));//리터럴풀 비교
	//a1==a3:false
	System.out.println("a1==a3: "+(a1==a3));//메모리 영역이 다름
	//a3==a4:false
	System.out.println("a3==a4: "+(a3==a4));//주소값 다름
	
	//equals():문자열 내용 비교
	//a1.equals(a2):true
	System.out.println("a1.equals(a2): "+a1.equals(a2));
	//a1.equals(a3):false
	System.out.println("a1.equals(a3): "+a1.equals(a3));
	//a3.equals(a4):false
	System.out.println("a3.equals(a4): "+a3.equals(a4));
	}
}
