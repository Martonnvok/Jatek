package jatekok;


public class Jatekok {

    
    public static void main(String[] args) {
        Karakter karakter = new Karakter();

        karakter.felvesz(new Targy("Fakard", "fakard leírás"), 2);
        karakter.felvesz(new Targy("Bájital", "bájital Leírás"), 2);
        karakter.felvesz(new Targy("Könyvek", "könyvek leírás"), 3);
        System.out.println(karakter.toString());
        karakter.hasznal("Fakard");
        karakter.hasznal("Bájital", 2);
        karakter.hasznal("Könyvek", 5, false);

        System.out.println(karakter.toString());
    }
    
}
