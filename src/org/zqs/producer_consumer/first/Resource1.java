package org.zqs.producer_consumer.first;

import org.zqs.producer_consumer.Resource;

public class Resource1 implements Resource {
	//��ǰ��Դ����
	private int num = 0;
	//��Դ���������ŵ���Դ��Ŀ
	private int size = 10;
	private static Resource resource = new Resource1();
	private Resource1() {}//˽�л�������
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
			System.out.println(Thread.currentThread().getName()+"����һ����Ʒ����ǰ����"+num+"����Ʒ");
			notifyAll();
		}
		else {
			//��Դ������
			//�ͷ���
			try {
				System.out.println(Thread.currentThread().getName()+"�߳̽���ȴ�");
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
			System.out.println(Thread.currentThread().getName()+"����һ����Ʒ����ǰ����"+num+"����Ʒ");
			notifyAll();
		}
		else {
			//��Դ������
			//�ͷ���
			try {
				System.out.println(Thread.currentThread().getName()+"�߳̽���ȴ�");
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
