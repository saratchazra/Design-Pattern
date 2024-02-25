package MiniDuckSimulator;

import Duck.Duck;
import Duck.MallardDuck;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
	}

}
