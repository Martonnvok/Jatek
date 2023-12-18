
package jatekok;


public class Jobbra extends Helyszin implements MasikIrany {

    @Override
    public String leiras() {
         return "Ez Jobbra van! Nyugatra vagy Keletre?";
    }

    @Override
    public String egyikBtnFelirat() {
        return "délre";
    }

    @Override
    public Helyszin egyikIrany() {
        throw new UnsupportedOperationException("Északon nincs osztály."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String masikBtnFelirat() {
        return "Nugyat"; 
    }

    @Override
    public Helyszin masikIrany() {
        throw new UnsupportedOperationException("Délen nincs osztály."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
