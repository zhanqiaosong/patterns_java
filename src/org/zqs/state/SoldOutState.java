package org.zqs.state;

public class SoldOutState implements State{
	private GumballMachine gumballMachine;
	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	@Override
	public void insertCoin() {
		System.out.println("糖果已卖完，请勿投币!");
	}

	@Override
	public void returnCoin() {
		System.out.println("您未投币，请投币！");
	}

	@Override
	public void turnGrank() {
		System.out.println("您未投币，请投币！");
	}
	
	@Override
	public void dispense() {
		System.out.println("请先投币");
	}
}
