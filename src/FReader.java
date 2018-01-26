import Distributore.Distributore;

import java.io.*;

public class FReader {
    BufferedReader input;
    String riga;

    public void load(Distributore d, String nomeFile){

        File file = new File(nomeFile);
        try {
            input = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            riga = input.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        while(riga != null){
            String[] rigaSplit = riga.split("\t");
            if
            d.aggiungiProdotto();
        }

    }
}
