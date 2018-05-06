package org.zqs.state;
/**
 * ץ�ǻ�
 * @author QiaosongZhan
 *
 */
public class GumballMachine{
	private State SOLD_OUT;//����
	private State NO_COIN;//δͶ��
	private State HAS_COIN;//��Ͷ��
	private State SOLD;//����
	private State state = SOLD_OUT;//��ʼ״̬
	private int count = 0;//�ǹ����������췽����ʼ��
	public GumballMachine(int count) {
		SOLD_OUT = new SoldOutState(this);
		NO_COIN = new NoCoinState(this);
		HAS_COIN = new HasCoinState(this);
		SOLD = new SoldState(this);
		if (count>0) {
			this.count = count;
			state = NO_COIN;
		}
	}
	
	public void insertCoin() {
		state.insertCoin();
	}
	
	public void returnCoin() {
		state.returnCoin();
	}

	public void turnGrank() {
		state.turnGrank();
		state.dispense();
	}
	public State getSOLD_OUT() {
		return SOLD_OUT;
	}

	public State getNO_COIN() {
		return NO_COIN;
	}

	public State getHAS_COIN() {
		return HAS_COIN;
	}

	public State getSOLD() {
		return SOLD;
	}

	public int getCount() {
		return count;
	}

	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public void releaseAllBall() {
		if(count != 0) count--;
	}

}
