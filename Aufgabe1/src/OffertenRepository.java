import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class OffertenRepository {

    public static ArrayList<Offerte> offertenRepository = new ArrayList<>();

    public OffertenRepository(){};

    public ArrayList<Offerte> getOffertenRepository() {
        return offertenRepository;
    }

    public void setOffertenRepository(ArrayList<Offerte> offertenRepository) {
        this.offertenRepository = offertenRepository;
    }

    /**
        read from offerten.txt and add each Offert object to the Repository
     */
    public void lesen() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("Aufgabe1\\src\\offerten.txt"));
        String s;

        while ((s = bufferedReader.readLine()) != null) {
            String[] var = s.split("&");

            Offerte offerte = new Offerte();
            offerte.setId(Integer.parseInt(var[0]));
            offerte.setUnternehmensName(var[1]);
            offerte.setPreis(Float.parseFloat(var[2]));
            offerte.setMehrwertsteuer(Float.parseFloat(var[3]));
            offerte.setAdresse(var[4]);
            offerte.setOrt(enum_ort.valueOf(var[5]));

            offertenRepository.add(offerte);
        }
    }

    public static void inTextFileAufschreiben(File file, ArrayList<Offerte> arrayList) throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        for(Offerte offerte: arrayList) {
            bufferedWriter.write(offerte.getId() + "&" + offerte.getUnternehmensName() + "&" + offerte.getPreis()
                    + "&" + offerte.getMehrwertsteuer() + "&" + offerte.getAdresse()+ "&" +offerte.getOrt() + "\n") ;

        }
        bufferedWriter.close();
    }
}
