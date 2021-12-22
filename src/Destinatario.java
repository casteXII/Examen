public class Destinatario {
    public String nombre;
    public String apellido;
    public int edad;

    public int getEdad() {return edad;}
    public String getApellido() {return apellido;}
    public String getNombre() {return nombre;}

    public void setApellido(String apellido) {this.apellido = apellido;}
    public void setEdad(int edad) {this.edad = edad;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public Destinatario(String nombre, String apellido, int edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
    }
}