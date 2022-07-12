package day04;
import java.util.*;

public class MyGame2 {
	
	//사용자 정의 메소드
	public static void showmenu() {
		System.out.println("********Game Menu***********");
		System.out.println("1.가위  2.바위  3.보  9.종료");
		System.out.println("****************************");
		System.out.println("입력하세요=>");
		System.out.println("****************************");
	}//---------------------------------------------
	
	public static String show(int num) {
		String str="";
		switch(num) {
		case 1: str="(가위)"; break;
		case 2: str="(바위)"; break;
		case 3: str="(보)"; break;
		default: str="";
		}
		return str;
	}//------------------------------------
	//반복문 돌면서 컴퓨터와 가위바위보 게임을 진행하세요.
	//그 결과를 아래 형태로 출력
	//[1]
	//당신 : 1 (가위)
	//컴퓨터 : 2 ( 바위)
	//------------
	//당신이 졌군요
	//[2] 9 입력하면 ByeBye
	//[3] 메뉴에 없는 번호는 "입력오류! 메뉴에 없는 번호 입니다." 출력 후 다시 입력하라함 
	//내장 메소드
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(;;) {
			MyGame2.showmenu();
			
			int my=sc.nextInt();
			int com=(int)(Math.random()*3+1);
			
			
			if(my==9) {
			System.out.println("Bye Bye~~");
			break;
			}
			if(my>3||my<1) {
			System.out.println("입력오류! 메뉴에 없는 번호 입니다.");
			continue;
			}
			String msg="";
			if(my==com) {
				msg="비겼군요!";
			}else if((my==1&&com==3)||(my==2&&com==1)||(my==3&&com==2)) {
				msg="당신이 이겼네요!";
			}else {
				msg="당신이 졌네요!";
			}
			System.out.println("당신: "+my+MyGame2.show(my));
			System.out.println("컴퓨터: "+com+MyGame2.show(com));
			System.out.println(msg);
		}
		
		
		//System.out.println("Bye Bye~~");
		
	}

}
