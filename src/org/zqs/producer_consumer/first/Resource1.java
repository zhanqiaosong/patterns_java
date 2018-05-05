package org.zqs.producer_consumer.first;

import org.zqs.producer_consumer.Resource;

public class Resource1 implements Resource {
	//当前资源数量
	private int num = 0;
	//资源池中允许存放的资源数目
	private int size = 10;
	private static Resource resource = new Resource1();
	private Resource1() {}//私有化构造器
	public static Resource getInstance() {
		return resource;
	}
	/* (non-Javadoc)
	 * @see org.zqs.producer_consumer.first.Resource#add()
	 */
	@Override
	public synchronized void add() {
		if (num<size) {
			num++;
			System.out.println(Thread.currentThread().getName()+"生产一件产品，当前共有"+num+"个产品");
			notifyAll();
		}
		else {
			//资源池已满
			//释放锁
			try {
				System.out.println(Thread.currentThread().getName()+"线程进入等待");
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	/* (non-Javadoc)
	 * @see org.zqs.producer_consumer.first.Resource#remove()
	 */
	@Override
	public synchronized void remove() {
		if (num>0) {
			num--;
			System.out.println(Thread.currentThread().getName()+"消费一件产品，当前共有"+num+"个产品");
			notifyAll();
		}
		else {
			//资源池已满
			//释放锁
			try {
				System.out.println(Thread.currentThread().getName()+"线程进入等待");
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
