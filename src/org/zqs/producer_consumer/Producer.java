package org.zqs.producer_consumer;

public class Producer extends Thread{
	private Resource resource;
	public Producer(Resource resource,String id) {
		this.resource = resource;
		setName("ЩњВњеп"+id);
	}
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			resource.add();
		}
	}
	
}
