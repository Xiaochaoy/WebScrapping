
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.PropertyException;
import java.io.File;

public class JAXB_xml {
    Data champion;
    public JAXB_xml(String nombre, String rol, String historia){
        champion = new Data();
        champion.setName(nombre);
        champion.setRol(rol);
        champion.setHistoria(historia);

        JAXBContext jaxbContext = null;
        try {
            jaxbContext = JAXBContext.newInstance(Data.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        Marshaller jaxbMarshaller = null;
        try {
            jaxbMarshaller = jaxbContext.createMarshaller();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        try {
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        } catch (PropertyException e) {
            e.printStackTrace();
        }
        try {
            jaxbMarshaller.marshal(champion, new File("lol.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        try {
            jaxbMarshaller.marshal(champion, System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
