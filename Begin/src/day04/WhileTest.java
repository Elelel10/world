package day04;
import java.util.*;
/*
 * 변수 선언문
 * while(조건식)
 * {
 * 		실행문;
 * 		증감식;
 * }
 * 조건식이 true이면 실행문을 실행한다.
 * 		  false이면 while블럭을 벗어난다.
 * */
public class WhileTest {
	public static void main(String[] agrs) {
		int a=1;
		while(a<5) {
			System.out.println("Hello"+a);
			a++;
		}//while-----
		System.out.println("The End~"+a);
		
		int b=10;
		//b값이 0보다 클때까지 반복돌면서 "Java:"+b출력하되
		//감소식은 2만큼씩 감소
		while(b>0) {
			System.out.println("Java:"+b);
			b-=2;
		}//while----------
		System.out.println("The End~"+b);
		
		//문제1] 구구단의 단을 입력받아서 구구단을 출력하기
		System.out.println("구구단 몇단을 출력할까요=>");
		Scanner sc=new Scanner(System.in);
		int dan=sc.nextInt();//입력
		int c=1;
		while(c<10) {
			System.out.println(dan+"x"+c+"="+dan*c);
			c++;
		}
		//문제2]구구단 전체를 출력하되 while문을 중첩해서 출력하세요
		int d=1;
		
		while(d<10) {
			int f=2;
			while(f<10) {
			System.out.print(f+"x"+d+"="+f*d+"\t");
			f++;
			
			}//while-----------
			System.out.println();
			d++;
			
		}//while--------------
/*		
		int j = 2;
		int k = 1;
		while(k<10) {
			while(j<10) {
				System.out.print(j+" x "+ k + " = "+j*k +"\t ");
				j++;
			}
			System.out.println();
			j = 2;
			k++;
		}
		int no1=1;
		while(no1<=9) {
			int no2=1;
			while(no2<=9) {
			System.out.print(no1+"x"+no2+"="+no1*no2+"\t");
				no2++;
			}System.out.println();
			no1++;
		}System.out.println("끄으읏");
*/
		while(true) {
			System.out.println("무한루프 돕니다");
		}
	}//main()---------
}//class///////////////////////////
