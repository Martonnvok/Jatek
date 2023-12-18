
package jatekok;

public class Start extends Helyszin {
    
    @Override
    public String leiras() {
        
        return "Ez a start, menj tovább";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Kezdes();
    }

    @Override
    public String egyikBtnFelirat() {
       return "menj tovább!";
    }

}
