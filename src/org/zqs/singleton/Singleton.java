package org.zqs.singleton;

public class Singleton{
	private static Singleton singleton;
    //单例模式
	private Singleton() {
	} 
	public static Singleton getInstance() {
		if(singleton==null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	public void boil() {
		System.out.println("锅炉在煮水！");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("锅炉煮水完毕！");
	}
}
