package org.zqs.producer_consumer.second;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.zqs.producer_consumer.Resource;

public class Resource2 implements Resource{
	//��ǰ��Դ����
	private int num = 0;
	//��Դ���������ŵ���Դ��Ŀ
	private int size = 10;
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	private static Resource resource = new Resource2();
	private Resource2() {}//˽�л�������
	public static Resource getInstance() {
		return resource;
	}
	/**
	 * ����Դ���������Դ
	 */
	public void add() {
		lock.lock();
		try {
			if (num<size) {
				num++;
				System.out.println(Thread.currentThread().getName()+"����һ����Ʒ����ǰ����"+num+"����Ʒ");
				condition.signalAll();;
			}
			else {
				//��Դ������
				//�ͷ���
				try {
					System.out.println(Thread.currentThread().getName()+"�߳̽���ȴ�");
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
	 * ����Դ����ȡ����Դ
	 */
	public void remove() {
		lock.lock();
		try {
			if (num>0) {
				num--;
				System.out.println(Thread.currentThread().getName()+"����һ����Ʒ����ǰ����"+num+"����Ʒ");
				condition.signalAll();;
			}
			else {
				//��Դ������
				//�ͷ���
				try {
					System.out.println(Thread.currentThread().getName()+"�߳̽���ȴ�");
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
