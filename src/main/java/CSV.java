import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSV {
    public CSV(List<Champion> champions, File file) {
        CSVWriter csvWriter;
        String[] entries = new String[3];
        for (Champion c : champions) {
            entries[0] = (c.nombre);
            entries[1] = (c.rol);
            entries[2] = (c.historia);

            try {
                csvWriter = new CSVWriter(new FileWriter(file));
                csvWriter.writeNext(entries);
                csvWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
