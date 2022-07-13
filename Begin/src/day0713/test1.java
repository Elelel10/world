package day0713;
import java.util.*;
/*점수입력 0~100
 * 학년입력 1~4
60점 이상 합격 미만 불합격
4학년은 70이상 합격
*/
public class test1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		for(;;) {
		System.out.println("점수 입력=> ");
		int score=sc.nextInt();
		System.out.println("학년 입력=> ");
		int grade=sc.nextInt();
		if(grade==4) {
		if(score>=70&&score<=100) {
			System.out.println("합격입니다");
		}else
			System.out.println("불합격입니다");
		}else if(grade>=1&&grade<4) {
			if(score>=70&&score<=100) {
				System.out.println("합격입니다");
			}else
				System.out.println("불합격입니다");
		}else {
			System.out.println("다시 입력하세요");
		}
		}
	}

}
