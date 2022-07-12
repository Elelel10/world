package day03;
import java.util.*;
/*switch~case문:
 * switch() 괄호 안에 들어가는 값, 변수, 수식 
 * => int 이하의 자료형(byte,short,int,char) 또는 String만 사용 가능 long,float,double(x)
 * switch(값|수식|변수){
 * 		case 값1:
 * 			실행문;
 * 			break;
 * 		case 값2:
 * 			실행문;
 * 			break;
 *		.....
 *		default:
 *			실행문;
 * }
 */

public class SwitchTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("연산자를 입력하세요[+,-,*,/]=>");
		String operation=sc.next();
		//char oper='+';
		char oper=operation.charAt(0);
		
		System.out.println("정수1 입력=>");
		int a=sc.nextInt();
		
		System.out.println("정수2 입력=>");
		int b=sc.nextInt();
		
		int result=0;
		
		switch(oper) {
		case '+':
			result=a+b;
			break;
		case '-':
			result=a-b;
			break;
		case '*':
			result=a*b;
			break;
		case '/':
			result=a/b;
			break;//소속된 블럭{}을 벗어난다.
		default:
			System.out.println("없는 연산자입니다.");
			return;
			//보조제어문 : 제어흐름을 되돌린다.(return문을 갖는 메소드 main()을 호출한 쪽(jvm)으로 돌아간다)
		}
		System.out.println(a+operation+b+"="+result);
		//System.out.println("result: "+result);
	}//main()------------------------------
}///////////////////////////////////////////
