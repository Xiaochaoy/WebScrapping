import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Campeon")
public class Data {
    String name;
    String rol;
    String historia;

    public Data(String name, String rol, String historia) {
        this.name = name;
        this.rol = rol;
        this.historia = historia;
    }
    public Data(){}


    public String getName() {
        return name;
    }
    public String getRol() {
        return rol;
    }
    public String getHistoria() {
        return historia;
    }

    @XmlElement(name="CHAMPION_NAME")
    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name="CHAMPION_ROL")
    public void setRol(String rol) {
        this.rol = rol;
    }

    @XmlElement(name="CHAMPION_HISTORY")
    public void setHistoria(String historia) {
        this.historia = historia;
    }
}
