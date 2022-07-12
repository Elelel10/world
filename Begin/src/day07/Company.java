package day07;

public class Company {
	private String name;
	private String address;
	private String category;
	private int people;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAddress(String address) {
		this.address=address;
	}
	public void setCategory(String category) {
		this.category=category;
	}
	public void setPeople(int people) {
		this.people=people;
	}
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getCategory() {
		return category;
	}
	public int getPeople() {
		return people;
	}
	
	public Company() {
		this("애플","서울","제조",50);
	}
	public Company(String name,String address,String category,int people) {
		this.name=name;
		this.address=address;
		this.category=category;
		this.people=people;
	}
	
	public void showInfo() {
		System.out.println("****회사 정보****");
		System.out.println("사명: "+name);
		System.out.println("위치: "+address);
		System.out.println("업종: "+category);
	}
	public void recruit() {
		System.out.println(name+"의 채용 인원은 "+people+"명 입니다.");
	}
}
