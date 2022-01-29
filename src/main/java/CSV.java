import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSV {
    File file = new File("lol.csv");
    public CSV(String nom, String rol, String historia) {
        CSVWriter csvWriter;
        String[] campeones = new String[3];

        campeones[0] = (nom);
        campeones[1] = (rol);
        campeones[2] = (historia);

        try {
            csvWriter = new CSVWriter(new FileWriter(file));
            csvWriter.writeNext(campeones);
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
