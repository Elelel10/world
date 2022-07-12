package day03;

public class Test {

	public static void main(String[] args) {
		//1]
		int x=12;
		if(x>10&&x<20) {
			System.out.println("1. true");
		}
		//2]
		char ch='3';
		if(!(ch==' '||ch=='\t')) {
			System.out.println("2. 공백x 탭x");
		}
		/*if(ch!=' '&&ch!='\t') {
			System.out.println("2. true");
		}
		*/
		//3]
		if(ch=='x'||ch=='X') {
			System.out.println("3. x or X");
		}
		//4]
		if(ch>='0'&&ch<='9') {
			System.out.println("4. 숫자o");
		}
		//5]
		if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')) {
			System.out.println("5. 알파벳o");
		}
		//6]
		int year=221;
		if((year%400==0)||(year%4==0&&year%100!=0)) {
			System.out.println("6. "+year+"은 윤년");
		}
		//7]
		boolean powerOn=false;
		if(powerOn==false) {
			System.out.println("7. true");
		}	
		if(!powerOn) {
			System.out.println("7. true");
		}	
		//==: 참조형에서는 주소값을 비교한다. 기본자료형은 값을 비교
		//8]
		//String str="yes";
		String str=new String("yes");
		//문자열의 내용값을 비교하는 메소드:
		//boolean equals(object o):문자열의 내용이 같으면 true를 반환한다
		if(str.equals("yes")) {
			System.out.println("8. yes 맞음");
		}else {
			System.out.println("8. yes 아님");
		}
		
		
		//4-2] 정수 1~20 중에서 2 or 3의 배수가 아닌 값의 총합
		int a=1;
		for(int i=2;i<21;i++) {
			//if(i%2>0&&i%3>0)
			//if(!(i%2==0||i%3==0))
			if(i%2!=0&&i%3!=0)
				a+=i;
		}
		System.out.println(a);
		//4-3]
		
		int c=0;
		
		for(int i=0;i<10;i++) {
			int b=10;
			b-=i;
			for(;b>0;b--) {
				c+=b;
			}	
				
		}		
		System.out.println(c);
		
		int sum=0;
		int totalsum=0;
		for(int i=1;i<11;i++) {
			//sum=sum+i;
			sum+=i;//1, 1+2, 1+2+3, ... 1+2+3+..+10
			totalsum+=sum;
		}
		System.out.println("sum: "+sum);
		System.out.println("totalsum: "+totalsum);
		//3-3](num>0)?"양수":(num==0)?"음수":"0"
		//3-4]
	}
		

}
