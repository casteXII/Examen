public class Propietario {
    public String nombre;
    public String apellido;
    public int cod;

    public int getCod() {return cod;}
    public String getApellido() {return apellido;}
    public String getNombre() {return nombre;}

    public void setApellido(String apellido) {this.apellido = apellido;}
    public void setCod(int cod) {this.cod = cod;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    //Constructor
    public Propietario (String nombre, String apellido, int cod){
        this.nombre=nombre;
        this.apellido=apellido;
        this.cod=cod;
    }
}
