import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public class OffertenController {

    OffertenRepository offertenRepository = new OffertenRepository();

    /**
     * sort in a auxrepo all the Offerts
     * writes the sorted offerts into txt file
     * @throws IOException
     */
    public void sortieren() throws IOException {

        ArrayList<Offerte> offertenAux = new ArrayList<>();

        offertenAux = OffertenRepository.offertenRepository;
        /*for(int i=0;i<OffertenRepository.offertenRepository.size();i++)
        {
            offertenAux.set(i, OffertenRepository.offertenRepository.get(i));
        }*/

        for(Offerte o: offertenAux)
            o.setPreis(o.getPreis() + (o.getMehrwertsteuer()/100)*o.getPreis());

        offertenAux.sort(Comparator.comparing(Offerte::getPreis).reversed());

        OffertenRepository.inTextFileAufschreiben(new File("AUfgabe1\\src\\offertensortiert.txt"), offertenAux);
    }

    /**
     * top of the unternehemen mit most income
     * Top mit dem Preis mit MWST
     */
    public void top() throws IOException {
        OffertenRepository.offertenRepository.sort(Comparator.comparing(Offerte::getPreis).reversed());

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Aufgabe1\\src\\statistik.txt"));

        for(Offerte offerte: OffertenRepository.offertenRepository) {
            bufferedWriter.write( offerte.getOrt() + " " + offerte.getPreis() + "\n") ;
        }
        bufferedWriter.close();
    }


}
