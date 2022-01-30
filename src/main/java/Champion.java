import java.util.ArrayList;

/**
 * Esto es la clase de Campeon tiene unas variables que vamos a robar.
 */
public class Champion {

    String nombre;
    String rol;
    String historia;

    /**
     * Esto para pillar historia.
     * @return devuelve la historia.
     */
    public String getHistoria() {
        return historia;
    }

    /**
     * Esto para asignar una historia.
     * @param historia recibe el que le vas a poner a la historia.
     */
    public void setHistoria(String historia) {
        this.historia = historia;
    }

    /**
     * Esto para pillar nombre.
     * @return devuelve el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Esto para asignar un nombre.
     * @param nombre recibe el que le vas a poner al nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Esto para pillar el rol.
     * @return devuelve el rol.
     */
    public String getRol() {
        return rol;
    }

    /**
     * ESto para asignar un rol.
     * @param rol recibe el que le vas a poner al rol.
     */
    public void setRol(String rol) {
        this.rol = rol;
    }

    /**
     * Es un constructor que recibira unos valores y les asignara.
     * @param nombre recibe el nombre que le vas a poner.
     * @param rol recibe el rol que le vas a poner.
     * @param historia recibe la historia que le vas a poner.
     */
    Champion(String nombre, String rol, String historia){
        this.nombre = nombre;
        this.rol = rol;
        this.historia = historia;
    }
}
