package day08;

public class Aquaman extends Human{
	double speed;
	
	public Aquaman() {
		this("수중인간",160,789.12);
	}
	public Aquaman(String n,int h, double s){
		this.name=n;
		this.height=h;
		this.speed=s;
	}
	
	public String getInfo() {
		return "이름: "+name+"\n키: "+height+"\n스피드: "+speed;		
	}
	//오버로딩해보기
}
