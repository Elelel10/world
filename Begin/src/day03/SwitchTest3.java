package day03;
import java.util.*;
/*문제2] ***수도요금 계산***************
-메뉴 (1 ~ 3), 사용량 (liter)
   1. 가정용 (liter당 50원)
   2. 상업용 (liter당 45원)
   3. 공업용 (liter당 30원)
   =>메뉴 선택후 사용량을 입력받는다.
 -출력될 내용
  1) 사용자 코드, 사용량, 총수도요금
   cf)사용요금=사용량 * 리터당 가격
      총수도요금=수도사용요금+세금(요금의
          5%)
*/

public class SwitchTest3 {

	public static void main(String[] args) {
		System.out.println("----Menu------------");
		System.out.println("1. 가정용 (liter당 50원)");
		System.out.println("2. 상업용 (liter당 45원)");
		System.out.println("3. 공업용 (liter당 30원)");
		System.out.println("--------------------");
		System.out.println("메뉴를 선택하세요=>");
		System.out.println("--------------------");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		//long no=sc.nextInt();(x)
		System.out.println("사용량을 입력하세요=>");
		int use=sc.nextInt();
		int cost1=0;
		int cost2=0;
		
		switch(no) {
		case 1:
			cost1=50;
			break;
		case 2:
			cost1=45;
			break;
		case 3:
			cost1=30;
			break;
			default:
			System.out.println("잘못 입력했습니다.");
			return;
		}
		int res1=use*cost1;
		int res2=res1*105/100;
		System.out.println("--------------------------");
		System.out.println("사용자 코드   사용량    총수도요금");
		System.out.println("    "+no+"       "+use+"L      "+res2+"원");
/*int result=0;
		switch(no) {
		case 1:
			result = use*50;
			break;
		case 2:
			result = use*45;
			break;
		case 3:
			result = use*30;
			break;
		default:
			System.out.println("메뉴에서 선택해주세요.");
			return;
		}
		System.out.println("사용자 코드: "+no);
		System.out.println("사용요금: "+result+"원 입니다.");
		System.out.println("총수도요금: "+result*1.05+"원 입니다.");
	}
	
	int result = 0;
		String x = " ";
		
		switch(no) {
		case 1:
			result = 50 * use;
			x = " [가정용 (liter당 50원)]";
			break;
		case 2:
			result = 45 * use;
			x = " [상업용 (liter당 45원)]";
			break;
		case 3:
			result = 40 * use;
			x = " [공업용 (liter당 40원)]";
			break;
		default:
			System.out.println("없는 메뉴입니다");
			return;
		}
		System.out.println(no+"번 메뉴\n"+use+"L 사용"+x+"\n사용요금 = "+result+"원\n총 수도요금 = "+(result+result*5/100)+"원");


 * */
	}

}
