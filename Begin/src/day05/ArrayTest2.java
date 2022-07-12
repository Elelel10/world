package day05;

public class ArrayTest2 {

	public static void main(String[] args) {
		//[1] float유형의 배열을 선언하여 크기는 3만큼 주세요
		//저장할 데이터는 -16.456,200.5,30e3 입니다
		//데이터를 저장한 뒤 for루프 이용해서 저장된 값을 출력하고
		//배열에 저장된 값의 총합과 평균값도 구해 출력해보세요
		float [] a= {-16.456f , 200.5f , 30e+3f};
		float sum=0f;
		for(int i=0;i<a.length;i++) {
			System.out.println("a["+i+"]="+a[i]);
			sum+=a[i];
		}
		System.out.println("총합="+sum+"\n평균값"+sum/a.length);
		/*double b[]= {-16.456, 200.5, 30e3};
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}System.out.println(b[0]+b[1]+b[2]);
		System.out.println((b[0]+b[1]+b[2])/3);

		 * */
		
		/*float [] f = new float[3];
		f[0]=-16.456f; f[1]=200.5f; f[2]=30e3f;
		float s = 0;
		for(int i=0; i<3; i++) {
			System.out.println("f["+i+"]="+f[i]);
			s = s+f[i];
		}
		System.out.println("총합="+s);
		System.out.println("평균="+s/3);

		 * */
	}

}
