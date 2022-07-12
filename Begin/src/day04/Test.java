package day04;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//연습문제[6]
		//반복문 이용해서 입력값들의 문자를 추출한 뒤 해당 문자가 범위가 맞으면 "숫자입니다."
		//한 개라도 숫자가 아닌 문자가 있으면 "숫자가 아닙니다. 다시 입력하세요." 출력
		o:
		while(true) {
			
			System.out.println("숫자를 입력하세요=>");
			String value=sc.next();
			System.out.println(value);
			for(int i=0;i<value.length();i++) {
			char a=value.charAt(i);
			if(!(a>='0'&&a<='9')) {
				
				System.out.println("숫자가 아닙니다. 다시 입력하세요.");
				continue o;
			}//if------			
			}//for--------------
			
			System.out.println("숫자입니다.");			
		}//while-----------------
		
	}//main()------

}//class----------
