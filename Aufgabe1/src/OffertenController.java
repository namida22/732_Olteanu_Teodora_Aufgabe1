import java.util.Comparator;

public class OffertenController {

    OffertenRepository offertenRepository = new OffertenRepository();

    public void sortieren()
    {
        OffertenRepository.offertenRepository.sort(Comparator.comparing(Offerte::getPreis).reversed());
        substract_MWST();
    }

    public void substract_MWST()
    {
        for (Offerte o: OffertenRepository.offertenRepository)
            o.setPreis(o.getPreis() - o.getPreis()*o.getMehrwertsteuer());
    }
}
