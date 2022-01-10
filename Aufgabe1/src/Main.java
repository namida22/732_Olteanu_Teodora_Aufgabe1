import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        OffertenRepository offertenRepository = new OffertenRepository();
        offertenRepository.lesen();

        OffertenController offertenController = new OffertenController();
        offertenController.sortieren();

        offertenController.top();
    }
}
