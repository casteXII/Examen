import java.sql.SQLOutput;
import java.time.LocalDate;

public class WalletMain {
    public static void main(String[]args){
        Propietario p1= new Propietario("Pablo","Castellano",54321);
        Propietario p2= new Propietario("Eladio","Carrión", 87654);
        Propietario p3= new Propietario("Manolo", "Escobar", 98765);

        LocalDate hoy= LocalDate.now();

        Wallet w1= new Wallet(1, "BTC",0.05f,hoy,5552f);
        Wallet w2= new Wallet(2, "ETH",1.2f,hoy,3800f);
        Wallet w3= new Wallet(3, "ADA",1000f,hoy,1.34f);
        Wallet w4= new Wallet(4, "BTC",0.02f,hoy,5552f);

        w1.setPropietario(p1);
        w2.setPropietario(p2);
        w3.setPropietario(p3);
        w4.setPropietario(p2);

        w1.setValorE(55000f);
        w2.setValorE(4000f);
        w3.setValorE(1.28f);
        w4.setValorE(55000f);

        w1.muestra();
        w2.muestra();
        w3.muestra();
        w4.muestra();

        System.out.println("-------------------------------------------------");
        System.out.println("Transferencia 1 "+ (w1.transfiere(w4,0.02f)?"correcta":"incorrecta"));
        System.out.println("Transferencia 2 "+ (w2.transfiere(w3,500f)?"correcta":"incorrecta"));
        System.out.println("Transferencia 3 "+ (w1.transfiere(w4,2f)?"correcta":"incorrecta"));
        System.out.println("-------------------------------------------------");

        w4.bloquea();

        w1.muestra();
        w2.muestra();
        w3.muestra();
        w4.muestra();
    }
}
