package day08;
class A{
	public String toString() {
		return "4";
	}
}
class B extends A{
	public String toString() {
		return super.toString()+"3";
	}
}
public class Test {

	public static void main(String[] args) {
		
		//int x=a.getNumber();
		System.out.println(new B());
	}

}
