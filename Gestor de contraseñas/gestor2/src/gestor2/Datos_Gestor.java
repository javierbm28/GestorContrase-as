/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestor2;

/**
 *
 * @author Javier Bravo
 */
public class Datos_Gestor {
    private String Usuario;
    private String Contrasena;
    private String URL;
    private String nombreWeb;

    public Datos_Gestor(String Usuario, String Contrasena, String URL, String nombreWeb) {
        this.Usuario = Usuario;
        this.Contrasena = Contrasena;
        this.URL = URL;
        this.nombreWeb = nombreWeb;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getNombreWeb() {
        return nombreWeb;
    }

    public void setNombreWeb(String nombreWeb) {
        this.nombreWeb = nombreWeb;
    } 
}
