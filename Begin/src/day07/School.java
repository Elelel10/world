package day07;

public class School {
	
	public static void main(String[] args) {
		/*[1] 학생 객체를 생성하고, 학번, 이름, 전공값을 할당하세요*/
		Student s1=new Student();
		s1.setNo(10);
		s1.setName("홍길동");
		s1.setMajor("자바");
		
		/*[2] 교사 객체를 생성하고, 교번, 이름, 담당과목값을 할당하세요*/
		Teacher t1=new Teacher();
		t1.setNo(20);
		t1.setName("김철수");
		t1.setSubject("국어");
		/*[3] 직원 객체를 생성하고, 사번, 이름, 소속부서값을 할당하세요*/
		Staff f=new Staff();
		f.setNo(30);
		f.setName("고길동");
		f.setDept("기획");
		
		System.out.println("학번: "+s1.getNo());
		System.out.println("이름: "+s1.getName());
		String mj=s1.getMajor();
		System.out.println("전공: "+mj);
		s1.showInfo();
		t1.showInfo();
		f.showInfo();
		
		//문제1]학생 객체를 2개 더 생성하고...
				//        각각 이름,학번,전공 값을 넣어준뒤...
				//			배열에 저장하자.
				//			for루프 돌리면서 저장된 학생 객체들의
				//         정보를 출력해보자.
		Student s2=new Student();
		s2.setNo(40);
		s2.setName("고희동");
		s2.setMajor("sw");
		
		Student s3=new Student();
		s3.setNo(50);
		s3.setName("유재석");
		s3.setMajor("자바");
		
		Student []arr=new Student[3];
		arr[0]=s1;
		arr[1]=s2;
		arr[2]=s3;
		for(int i=0;i<arr.length;i++) {
			Student st=arr[i];
			//System.out.println(st);
			st.showInfo();
		}
		//문제2]교사 객체 1개 더 생성
		//	값 할당 후 배열에 저장 후 확장 for루프로 출력
		Teacher t2=new Teacher();
		t2.setNo(100);
		t2.setName("이교사");
		t2.setSubject("수학");
		Teacher []arr1= {t1,t2};
		for(Teacher tc:arr1) {
			tc.showInfo();
		}
	}

}
