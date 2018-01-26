import Distributore.*;

import java.io.*;

public class FReader {
    BufferedReader input;
    String riga;
    Prodotto p;

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
            if(d instanceof DistibutoreSnack) {
                p = new Snack(rigaSplit[0],rigaSplit[1],Double.parseDouble(rigaSplit[2]));
                d.aggiungiProdotto(rigaSplit[0],p);
            }
            if(d instanceof DistributoreBevande){
                p = new Bevanda(rigaSplit[2],rigaSplit[0]+" "+rigaSplit[1],Double.parseDouble(rigaSplit[3]));
                d.aggiungiProdotto(rigaSplit[0]+" "+rigaSplit[1],p);
            }

            try {
                riga = input.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
