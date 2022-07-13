package day0713;
import java.util.*;
/*switch case문 사용
 12, 1 ,2 -> 겨울
 3, 4, 5 -> 봄
 6, 7, 8 -> 여름
 9, 10, 11 ->가을
 잘못 입력했을 경우 처리
*/
public class test2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("월 입력=>");
		int month=sc.nextInt();
		switch(month) {
		case 1, 2, 12 :
			System.out.println("겨울");
			break;
		case 3, 4, 5 :
			System.out.println("봄");
			break;
		case 6, 7, 8 :
			System.out.println("여름");
			break;
		case 9, 10, 11 :
			System.out.println("가을");
			break;
		default :
			System.out.println("없는 달 입니다.");
			return;
		}
		
	}

}
