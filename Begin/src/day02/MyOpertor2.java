package day02;

public class MyOpertor2 {

	public static void main(String[] args) {
		System.out.println("4. 비트연산자 : &, |, ^");
		//정수에만 사용되는 연산자
		// &(and연산자) : 두 비트가 1일 때만 1
		// |(or연산자) : 두 비트 중 하나라도 1이면 1, 모두 0이면 0
		// ^(xor연산자) : 두 비트가 서로 다르면 1, 같으면 0
		 
		int x=3;//0011
		int y=5;//0101
		System.out.println("x&y="+(x&y));//0001 : 1
		System.out.println("x|y="+(x|y));//0111 : 7
		System.out.println("x^y="+(x^y));//0110 : 6
		
		System.out.println("5. 논리연산자 : &,&&,|,||");
		/*
		  1) &, &&
		  2) |, ||

		  &, | 의 경우: &,| 연산자를 사용하면 앞의 연산으로 결과를
		          알 수 있어도 뒤의 문장까지 비교한다.
		        &&,|| 의 경우: 앞의 연산으로 결과를 알 수 있을 경우
		       뒤의 문장은 수행하지 않는다.
		       예를 들어 &&의 경우, 앞의 연산결과가 false이면
		       뒤의 연산을 생략.
		       ||의 경우 앞의 연산결과가 true이면 뒤의 연산을 생략
		       ==>처리속도가 빨라짐
		  */

		int a=5;
		int b=6;
		if((a>b)&&(a>0)) {
			System.out.println("Hello");
		}else if((b>a)||(b<0)) {
			System.out.println("Hi");
		}
		
		//문제1]
		int i=1;
		int j=i++;//j=1, i=2
		if((i>++j)&(i++ ==j)) {
			i=i+j;
		}	//& : 2>2(f)/2==2(t) j=2,i=3
			//&&: 2>2(f)/연산x j=2,i=2
		System.out.println("i="+i);//3
		//문제2]
		int k=0;
		int p=1;
		if((k++ ==0)|(p++ ==2)){
			k=42;
		}//| : 0==0(t)/1==2(f) k=42,p=2
		 //||: 0==0(t)/연산x k=42,p=1
		System.out.println("k="+k+",p="+p);//k=42,p=2
		
		//문제3]
		boolean r=false;
		boolean e=false;
		boolean w=((r=true)|(e=true));//r에 true 넣음, e에 true 넣음.
		System.out.println(r+","+e+","+w);
		
	}

}
