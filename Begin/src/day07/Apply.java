package day07;
//구직자
public class Apply {
	private String name;
	private String major;
	private String level;
	private int salary;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setMajor(String major) {
			this.major=major;
	}
	public void setLevel(String level) {
		this.level=level;
}
	public void setSalary(int salary) {
			this.salary=salary;
	}
	
	public String getName() {
			return name;
	}		
	public String getMajor() {
		return major;
	}
	public String getLevel() {
		return level;
	}
	public int getSalary() {
		return salary;
	}
	public Apply() {
		this("홍길동","자바","대졸",3000);
	}
	public Apply(String name,String major,String level,int salary) {
		this.name=name;
		this.major=major;
		this.level=level;
		this.salary=salary;
	}
	public void showInfo() {
		System.out.println("****지원자 정보****");
		System.out.println("이름: "+name);
		System.out.println("전공: "+major);
		System.out.println("학력: "+level);
		
	}
	public void money() {
		System.out.println("지원자 "+name+"의 희망 연봉은 "+salary+"만 원 입니다.");
	}
}
