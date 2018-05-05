package org.zqs.template;

public abstract class CoffineBeverage {
    //抽象类 咖啡因饮料
	/**
	 * 模板方法，定义算法的骨架，而将一些步骤延迟到子类
	 */
	final void prepareReceipt(){
		boilWater();
		brew();
		pourIntoCup();
		if(hook()) {
			addCondiments();
		}
	}
	//煮水
	void boilWater() {
        System.out.println("煮水！");
	}
	//泡
	abstract void brew();
	//倒入杯中
	void pourIntoCup() {
		System.out.println("倒饮料入杯中！");
	}
	//增加调料
	abstract void addCondiments();
	//钩子，是算法更有弹性，子类可以更改
	boolean hook() {
		return true;
	}
}
