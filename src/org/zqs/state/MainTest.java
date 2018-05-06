package org.zqs.state;

public class MainTest {
	public static void main(String[] args) {
		GumballMachine ma = new GumballMachine(10);
		ma.insertCoin();
		ma.insertCoin();
		ma.returnCoin();
		ma.insertCoin();
		ma.turnGrank();
		ma.insertCoin();
	}
}
