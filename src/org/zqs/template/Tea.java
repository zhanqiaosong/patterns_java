package org.zqs.template;

public class Tea extends CoffineBeverage{
	
	@Override
	void brew() {
		System.out.println("�ݲ��У�");
	}

	@Override
	void addCondiments() {
		System.out.println("��������Ƭ��");
	}

}
