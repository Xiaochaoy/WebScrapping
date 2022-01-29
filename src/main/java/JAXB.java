
import jakarta.xml.bind.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class JAXB {
    File file = new File("lol.xml");
    Datas datas = new Datas();
    Data data;
    JAXBContext jaxbContext;
    Marshaller jaxbMarshaller;

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