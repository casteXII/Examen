public class Postal {
    private String caracter;
    private int altura;
    private int anchura;
    private String mensaje;
    private String nombre;
    private String apellido;
    private int edad;

    public int getAltura() {return altura;}
    public int getAnchura() {return anchura;}
    public String getCaracter() {return caracter;}
    public String getMensaje() {return mensaje;}
    public int getEdad() {return edad;}
    public String getApellido() {return apellido;}
    public String getNombre() {return nombre;}

    public void setAltura(int altura) {this.altura = altura;}
    public void setAnchura(int anchura) {this.anchura = anchura;}
    public void setCaracter(String caracter) {this.caracter = caracter;}
    public void setMensaje(String mensaje) {this.mensaje = mensaje;}
    public void setApellido(String apellido) {this.apellido = apellido;}
    public void setEdad(int edad) {this.edad = edad;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setDestinatario(Destinatario destinatario){
        this.nombre=destinatario.nombre;
        this.apellido=destinatario.apellido;
        this.edad=destinatario.edad;
    }


    public Postal(String caracter, int altura, int anchura, String mensaje){
        this.caracter=caracter;
        this.altura=altura;
        this.anchura=anchura;
        this.mensaje=mensaje;
    }


    public void pinta(){
        if (nombre == null){
            nombre="";
        }
        int a=1;
        int i=1;
        if(altura<5 || altura>15 || anchura<20 || anchura>60){
            System.out.println("ERROR, ALTURA O ANCHURA MAL DEFINIDA");
        }else{
            do {
                System.out.print(caracter+" ");
                a++;
            }while (a<anchura);
            a=1;
            do {
                System.out.println(caracter);
                if (i==(altura/2)){
                    System.out.print(caracter+"     "+mensaje+" "+nombre);
                }


                i++;

            }while (i<altura);
            System.out.println("");
        }
    }
}
