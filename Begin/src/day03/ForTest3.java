package day03;
//중첩 for루프문

public class ForTest3 {

	public static void main(String[] args) {
		for(int i=2;i<4;i++) {
			for(int k=1;k<3;k++) {
				System.out.println("i="+i+", k="+k);
			}//for---
			System.out.println("*********************");
		}//for-----
		/*문제1] 중첩 for루프를 이용해서 아래 모양이 출력되도록 해보세요
		 * ★★★★★
		 * ★★★★★
		 * ★★★★★
		 * */
		for(int i=1;i<4;i++) {
			for(char a=1;a<6;a++) {
				System.out.print("★");
			}//for------------
			System.out.print("\n");
		}//for---------------------------
		/*문제2] 중첩 for루프를 이용해서 구구단 전체를 아래 형태로 출력하세요
		 * 2x1=2 3x1=3...9x1=9
		 * 2x2=4 ...
		 * ...
		 */
		
		for(int i=1;i<10;i++) {//행의 조건
			for(int a=2;a<10;a++) {//열의 조건
				System.out.print(a+" x "+i+" = "+a*i+"\t");
			}//for-----------------------
			System.out.print("\n");
		}//for--------------------------------
	}

}
