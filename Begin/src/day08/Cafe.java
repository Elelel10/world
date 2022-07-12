package day08;

public class Cafe {

	public static void main(String[] args) {		
		CoffeeMachine a1=new CoffeeMachine();
		
		//밀크 커피 만들기
		String s=a1.makeTea(1,2,3);
		System.out.println(s);
		System.out.println(a1.makeTea(1,2,2));
		//설탕 커피
		a1.makeTea(2,1);
		//블랙 커피
		a1.makeTea(2);
		//크림 커피
		a1.makeTea(2,(short)2);
		a1.makeTea((short)2,1);
		Yuja x=new Yuja();
		//x.yuja=3[x]
		x.setYuja(3);
		x.setSugar(3);
		a1.makeTea(x);
	}

}
