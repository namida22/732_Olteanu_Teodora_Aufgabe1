
enum enum_ort
{
    Thurgau, Zürich, STGallen
}

public class Offerte {

    private int id;
    private String unternehmensName;
    private float preis;
    private String mehrwertsteuer;
    private String adresse;
    private enum_ort ort;

    public Offerte(){};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUnternehmensName() {
        return unternehmensName;
    }

    public void setUnternehmensName(String unternehmensName) {
        this.unternehmensName = unternehmensName;
    }

    public float getPreis() {
        return preis;
    }

    public void setPreis(float preis) {
        this.preis = preis;
    }

    public String getMehrwertsteuer() {
        return mehrwertsteuer;
    }

    public void setMehrwertsteuer(String mehrwertsteuer) {
        this.mehrwertsteuer = mehrwertsteuer;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public enum_ort getOrt() {
        return ort;
    }

    public void setOrt(enum_ort ort) {
        this.ort = ort;
    }

    @Override
    public String toString() {
        return "Offerte{" +
                "id=" + id +
                ", unternehmensName='" + unternehmensName + '\'' +
                ", preis=" + preis +
                ", mehrwertsteuer='" + mehrwertsteuer + '\'' +
                ", adresse='" + adresse + '\'' +
                ", ort=" + ort +
                '}';
    }
}
