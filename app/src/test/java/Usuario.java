public class Usuario    {

    int id;
    String Usuario, Password;

    public Usuario(){

    }

    public Usuario(String usuario, String password) {
        Usuario = usuario;
        Password = password;
    }

    public boolean IsNull(){
        if(Usuario.equals("")&&Password.equals("")){
        return false;
    }else {
            return true;

        }
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", Usuario='" + Usuario + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        Usuario = usuario;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

}
