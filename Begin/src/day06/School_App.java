package day06;
/*학사관리 프로그램
 * -객체 추출
 * 	학생, 교사, 직원....
 * 	==>class로 구성하기
 * 학생=>Student
 * 	속성: 학번, 이름, 학급, 연락처
 * 	기능: 학생 정보를 보여주다, 공부하다,....
 * 교사=>Teacher
 * 	속성: 교번, 이름, 과목, 연락처
 * 	기능: 교사 정보를 보여주다, 가르치다,...
 * 직원=>Staff
 * 	속성: 이름, 연락처, 소속 부서, 직급
 * 	기능: 일하다, 
 * */
public class School_App {

	public static void main(String[] args) {
		Student a=new Student();
		Staff b=new Staff();
		Teacher c=new Teacher();
		
		a.no=1;
		a.name="김철수";
		a.ban=1;
		a.num=1234;
		a.studInfo();
		
		b.no=1;
		b.name="김영희";
		b.dept="기획";
		b.num=1234;
		b.staffInfo();
	}

}
