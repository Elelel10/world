package day0713;
import java.util.*;
/*While문을 이용
 정수를 입력 받는다 -> 개수 제한 X
 0 을 입력하면 입력 종료
 입력한 수의 개수를 출력
 입력한 수의 평균을 출력
 1 2 2 0  -> 개수 : 3개   평균 1.66…
*/
public class test5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a=0;
		int sum=0;
		int i=0;
		System.out.println("정수를 입력하세요");
		while((a=sc.nextInt())!=0){							
			sum+=a;
			i++;	

			}
			System.out.println("입력횟수: "+i+"합계: "+sum+"평균: "+sum/i);
		
		
	}

}
