package day04;
import java.util.*;
public class MyGame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int comp=(int)(Math.random()*100+1);
		int i=0;
		while(true) {
			in:
			System.out.println("1~100 사이의 정수를 입력하세요.");
			int input=sc.nextInt();
			if(input<1||input>100)
				continue;
			i++;
			if(i>7) {
				System.out.println("못맞췄군요! 다음 기회에");
				//break;
				return;
				}	
			if(input>comp) {
				System.out.println("down!");
				
			}else if(input<comp) {
				System.out.println("up!");
				
			}else {
				System.out.println("맞췄습니다.");
				break;
			}
			
		}		
		System.out.println("시도한 횟수는 "+i+"번 입니다.");
		
		
		//시도한 횟수, 7번 넘으면 "못맞췄군요! 다음 기회에"
	}

}
