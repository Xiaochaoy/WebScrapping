import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name="Campeones")
public class Datas {
    List<Data> datos = new ArrayList<>();

    public List<Data> getDatos() {
        return datos;
    }

    @XmlElement(name="Campeon")
    public void setDatos(List<Data> datos) {
        this.datos = datos;
    }
}
