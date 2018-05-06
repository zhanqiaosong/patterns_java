package org.zqs.state;

public class HasCoinState implements State{
	private GumballMachine gumballMachine;
	public HasCoinState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	@Override
	public void insertCoin() {
		System.out.println("����Ͷ�ң������ظ�Ͷ��!");
	}

	@Override
	public void returnCoin() {
		gumballMachine.setState(gumballMachine.getNO_COIN());
		System.out.println("�����˱ң�");
	}

	@Override
	public void turnGrank() {
		gumballMachine.setState(gumballMachine.getSOLD());
		System.out.println("�Ѿ�ת����");
	}
	
	@Override
	public void dispense() {
		System.out.println("���������");
	}
}
