package org.zqs.producer_consumer.third;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import org.zqs.producer_consumer.Resource;
/**
 * 
 * @author QiaosongZhan
 *
 */
public class Resource3 implements Resource{
	//��Դ���������ŵ���Դ��Ŀ
	private BlockingQueue blockingQueue = new LinkedBlockingQueue(10);
	private static Resource resource = new Resource3();
	private Resource3() {}//˽�л�������
	public static Resource getInstance() {
		return resource;
	}
	/**
	 * ����Դ���������Դ
	 */
	public void add() {
				try {
					blockingQueue.put(1);
					//��ӡ���棬û��ͬ��
					System.out.println(Thread.currentThread().getName()+"����һ����Ʒ����ǰ����"+blockingQueue.size()+"����Ʒ");
				} catch (Exception e) {
					e.printStackTrace();
				}
	}
	/**
	 * ����Դ����ȡ����Դ
	 */
	public void remove() {
		try {
			blockingQueue.take();
			System.out.println(Thread.currentThread().getName()+"����һ����Ʒ����ǰ����"+blockingQueue.size()+"����Ʒ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
