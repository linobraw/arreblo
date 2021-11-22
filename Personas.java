
package dominio;

public class Personas {
    private String nombre;
    private String apellido;
    private String telfono;
    private String direccion;

//    public Personas(String julio) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
     public Personas(String nombre, String apellido, String telfono, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telfono = telfono;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", apellido=" + apellido + ", telfono=" + telfono + ", direccion=" + direccion + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelfono() {
        return telfono;
    }

    public void setTelfono(String telfono) {
        this.telfono = telfono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

   
    
    
}
