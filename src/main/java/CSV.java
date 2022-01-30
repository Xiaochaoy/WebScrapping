import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta es la clase que sirve para crear fichero CSV con los datos que sacamos en la clase Webscapping
 */
public class CSV {
    File file = new File("lol.csv");

    /**
     * Esto es el metodo que recibe un parametro y lo mete en CSV.
     * @param champions recibe un lista de objetos de champion
     */
    public CSV(List<Champion> champions) {
        CSVWriter csvWriter;
        String[] head = {"Nom","Rol","Historia"};
        List<String[]> data = new ArrayList<>();
        for (Champion c: champions){
            data.add(new String[] {c.nombre,c.rol,c.historia});
        }
        try {
            csvWriter = new CSVWriter(new FileWriter(file));
            csvWriter.writeNext(head);
            csvWriter.writeAll(data);
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
