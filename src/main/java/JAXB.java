
import jakarta.xml.bind.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class JAXB {
    File file = new File("lol.xml");
    Datas datas;
    Data data;
    JAXBContext jaxbContext;
    Marshaller jaxbMarshaller;
    Unmarshaller unmarshaller;
    List<Data> datos;
    JAXB(List<Champion> champions) {
        try {
            jaxbContext = JAXBContext.newInstance(Datas.class);
//            unmarshaller = jaxbContext.createUnmarshaller();
//            datas = (Datas) unmarshaller.unmarshal(file);

            for (Champion c: champions){
                data = new Data(c.nombre, c.rol, c.historia);
                datos.add(data);
            }
            datas.setDatos(datos);

            jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(datas, file);
            jaxbMarshaller.marshal(datas, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
