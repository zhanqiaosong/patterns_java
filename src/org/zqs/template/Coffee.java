package org.zqs.template;

public class Coffee extends CoffineBeverage{

	@Override
	void brew() {
		System.out.println("���ݿ��ȣ�");
	}

	@Override
	void addCondiments() {
		System.out.println("���ǣ�");
	}

}
