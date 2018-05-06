package org.zqs.state;

public class SoldOutState implements State{
	private GumballMachine gumballMachine;
	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	@Override
	public void insertCoin() {
		System.out.println("�ǹ������꣬����Ͷ��!");
	}

	@Override
	public void returnCoin() {
		System.out.println("��δͶ�ң���Ͷ�ң�");
	}

	@Override
	public void turnGrank() {
		System.out.println("��δͶ�ң���Ͷ�ң�");
	}
	
	@Override
	public void dispense() {
		System.out.println("����Ͷ��");
	}
}
