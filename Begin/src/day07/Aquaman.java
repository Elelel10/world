package day07;

public class Aquaman {
	String name;
	int height;
	double speed;
/*생성자를 구성하지 않으면 컴파일러는 기본적으로 디폴트 생성자를 제공해준다.
 * 한 개라도 생성자를 구성하게 되면 제공되던 디폴트 생성자는 사라진다.
 * =>가능하면 기본생성자를 구성한 뒤에 다른 생성자를 구성하는 습관을 들이자.
 */
	public Aquaman() {
		this("모모아",155,56.78);
		
	}
	public Aquaman(String name, int height, double speed) {
		this.name=name;
		this.height=height;
		this.speed=speed;
	}
	
	public String getInfo() {
		String info="이름: "+name+"\n키: "+height+"\n스피드: "+speed;
		return info;
	}
}
