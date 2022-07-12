package day08;
class BaseClass{
	private float x=1.0f;
	protected void getVar(float f) {
		x=f;
	}
	
}
class SubClass extends BaseClass{
	private float x=2.0f;
	public void getVar(float f) {
		x=f;
	}
}
public class Test2 {

	public static void main(String[] args) {
		
	}

}
