package org.zqs.command;

public class Light {
	private volatile Boolean state = false;
    public void on() {
    	if(state==false){
    		System.out.println("開燈");
    		state=true;
    	}
    	else {
    		System.out.println("已是開燈狀態！");
    	}
    }
    public void off() {
    	if(state==true){
			state=false;
	    	System.out.println("關燈");
		}
    	else {
    		System.out.println("已是關燈狀態！");
    	}
    }
}
