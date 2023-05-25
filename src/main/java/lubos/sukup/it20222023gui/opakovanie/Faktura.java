package lubos.sukup.it20222023gui.opakovanie;

public class Faktura {

    private final double zlavaVPercentach = 3.5;
   private String	nazevZbozi;
    private int pocetKusu;
    private double hmotnost;
    private  double cena;
    private  String  datumVystavneniaFakury;
    private  boolean narokNaZlavu;

    public Faktura(String nazevZbozi, int pocetKusu, double hmotnost,
                   double cena, String datumVystavneniaFakury, boolean narokNaZlavu) {
        this.nazevZbozi = nazevZbozi;
        this.pocetKusu = pocetKusu;
        this.hmotnost = hmotnost;
        this.cena = cena;
        this.datumVystavneniaFakury = datumVystavneniaFakury;
        this.narokNaZlavu = narokNaZlavu;
    }

    public String getNazevZbozi() {
        return nazevZbozi;
    }

    public void setNazevZbozi(String nazevZbozi) {
        this.nazevZbozi = nazevZbozi;
    }

    public int getPocetKusu() {
        return pocetKusu;
    }

    public void setPocetKusu(int pocetKusu) {
        this.pocetKusu = pocetKusu;
    }

    public double getHmotnost() {
        return hmotnost;
    }

    public void setHmotnost(double hmotnost) {
        this.hmotnost = hmotnost;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getDatumVystavneniaFakury() {
        return datumVystavneniaFakury;
    }

    public void setDatumVystavneniaFakury(String datumVystavneniaFakury) {
        this.datumVystavneniaFakury = datumVystavneniaFakury;
    }

    public boolean isNarokNaZlavu() {
        return narokNaZlavu;
    }

    public void setNarokNaZlavu(boolean narokNaZlavu) {
        this.narokNaZlavu = narokNaZlavu;
    }

    public double celkovaCena(){
        if(narokNaZlavu){
           return cenaPoZlave();
        }else {
        return pocetKusu * cena;
        }
    }

    public double hmotnostZasielky(){
        return hmotnost * pocetKusu;
    }

    private double cenaPoZlave(){
        return (pocetKusu * cena) *(1 - zlavaVPercentach/100);
    }
}
