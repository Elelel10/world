package day0713;
/*1~100 중 3/4의 배수의 합*/
public class test4 {

	public static void main(String[] args) {
		int a=1;
		int sum=0;
		for (a=1;a<=100;a++) {
			if(a%3==0||a%4==0) {
				sum+=a;
			}
						
		}
		System.out.println(sum);
	}

}
