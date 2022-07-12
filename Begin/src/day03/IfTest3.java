package day03;
import java.util.Scanner; 
public class IfTest3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("평균점수를 입력하세요=>");
		float score=sc.nextFloat();
		System.out.println("평균점수: "+score);
		/*100~90: A
		 * 80~89.xxx:B
		 * 70~:C
		 * 60~:D
		 * 60미만:F
		 * 다중 if 이용
		 * if(조건식1){
		 * }else if(조건식2){
		 * }else if(조건식3){
		 * }else{
		 * }
		 */
		char hak=' ';
		//지역변수는 반드시 초기값을 주고 사용해야한다.
		//숫자는 큰 거부터 거르기
		 if(score>=90 && score<=100){
			 hak='A';
		 }
		 else if(score>=80 && score<90){
			 hak='B';
		 }else if(score>=70 && score<80){
			 hak='C';
		 }else if(score>=60 && score<70){
			 hak='D';
		 }else{
			 hak='F';
		 }
			 System.out.println("학점:"+hak);
			 
		/* if(score<=100 && score>=90){
			 System.out.println("학점:A");
		 }else if(score>=80){
			 System.out.println("학점:B");
		 }else if(score>=70){
			 System.out.println("학점:C");
		 }else if(score>=60){
			 System.out.println("학점:D");
		 }else{
			 System.out.println("학점:F");
		 }
		*/ 
	}

}
