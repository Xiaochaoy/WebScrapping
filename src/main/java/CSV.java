import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSV {
    File file = new File("lol.csv");
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
