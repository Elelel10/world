package day05;
/*아래 프로그램에서 발생한 오류를 try~catch절로 처리해보세요
 * 단)Exception2는 for루프 바깥에서 try~catch,
 * 			   3는 for루프 안에서 try~catch
 */
public class ExceptionTest2 {

	public static void main(String[] args) {
		try {
			for(int i=1;i<=5;i++) {
				int a=50/(i-3);
				System.out.println("a="+a);
			}//for------------
		}catch(ArithmeticException e) {
			System.out.println("연산오류!!분모가 0이 되면 안됨!!");
		}
		System.out.println("###매우 중요한 코드###");
	}

}
