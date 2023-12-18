package jatekok;

public class Kezdes extends Helyszin implements MasikIrany {

    @Override
    public String leiras() {

        return "Ez a kezdés! Jobbra vagy balra ?";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Jobbra();
    }

    @Override
    public String egyikBtnFelirat() {
        return "menj jobbra";
    }

    @Override
    public String masikBtnFelirat() {
        return "balra";
    }

    @Override
    public Helyszin masikIrany() {
        return new Balra();
    }

}
