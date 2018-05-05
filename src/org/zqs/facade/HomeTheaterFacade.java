package org.zqs.facade;

public class HomeTheaterFacade {
	private Amplifier amplifier;
	private DVD dvd;
	private Screen screen;
	private Tuner tuner;
    public HomeTheaterFacade(Amplifier amplifier,DVD dvd,Screen screen,Tuner tuner) {
    	this.amplifier = amplifier;
    	this.dvd = dvd;
    	this.screen = screen;
    	this.tuner = tuner;
    }
    public void watchMovie() {
		this.screen.on();
		this.dvd.on();
		this.tuner.on();
	    this.amplifier.on();
    }
    public void endMovie() {
    	this.amplifier.off();
    	this.tuner.off();
    	this.dvd.off();
    	this.screen.off();
    }
}
