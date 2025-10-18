package hvl.dat108.dat108oblig4.model;

public class Deltager {
    private final String fornavn;
    private final String etternavn;
    private final String mobilnr;
    private final String kjonn;

    public Deltager(String etternavn, String fornavn, String mobilnr, String kjonn) {
        this.etternavn = etternavn;
        this.fornavn = fornavn;
        this.mobilnr = mobilnr;
        this.kjonn = kjonn;
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public String getMobilnr() {
        return mobilnr;
    }

    public String getKjonn() {
        return kjonn;
    }

    public String getNavn(){
        return fornavn + " " + etternavn;
    }
}
