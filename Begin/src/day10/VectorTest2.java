package day10;
import java.util.*;

//java.util.List계열 => list[]
public class VectorTest2 {

	public static void main(String[] args) {
		//[1] Student 객체를 3개 생성하세요
		Student s1=new Student();
		Student s2=new Student(1,"홍길동");
		Student s3=new Student(2,"김철수");
		//[2] Student를 저장할 Vector를 생성하세요
		Vector<Student>v1=new Vector<>(5,3);
		//[3] 벡터에 학생객체 3개를 저장하세요
		v1.add(s1);
		v1.addElement(s2);
		v1.add(s3);
		//[4] for루프 이용해서 벡터에 저장된 학생의 정보(학번,이름)을 출력하세요
		for(Student t :v1) {
			//System.out.println(t);//t.toString()의 주소값
			System.out.println("학번: "+t.getId()+" 이름: "+t.getName());
		}
			//public Enumeration<E> elements()
			//public Iterator<E>	iterator()
			/*Enumeration<E> elements()
			 * : 벡터에 저장된 객체들을 한꺼번에 꺼내오고자 할 때 사용.
			 * Enumeration과 Iterator인터페이스는 객체들을 집합체로
			 * 관리하도록 해주는 인터페이스이다.
			 * 이들 인터페이스에서는 각각의 객체들을 한 순간에 하나씩
			 * 처리할 수 있는 메소드를 제공한다.
			 * # Enumeration의 경우**********************************
			 * 	- boolean hasMoreElements() : 논리적 커서(첫번째 요소 직전에
			 * 				위치) 이후에 요소들이 있는지 물어서 있으면true
			 * 				없으면 false를 반환
			 *  - E nextElement(): 논리적 커서를 다음 요소로 이동하고
			 *  			현재 가리키고 있는 요소를 반환한다.
			 * # Iterator의 경우**************************************
			 * 	- boolean hasNext()
			 *  - E next() 
			 * */
			Enumeration<Student>en=v1.elements();
			
			while(en.hasMoreElements()) {
				Student e=en.nextElement();
				System.out.println(e.getName()+": "+e.getId());
			}
			System.out.println("************");
			while(en.hasMoreElements()) {
				Student e=en.nextElement();
				System.out.println(e.getName()+": "+e.getId());
			}
			//public Iterator<E>	iterator()
			//iterator()메소드 이용해서 v1에 저장된 학생들의 이름을 모두 출력하세요
			Iterator<Student>itr=v1.iterator();
			while(itr.hasNext()) {
				Student it=itr.next();
				System.out.println(it.getName()+": "+it.getId());
			}
			//clear(),removeAll():모든 요소를 삭제한다
			v1.clear();
			System.out.println("모두 삭제 후-------");
			itr=v1.iterator();
			for(;itr.hasNext();) {
				Student it=itr.next();
				System.out.println(it.getName()+": "+it.getId());
			}
	}

}////////////////////////////
