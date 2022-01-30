import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase tiene una list de la clase Data
 */
@XmlRootElement(name="Campeones")
public class Datas {
    List<Data> datos = new ArrayList<>();

    /**
     * Esto para pillar la lista de Data.
     * @return devuelve la lista.
     */
    public List<Data> getDatos() {
        return datos;
    }
    /**
     * Esto para asignar una lista de la clase Data.
     * @param datos recibe el que le asignamos a la lista.
     */
    @XmlElement(name="Campeon")
    public void setDatos(List<Data> datos) {
        this.datos = datos;
    }

    /**
     * Esto es el metodo para añadir un Data dentro de la lista
     * @param data recibe el que le vas a añadir en la lista.
     */
    public void addDatos(Data data){
        this.datos.add(data);
    }
}
