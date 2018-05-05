package org.zqs.command;

public class Light {
	private volatile Boolean state = false;
    public void on() {
    	if(state==false){
    		System.out.println("�_��");
    		state=true;
    	}
    	else {
    		System.out.println("�����_����B��");
    	}
    }
    public void off() {
    	if(state==true){
			state=false;
	    	System.out.println("�P��");
		}
    	else {
    		System.out.println("�����P����B��");
    	}
    }
}
