package hvl.dat108.dat108oblig4.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Bruker {

    @NotNull(message = "Fornavn påkrevd")
    private String fornavn;

    @NotNull(message = "Etternavn påkrevd")
    private String etternavn;

    @NotNull(message = "Mobilnummer påkrevd")
    @Size(min = 8, max = 20, message = "Mobilnummer må være minst 8 tegn")
    private String mobilnr;

    @NotNull(message = "Passord påkrevd")
    @Size(min = 8, message = "Passord må være minst 8 tegn")
    private String passord1;

    @NotNull(message = "Bekreft passord")
    private String passord2;

    private String kjonn;

    public Bruker(){}

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getMobilnr() {
        return mobilnr;
    }

    public void setMobilnr(String mobilnr) {
        this.mobilnr = mobilnr;
    }

    public String getPassord1() {
        return passord1;
    }

    public void setPassord1(String passord1) {
        this.passord1 = passord1;
    }

    public String getPassord2() {
        return passord2;
    }

    public void setPassord2(String passord2) {
        this.passord2 = passord2;
    }

    public String getKjonn() {
        return kjonn;
    }

    public void setKjonn(String kjonn) {
        this.kjonn = kjonn;
    }

    @Override
    public String toString() {
        return "Bruker{" +
                "fornavn='" + fornavn + '\'' +
                ", etternavn='" + etternavn + '\'' +
                ", mobilnr='" + mobilnr + '\'' +
                ", kjonn='" + kjonn + '\'' +
                '}';
    }
}
