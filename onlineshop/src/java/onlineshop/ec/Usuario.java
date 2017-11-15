
package onlineshop.ec;

public class Usuario {
    private int usuario_id;
    private String nombre;
    private String apellido;
    private String direccion;   
    private String email;
    private String login_nombre;
    private String contrasenha; //No texto plano, en MD5
    private int tipo_usuario; //0 Admin, 1 Usuario Normal

    public Usuario() {
    }

    public Usuario(int usuario_id, String nombre, String apellido, String direccion, String email, String login_nombre, String contrasenha, int tipo_usuario) {
        this.usuario_id = usuario_id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.email = email;
        this.login_nombre = login_nombre;
        this.contrasenha = contrasenha;
        this.tipo_usuario = tipo_usuario;
    }

    public int getUsuario_id() {
        return usuario_id;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin_nombre() {
        return login_nombre;
    }

    public void setLogin_nombre(String login_nombre) {
        this.login_nombre = login_nombre;
    }

    public String getContrasenha() {
        return contrasenha;
    }

    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }

    public int getTipo_usuario() {
        return tipo_usuario;
    }

    public void setTipo_usuario(int tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }

  
    
}
