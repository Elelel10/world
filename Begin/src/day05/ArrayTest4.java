package day05;

public class ArrayTest4 {

	public static void main(String[] args) {
		//2차원 배열
		//[1] 선언 [2] 메모리할당 [3] 초기화
		int [][] a;//2차원 배열 선언
		//int a[][];
		//int [] a [];
		
		//[2] 메모리 할당=>3행2열
		a=new int[3][2];
		
		//[3] 초기화
		a[0][0]=10;
		a[0][1]=20;
		
		a[1][0]=30;
		a[1][1]=40;
		
		a[2][0]=50;
		a[2][1]=60;
		
		System.out.println("a[1][1]="+a[1][1]);
		//for루프를 중첩해서 배열 a에 저장된 값을 출력하세요
		//행의 크기 : a.length
		//열의 크기 : a[i].length
		for(int i=0;i<a.length;i++) {
			for(int k=0;k<a[i].length;k++) {
				System.out.print(a[i][k]+" ");
			}
			System.out.println();
		}
		System.out.println("a.length="+a.length);
		System.out.println("a[0].length="+a[0].length);
		System.out.println("a[1].length="+a[1].length);
		System.out.println("a[2].length="+a[2].length);
		//배열 a에 저장된 값을 출력하되 확장 for루프문을 이용해 출력
		for(int s[]:a) {
			for(int p:s) {
				System.out.print(p+" ");
			}
			System.out.println();
		}
		/*
		 * a----------->행| a[0] | a[1] | a[2] |
		 *                   |
		 *              열
		 *              |a[0][0]|a[0][1]|     */
		System.out.println("2.----------------");
		//행의 크기만 먼저 잡아놓고 열의 크기를 나중에 가변적으로 할당할 수 있다.
		char[][]ch=new char[3][];
		ch[0]=new char[2];//2열
		ch[1]=new char[4];//4열
		ch[2]=new char[3];//3열
		
		ch[0][0]='H';
		ch[0][1]='i';
		
		ch[1][0]='J';
		ch[1][1]='a';
		ch[1][2]='v';
		ch[1][3]='a';
		
		ch[2][0]='B';
		ch[2][1]='y';
		ch[2][2]='e';
		
		for(char b[]:ch) {
			for(char c:b) {
				System.out.print(c);
			}
			System.out.println();
		}//for-----------
		
		for(int i=0;i<ch.length;i++) {
			for(int j=0;j<ch[i].length;j++) {
				System.out.print(ch[i][j]);
			}
			System.out.println();
		}//for----------------------
		System.out.println("\n3.-----------------");
		//2차원 배열: 선언과 동시에 메모리 할당하고 초기화
		float[]brr[]= {{0.5f,20.1f},{010,011,017},{10,'B'}};
		System.out.println("brr.length: "+brr.length);
		for(float[] f:brr) {
			for(float y:f) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
		//double유형의 3차원 배열을 선언과 동시에 메모리할당하고 초기화하세요
		//for루프 돌려서 출력하기
		double[][][]doo= {{{1,2,3},{'a'}},{{10},{20}}};
		System.out.println(doo.length);
		for(double e[][]:doo) {
			for(double f[]:e) {
				for(double g:f) {
					System.out.print(g+" ");
					
				}
				System.out.println();
			}
			System.out.println();
		}
		for(int i=0;i<doo.length;i++) {
			for(int j=0;j<doo[i].length;j++) {
				for(int k=0;k<doo[i][j].length;k++) {
					System.out.print(doo[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
