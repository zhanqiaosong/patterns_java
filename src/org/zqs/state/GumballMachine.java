package org.zqs.state;
/**
 * 抓糖机
 * @author QiaosongZhan
 *
 */
public class GumballMachine{
	private State SOLD_OUT;//售完
	private State NO_COIN;//未投币
	private State HAS_COIN;//已投币
	private State SOLD;//已售
	private State state = SOLD_OUT;//初始状态
	private int count = 0;//糖果个数，构造方法初始化
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
