package org.zqs.facade;

public class TestFacade {
    public static void main(String[] args) {
		HomeTheaterFacade theaterFacade = new HomeTheaterFacade(new Amplifier(), new DVD(), new Screen(), new Tuner());
		theaterFacade.watchMovie();
		theaterFacade.endMovie();
    }
}
