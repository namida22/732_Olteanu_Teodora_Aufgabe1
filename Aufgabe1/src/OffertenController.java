import java.util.Comparator;

public class OffertenController {

    OffertenRepository offertenRepository = new OffertenRepository();

    public void sortieren()
    {
        OffertenRepository.offertenRepository.sort(Comparator.comparing(Kosten::getDatum).reversed());
    }
}
