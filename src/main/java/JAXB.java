
import jakarta.xml.bind.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta es la clase que sirve para crear fichero XML con los datos que sacamos en la clase Webscapping
 */
public class JAXB {
    File file = new File("lol.xml");
    Datas datas = new Datas();
    Data data;
    JAXBContext jaxbContext;
    Marshaller jaxbMarshaller;

    /**
     * Esto es el metodo que recibe un parametro y lo mete en xml.
     * @param champions recibe un lista de objetos de champion.
     */
    JAXB(List<Champion> champions) {
        try {
            jaxbContext = JAXBContext.newInstance(Datas.class);

            for (Champion c : champions) {
                data = new Data(c.nombre, c.rol, c.historia);
                datas.addDatos(data);
            }

            jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(datas, file);
//            jaxbMarshaller.marshal(datas, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}