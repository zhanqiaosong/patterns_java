package org.zqs.adaptor;

public class MallardDuck implements Duck {

	@Override
	public void quack() {
        System.out.println("我在呱呱叫");
	}

	@Override
	public void fly() {
		System.out.println("我在飞...");
	}

}
