package org.zqs.state;

public class SoldState implements State{
	private GumballMachine gumballMachine;
	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}
	@Override
	public void insertCoin() {
		System.out.println("�����ظ�Ͷ��!");
	}

	@Override
	public void returnCoin() {
		System.out.println("���ѹ�����Ʒ�������˱ң�");
	}

	@Override
	public void turnGrank() {
		System.out.println("���ѹ�����Ʒ�������ظ���");
	}
	
	@Override
	public void dispense() {
		gumballMachine.releaseAllBall();
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNO_COIN());
		}else {
			gumballMachine.setState(gumballMachine.getSOLD_OUT());
		}
		System.out.println("���ѹ�����Ʒ��");
	}
}
