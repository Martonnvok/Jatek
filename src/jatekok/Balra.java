
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
        throw new UnsupportedOperationException("Keletre nincs osztály."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String masikBtnFelirat() {
         return "Dél";
    }

    @Override
    public Helyszin masikIrany() {
         throw new UnsupportedOperationException("Nyugaton nincs osztály."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
