import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 * Esto es la clase de Data (Campeon) tiene unas variables que vamos a usar para meter en XML.
 */

@XmlRootElement(name="Campeon")
public class Data {
    String name;
    String rol;
    String historia;

    /**
     * Es un constructor que recibira unos valores y les asignara.
     * @param name recibe el nombre que le vas a poner.
     * @param rol recibe el rol que le vas a poner.
     * @param historia recibe la historia que le vas a poner.
     */
    public Data(String name, String rol, String historia) {
        this.name = name;
        this.rol = rol;
        this.historia = historia;
    }

    /**
     * Un constructor normalito.
     */
    public Data(){}


    /**
     * Esto para pillar name.
     * @return devuelve el name.
     */
    public String getName() {
        return name;
    }

    /**
     * Esto para pillar el rol.
     * @return devuelve el rol.
     */
    public String getRol() {
        return rol;
    }

    /**
     * Esto para pillar historia.
     * @return devuelve la historia.
     */
    public String getHistoria() {
        return historia;
    }

    /**
     * Esto para asignar el valor de name en xml.
     * @param name recibe el que le vas a poner en name.
     */
    @XmlElement(name="CHAMPION_NAME")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Esto para asignar el valor de rol en xml.
     * @param rol recibe el que le vas a poner en rol.
     */
    @XmlElement(name="CHAMPION_ROL")
    public void setRol(String rol) {
        this.rol = rol;
    }

    /**
     * Esto para asignar el valor de historia en xml.
     * @param historia recibe el que le vas a poner en historia.
     */
    @XmlElement(name="CHAMPION_HISTORY")
    public void setHistoria(String historia) {
        this.historia = historia;
    }
}
