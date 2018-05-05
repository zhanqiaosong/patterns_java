package org.zqs.producer_consumer;

public class Consumer extends Thread{
	private Resource resource;
	public Consumer(Resource resource,String id) {
		this.resource = resource;
		setName("Ïû·ÑÕß"+id);
	}
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			resource.remove();
		}
	}
	
}
