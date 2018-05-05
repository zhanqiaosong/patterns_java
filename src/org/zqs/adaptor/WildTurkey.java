package org.zqs.adaptor;

public class WildTurkey implements Turkey {

	@Override
	public void gobble() {
		System.out.println("我在gogo叫");
	}

	@Override
	public void fly() {
        System.out.println("我只能飞很短时间..");
	}
}
