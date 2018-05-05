package org.zqs.adaptor;

public class AdaptorMain {
    public static void main(String[] args) {
    	Duck ada = new TurkeyAdaptor(new WildTurkey());
    	ada.fly();
    	ada.quack();
	}
}
