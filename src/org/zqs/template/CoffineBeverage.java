package org.zqs.template;

public abstract class CoffineBeverage {
    //������ ����������
	/**
	 * ģ�巽���������㷨�ĹǼܣ�����һЩ�����ӳٵ�����
	 */
	final void prepareReceipt(){
		boilWater();
		brew();
		pourIntoCup();
		if(hook()) {
			addCondiments();
		}
	}
	//��ˮ
	void boilWater() {
        System.out.println("��ˮ��");
	}
	//��
	abstract void brew();
	//���뱭��
	void pourIntoCup() {
		System.out.println("�������뱭�У�");
	}
	//���ӵ���
	abstract void addCondiments();
	//���ӣ����㷨���е��ԣ�������Ը���
	boolean hook() {
		return true;
	}
}
