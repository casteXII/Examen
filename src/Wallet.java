import java.time.LocalDate;

public class Wallet {
    //Atributos
    private String cod;
    private float cantidad;
    private LocalDate fecha;
    private float valorE;
    private int id;
    public int walletscreadas;
    private boolean bloqueo;
    private String nombre;
    private String apellido;
    private int codigo;


    //Getters y setters
    public float getCantidad() {return cantidad;}
    public float getValorE() {return valorE;}
    public String getCod() {return cod;}
    public LocalDate getFecha() {return fecha;}
    public int getId() {return id;}
    public int getWalletscreadas() {return walletscreadas;}
    public String getApellido() {return apellido;}
    public int getCodigo() {return codigo;}
    public String getNombre() {return nombre;}

    public void setCantidad(float cantidad) {this.cantidad = cantidad;}
    public void setCod(String cod) {this.cod = cod;}
    public void setFecha(LocalDate fecha) {this.fecha = fecha;}
    public void setValorE(float valorE) {this.valorE = valorE;}
    public void setId(int id) {this.id = id;}
    public void setWalletscreadas(int walletscreadas) {this.walletscreadas = walletscreadas;}
    public void setBloqueo(boolean bloqueo) {this.bloqueo = bloqueo;}
    public void setApellido(String apellido) {this.apellido = apellido;}
    public void setCodigo(int codigo) {this.codigo = codigo;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setPropietario(Propietario propietario){
        this.nombre=propietario.nombre;
        this.apellido=propietario.apellido;
        this.codigo=propietario.cod;
    }

    //Constructor
    public Wallet(int id, String cod, float cantidad, LocalDate fecha, float valorE){
        this.id=id;
        this.cod=cod;
        this.cantidad=cantidad;
        this.fecha=fecha;
        this.valorE=valorE;
        walletscreadas++;
        bloqueo=false;
    }

    //Métodos
    public boolean transfiere(Wallet wallet, float cantidad){
        if(cod.equals(wallet.cod)&& this.cantidad>cantidad){
            this.cantidad+=cantidad;
            wallet.cantidad-=cantidad;
            return true;
        }else{
            return false;
        }
    }

    public void bloquea(){
        bloqueo=true;
    }


    public void muestra(){
        if (bloqueo){
            System.out.println("BLOQUEADA! Wallet "+id+": "+cantidad+" "+cod+" --> Valor actual: "+valorE+"€ "+fecha+". Propietario: "+nombre+" "+apellido+" ("+codigo+")");
        }else{
        System.out.println("Wallet "+id+": "+cantidad+" "+cod+" --> Valor actual: "+valorE+"€ "+fecha+". Propietario: "+nombre+" "+apellido+" ("+codigo+")");
    }
    }

}
