package org.zqs.state;

public class SoldState implements State{
	private GumballMachine gumballMachine;
	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	@Override
	public void insertCoin() {
		System.out.println("请勿重复投币!");
	}

	@Override
	public void returnCoin() {
		System.out.println("您已购得物品，不能退币！");
	}

	@Override
	public void turnGrank() {
		System.out.println("您已购得物品，请勿重复！");
	}
	
	@Override
	public void dispense() {
		gumballMachine.releaseAllBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNO_COIN());
		}else {
			gumballMachine.setState(gumballMachine.getSOLD_OUT());
		}
		System.out.println("您已购得物品！");
	}
}
