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
	//资源池中允许存放的资源数目
	private BlockingQueue blockingQueue = new LinkedBlockingQueue(10);
	private static Resource resource = new Resource3();
	private Resource3() {}//私有化构造器
	public static Resource getInstance() {
		return resource;
	}
	/**
	 * 向资源池中添加资源
	 */
	public void add() {
				try {
					blockingQueue.put(1);
					//打印不真，没有同步
					System.out.println(Thread.currentThread().getName()+"生产一件产品，当前共有"+blockingQueue.size()+"个产品");
				} catch (Exception e) {
					e.printStackTrace();
				}
	}
	/**
	 * 向资源池中取走资源
	 */
	public void remove() {
		try {
			blockingQueue.take();
			System.out.println(Thread.currentThread().getName()+"消费一件产品，当前共有"+blockingQueue.size()+"个产品");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
