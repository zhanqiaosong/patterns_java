package org.zqs.template;

public class TemplateMain {
    public static void main(String[] args) {
    	CoffineBeverage tea = new Tea();
    	CoffineBeverage coffee = new Coffee();
    	tea.prepareReceipt();
    	coffee.prepareReceipt();
	}
}
