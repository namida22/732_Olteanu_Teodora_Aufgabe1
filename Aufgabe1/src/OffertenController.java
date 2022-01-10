import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

public class OffertenController {

    OffertenRepository offertenRepository = new OffertenRepository();

    public void sortieren() throws IOException {
        ArrayList<Offerte> offertenAux = new ArrayList<>();
        offertenAux = OffertenRepository.offertenRepository;

        for(Offerte o: offertenAux)
            o.setPreis(o.getPreis() + (o.getMehrwertsteuer()/100)*o.getPreis());

        offertenAux.sort(Comparator.comparing(Offerte::getPreis).reversed());

        OffertenRepository.inTextFileAufschreiben(new File("AUfgabe1\\src\\offertensortiert.txt"), offertenAux);
    }


}
