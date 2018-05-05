package org.zqs.producer_consumer.second;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.zqs.producer_consumer.Resource;

public class Resource2 implements Resource{
	//当前资源数量
	private int num = 0;
	//资源池中允许存放的资源数目
	private int size = 10;
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	private static Resource resource = new Resource2();
	private Resource2() {}//私有化构造器
	public static Resource getInstance() {
		return resource;
	}
	/**
	 * 向资源池中添加资源
	 */
	public void add() {
		lock.lock();
		try {
			if (num<size) {
				num++;
				System.out.println(Thread.currentThread().getName()+"生产一件产品，当前共有"+num+"个产品");
				condition.signalAll();;
			}
			else {
				//资源池已满
				//释放锁
				try {
					System.out.println(Thread.currentThread().getName()+"线程进入等待");
					condition.await();;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} finally {
			lock.unlock();
		} 
		
	}
	/**
	 * 向资源池中取走资源
	 */
	public void remove() {
		lock.lock();
		try {
			if (num>0) {
				num--;
				System.out.println(Thread.currentThread().getName()+"消费一件产品，当前共有"+num+"个产品");
				condition.signalAll();;
			}
			else {
				//资源池已满
				//释放锁
				try {
					System.out.println(Thread.currentThread().getName()+"线程进入等待");
					condition.await();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		} finally {
			lock.unlock();
		}
		
	}
}
