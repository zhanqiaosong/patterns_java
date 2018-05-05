package org.zqs.state;
/**
 * 基于状态模式的发糖果例子
 * @author QiaosongZhan
 *
 */
public class State {
	private final int SOLD_OUT = 0;//售完
	private final int NO_COIN = 1;//未投币
	private final int HAS_COIN = 2;//已投币
	private final int SOLD = 3;//已售
	private int state = SOLD_OUT;//初始状态
	private int count = 0;//糖果个数，构造方法初始化
	public State(int count) {
		if (count>0) {
			this.count = count;
			state = NO_COIN;
		}
	}
	//投币
	public void insertCoin() {
		if (state==HAS_COIN) {
			System.out.println("请勿重复投币！");
		}else if (state==NO_COIN) {
			System.out.println("您已投币！");
			state = HAS_COIN;
		}else if (state==SOLD_OUT) {
			System.out.println("已经售完，请勿投币！");
		}else if (state==SOLD) {
			System.out.println("请等待再次购买！");
		}
	}
	//退币
	public void returnCoin() {
		if (state==HAS_COIN) {
			System.out.println("退币成功！");
			state = NO_COIN;
		}else if (state==NO_COIN) {
			System.out.println("您还未投币！");
		}else if (state==SOLD_OUT) {
			System.out.println("已售完状态！");
		}else if (state==SOLD) {
			System.out.println("糖果已售，不能退币！");
		}
	}
	//扭动曲柄
	public void turnGrank() {
		if (state==HAS_COIN) {
			System.out.println("购买成功！");
			state = SOLD;
			dispense();
		}else if (state==NO_COIN) {
			System.out.println("您还未投币！");
		}else if (state==SOLD_OUT) {
			System.out.println("已售完状态！");
		}else if (state==SOLD) {
			System.out.println("糖果已售，不能重复去的糖果！");
		}
	}
	//更新糖果数量
	private void dispense() { 
		if (state==SOLD) {
			System.out.println("糖果已出！");
			count -= 1;
			if (count==0) {
				state = SOLD_OUT;
			}
		}
		
		//以下不应该发生，应避免
	    else if (state==HAS_COIN) {
			System.out.println("购买成功！");
			state = SOLD;
			dispense();
		}
		else if (state==NO_COIN) {
			System.out.println("您还未投币！");
		}else if (state==SOLD_OUT) {
			System.out.println("已售完状态！");
		}
	}
	
	
	public static void main(String[] args) {
		State s = new State(5);
		s.returnCoin();
		s.turnGrank();
		s.insertCoin();
		s.turnGrank();
		/*s.insertCoin();
		s.returnCoin();*/
	}
}
