package pl.edu.wszib.springhelloworld.model;

public class KartaDoGlosowania {

    private Glos glos;

    public void zaznacz(Glos glos) {

        this.glos = glos;
    }

    public Glos getGlos() {
        return glos;
    }
}
