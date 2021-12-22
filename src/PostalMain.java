public class PostalMain {
    public static void main(String[]args){
        Postal p1= new Postal("+",15,20,"Feliz Navidad");
        Postal p2= new Postal("#", 9,48,"Felicidades");

        Destinatario d1= new Destinatario("Maria", "Blanco",38);
        Destinatario d2= new Destinatario("Pablo", "Castellano",20);

        p1.pinta();
        p2.pinta();

        p1.setDestinatario(d1);
        p2.setDestinatario(d2);

        p1.pinta();
        p2.pinta();

        Postal p4= new Postal("+",7,38,"Felices Fiestas");
        p4.setDestinatario(d1);
        p4.pinta();
    }
}
