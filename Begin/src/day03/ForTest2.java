package day03;
/*for루프문을 이용해서 구구단 7단을 아래 형식으로 출력하세요
 * 7 x 1 = 7
 * ...
 * 7 x 9 = 63
 * */
public class ForTest2 {

	public static void main(String[] args) {
		int dan=7;
		for(int i=1;i<10;i++) {
			System.out.println(dan+" x "+i+" = "+dan*i);
		}
		//문제2] 1~10까지의 합을 구해 출력하세요-For 이용
		//문제3] 1~10까지의 곱을 구해 출력하세요
		int a=0;
		int b=1;
		for(int i=1;i<11;i++) {
			a+=i;
			//a=a+i;
			b*=i;
			//b=b*i;
		}
		System.out.println(a);
		System.out.println(b);
				
		//문제4]1~100까지의 수 중 짝수들의 합을 구해 출력하세요
		int c=0;
		for(int i=1;i<101;i++) {
			if(i%2==0)
				c+=i;
			
	}
		System.out.println(c);
		/*int sum=0;
		for(int c=0;c<101;c+=2){
		sum+=c;
		}
		System.out.println(sum);
		*/
		//문제5]1~100까지의 수 중 17로 나누어 떨어지는 수를 출력하세요
		int d=0;
		for(int i=1;i<101;i++) {
			if(i%17==0)
				System.out.print(i+" ");
			
		}
		System.out.println();
		//System.out.println(c);
		//문제6]대문자 알파벳[A~Z]을 for 이용해서 출력하세요
		for(char i='A';i<='Z';i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		/*for(int a=65;a<91;a++){
		 * System.out.print((char)a+" ");
		 * }
		 * */
	}//main()----
}//class---
