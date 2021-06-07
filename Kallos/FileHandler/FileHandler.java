package FileHandler;
import java.io.FileWriter;
import java.io.IOException;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.time.LocalDateTime;  

public class FileHandler {
    public String dodajStudenta(ArrayList<String> unos){

        DateTimeFormatter formatDatuma = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH-mm-ss");  
        LocalDateTime vrijeme = LocalDateTime.now();  

        String nazivFilea = "unos-" + formatDatuma.format(vrijeme);

        try {
            FileWriter fileWriter = new FileWriter("Kallos/baza/" + nazivFilea + ".txt");

            for(int i=0; i < unos.size(); i++){
                fileWriter.write(" - " + unos.get(i) + "\n");                    
            }

            fileWriter.close();
            return "Uspjesno unesen student!";
        } catch (IOException error) {
            error.printStackTrace();
            return "Error, dogodila se greska.";
        }
    }
}

change made in submodule