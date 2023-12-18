
package jatekok;


public class Balra extends Helyszin implements MasikIrany {

    @Override
    public String leiras() {
        return "Ez balra van! Délre vagy Északra?";
    }

    @Override
    public String egyikBtnFelirat() {
       return "keletre";
    }

    @Override
    public Helyszin egyikIrany() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String masikBtnFelirat() {
         return "Dél";
    }

    @Override
    public Helyszin masikIrany() {
         return null;
    }

    
}
