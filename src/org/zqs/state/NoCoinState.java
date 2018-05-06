package org.zqs.state;

public class NoCoinState implements State{
	private GumballMachine gumballMachine;
	public NoCoinState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	@Override
	public void insertCoin() {
		System.out.println("You inserted a quarter!");
		gumballMachine.setState(gumballMachine.getHAS_COIN());
	}

	@Override
	public void returnCoin() {
		System.out.println("ÄúÎ´Í¶±Ò£¬ÇëÍ¶±Ò£¡");
	}

	@Override
	public void turnGrank() {
		System.out.println("ÄúÎ´Í¶±Ò£¬ÇëÍ¶±Ò£¡");
	}
	
	@Override
	public void dispense() {
		System.out.println("ÇëÏÈÍ¶±Ò");
	}
}
