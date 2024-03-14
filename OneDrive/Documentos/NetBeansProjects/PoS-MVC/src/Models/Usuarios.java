
package Models;


public class Usuarios {
    private int Id;
    private String Nombre;
    private String Usuario;
    private String Password;
    private String Caja;
    private String rol;
    private String estado;
    
    public Usuarios(){
    
    }
    
    public Usuarios(int Id, String Nombre, String Usuario, String Password, String Caja, String rol, String estado) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Usuario = Usuario;
        this.Password = Password;
        this.Caja = Caja;
        this.rol = rol;
        this.estado = estado;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getCaja() {
        return Caja;
    }

    public void setCaja(String Caja) {
        this.Caja = Caja;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
