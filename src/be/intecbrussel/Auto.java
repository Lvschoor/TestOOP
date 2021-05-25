package be.intecbrussel;

public class Auto {

    private String merkNaam = "Nog geen automerk gekend";
    private Garage garage;


    public Auto(String merkNaam, Garage garage) {
        this.merkNaam = merkNaam;
        this.garage = garage;
    }

    public Auto(String merkNaam) {
        this.merkNaam = merkNaam;
    }

    public Auto(Auto a) {
        setGarage(a.garage);
        setMerkNaam(a.merkNaam);

    }

    public String getMerkNaam() {
        return merkNaam;
    }

    public void setMerkNaam(String merkNaam) {
        this.merkNaam = merkNaam;
    }

    public Garage getGarage() {
        return garage;
    }


    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    public String toString() {
        return "Auto: " + getMerkNaam() + " Garage: " + getGarage();
    }
}
