package org.zqs.producer_consumer;

public interface Resource {

	/**
	 * 向资源池中添加资源
	 */
	void add();

	/**
	 * 向资源池中取走资源
	 */
	void remove();

}