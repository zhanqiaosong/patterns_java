package org.zqs.singleton;

public class Singleton{
	private static Singleton singleton;
    //����ģʽ
	private Singleton() {
	} 
	public static Singleton getInstance() {
		if(singleton==null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	public void boil() {
		System.out.println("��¯����ˮ��");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("��¯��ˮ��ϣ�");
	}
}
