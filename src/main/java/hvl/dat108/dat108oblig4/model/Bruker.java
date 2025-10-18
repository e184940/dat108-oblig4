package hvl.dat108.dat108oblig4.model;

public class Bruker {

    @NotBlank(message = "Fornavn påkrevd")
    private String fornavn;

    @NotBlank(message = "Etternavn påkrevd")
    private String etternavn;

    private String mobilnr;
    private String kjonn;
}
