package day07;
/*#구인 구직 프로그램을 작성한다고 가정합시다

[1] 잡코리아나 사람인 사이트를 살펴보고
해당 프로그램에 필요한 객체를 2개 추출하세요
 ex) 구직자, 구인회사, 헤드헌터,...

[2] 추출한 객체를 class로 구성하세요.
이때  속성은 3개, 메소드는 2개 이상 구성하세요

[3] 속성은 캡슐화하고, setter와 getter를 구성하세요

[4] 생성자를 구성하되 2개 이상 구성하세요=>오버로딩

[5] main()메소드에서 해당 객체들을 생성해 테스트 하세요
*/
public class JobApp {

	public static void main(String[] args) {
		Apply a1=new Apply();
		a1.showInfo();
		a1.money();
		Apply a2=new Apply("김철수","자바","고졸",2500);
		a2.showInfo();
		a2.money();
		Company c1=new Company();
		c1.showInfo();
		c1.recruit();
		Company c2=new Company("멀티캠퍼스","서울","교육",10);
		c2.showInfo();
		c2.recruit();
	}

}
