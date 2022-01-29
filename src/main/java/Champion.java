import java.util.ArrayList;

public class Champion {

    String nombre;
    String rol;
    String historia;

    public String getHistoria() {
        return historia;
    }
    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }

    Champion(String nombre, String rol, String historia){
        this.nombre = nombre;
        this.rol = rol;
        this.historia = historia;
    }
}
