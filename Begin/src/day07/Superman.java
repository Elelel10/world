package day07;

public class Superman {
	String name;
	int height;
	int power;//초능력
	//기본생성자
	public Superman() {
		this("클라크",180,100);
		//this() : 자기자신의 생성자를 호출할 때 사용한다.
		//			생성자 안에서만 호출할 수 있으며,
		//			제일 첫번째 문장이어야 한다
		
	}
	
	//인자생성자 3개
	public Superman(String name) {
		this(name,200,300);
		
	}
	
	public Superman(String name, int height) {
		this(name,height,300);
		
	}
	//target : 여기서 초기화를 하자
	public Superman(String name, int height,int power) {
		this.name=name;
		this.height=height;
		this.power=power;
	}
	
	public String getInfo() {
		String info="이름: "+name+"\n키: "+height+"\n초능력: "+power;
		return info;
	}
}
