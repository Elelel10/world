package day07;

public class Cafe {

	public static void main(String[] args) {
		CoffeeMachine cm=new CoffeeMachine();
		//cm.coffee=2;
		cm.setCoffee(2);
		//cm.sugar=3;
		cm.setSugar(3);
		cm.cream=1;
		
		System.out.println("커피: "+cm.getCoffee());//cm.coffee
		System.out.println("설탕: "+cm.getSugar());//cm.sugar
		System.out.println("크림: "+cm.cream);
	}

}
