package day07;

public class OverloadingTest {

	public static void main(String[] args) {
		//슈퍼맨 객체 2개 생성한 뒤 getInfo() 호출해서 정보출력
		Superman s1=new Superman();
		System.out.println(s1.getInfo());
		Superman s2=new Superman("켄트",190,200);
		System.out.println(s2.getInfo());
		Superman s3=new Superman("슈퍼맨");
		String str=s3.getInfo();
		System.out.println(str);
		Superman s4=new Superman("헨리",170,400);
		System.out.println(s4.getInfo());
		//아쿠아맨 객체 1개 생성한 뒤 getInfo() 호출해서 정보출력
		Aquaman a1=new Aquaman("제이슨",200,300);		
		System.out.println(a1.getInfo());
		
		Aquaman a2=new Aquaman();		
		System.out.println(a2.getInfo());
		/*슈퍼맨 객체 4개를 배열에 저장
		 * 그런뒤 for루프 이용해서 슈퍼맨들의 정보 출력
		 */
		Superman []sup={s1,s2,s3,s4};
		for(Superman srr:sup) {
			System.out.println("***************");
			System.out.println(srr.getInfo());
		}
		
	}

}
