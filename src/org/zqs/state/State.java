package org.zqs.state;

public interface State {

	//投币
	void insertCoin();

	//退币
	void returnCoin();

	//扭动曲柄
	void turnGrank();
	
	//消耗糖果
	void dispense();
}