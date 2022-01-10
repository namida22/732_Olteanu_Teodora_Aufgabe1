import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        OffertenRepository offertenRepository = new OffertenRepository();
        offertenRepository.lesen();

        OffertenController offertenController = new OffertenController();
        offertenController.sortieren();

        //for(Offerte o: OffertenRepository.offertenRepository)
            //System.out.println(o);
    }
}
