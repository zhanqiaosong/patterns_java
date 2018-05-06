package org.zqs.state;

public class HasCoinState implements State{
	private GumballMachine gumballMachine;
	public HasCoinState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	@Override
	public void insertCoin() {
		System.out.println("您已投币，请勿重复投币!");
	}

	@Override
	public void returnCoin() {
		gumballMachine.setState(gumballMachine.getNO_COIN());
		System.out.println("您已退币！");
	}

	@Override
	public void turnGrank() {
		gumballMachine.setState(gumballMachine.getSOLD());
		System.out.println("已经转动！");
	}
	
	@Override
	public void dispense() {
		System.out.println("请勿操作！");
	}
}
