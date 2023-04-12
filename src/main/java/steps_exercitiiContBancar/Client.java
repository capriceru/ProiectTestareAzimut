package steps_exercitiiContBancar;

public class Client {
    public static Client client1;

    //Vom exersa notiunile de Java invatate pana acum prin efectuarea platii unei facturi
    // Pentru asta avem nevoie de un client, o factura si un cont bancar.
    // Astfel, vom crea un client, caruia ii vom da un nume si o adresa.
    // Clientului ii vom asocia un cont bancar, ce va curpinde atat datele clientului, cat si informatii despre
    // numele contului(alias), numarul contului si suma de bani in lei.
    // Astfel, vom putea alimenta contul bancar, vom putea retrage o anumita suma si vom putea converti suma din LEI in EURO
    // Apoi, vom crea si o factura, ce va contine datele clientului, numarul de client, data emiterii si suma datorata
    // pe care clientul o va putea plati.


    private String numeCLient;
    private String adresaClient;

    public Client(String numeCLient, String adresaClient) {
        this.numeCLient = numeCLient;
        this.adresaClient = adresaClient;
    }

    public void setNumeCLient(String numeCLient) {
        this.numeCLient = numeCLient;
    }

    public void setAdresaClient(String adresaClient) {
        this.adresaClient = adresaClient;
    }

    public String getNumeCLient() {
        return numeCLient;
    }

    public String getAdresaClient() {
        return adresaClient;
    }

    public boolean getNumeClient() {
        return false;
    }
}
