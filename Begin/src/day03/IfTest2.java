package day03;
//java.util.Scanner클래스 이용
import java.util.Scanner;
/*if(조건식){
 * 	실행문
 * }else{
 * 	실행문
 * }
 * -----------------------
 * 다중 if ~ else if ~ else
 */
public class IfTest2 {

	public static void main(String[] args) {
		//Scanner : 클래스형(참조형)=>new 연산자를 이용해서 객체를 생성해서 사용해야 한다.
		Scanner sc=new Scanner(System.in);
		//System.out : 출력
		//System.in : 입력
		System.out.println("정수를 입력하세요=>");
		int input=sc.nextInt();//정수를 입력받아서 사용자가 입력한 값을 반환한다.
		//nextFloat(), nextDouble(), nextLong()
		System.out.println("input="+input);
		//input값이 짝수이면 "짝수입니다"를 출력하는 문장을 if문으로 작성해보세요.
		//int a=sc.nextInt();
		if(input%2==0) {
			System.out.println(input+"은 짝수입니다.");
		}else
			System.out.println(input+"은 홀수 입니다.");
		System.out.println("The End~~~");//조건 상관없이 마지막에 나옴
	}

}
