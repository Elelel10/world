package day0713;
import java.util.*;
//a e i o u
public class test3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("알파벳을 입력하세요");
		String a=sc.next();
		char b=a.charAt(0);
		
		switch(b) {
		case 'a','e','i','o','u':
			System.out.println("모음입니다");
			break;					
		default:
			System.out.println("자음입니다");
			return;
		}
		
	}

}
