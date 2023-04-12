package steps_Setter_si_Gettere;

public class ContBancar {

    private String nrcont;

    private int balanta;

    private String numeClient;

    private String email;

    private String nrtelefon;

    public ContBancar(){
        this("BCR005547234212313", 100, "Gigel", "gigel.barosanul@azimut.ro",
                "+4077923423" );
        }

    public ContBancar(String nrcont, int balanta, String numeClient, String email, String nrtelefon) {
        this.nrcont = nrcont;
        this.balanta = balanta;
        this.numeClient = numeClient;
        this.email = email;
        this.nrtelefon = nrtelefon;
    }

    public void setNrcont(String nrcont) {
        this.nrcont = nrcont;
    }

    public void setBalanta(int balanta) {
        this.balanta = balanta;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNrtelefon(String nrtelefon) {
        this.nrtelefon = nrtelefon;
    }

    public String getNrcont() {
        return this.nrcont;
    }

    public int getBalanta() {
        return this.balanta;
    }

    public String getNumeClient() {
        return this.numeClient;
    }

    public String getEmail() {
        return this.email;
    }

    public String getNrtelefon() {
        return this.nrtelefon;
    }

    public int depozitNumerar(int numerar){

        if (numerar > 0){
            balanta=balanta+numerar;
        }
        System.out.println(balanta);
        return balanta;
    }

    public int retragere(int numerar) {

        if (balanta - numerar > 10) {
            balanta = balanta - numerar;
            System.out.println(balanta);
            return balanta;
        }
        else
            System.out.println("Fondul disponibil in cont este :" + balanta);
            System.out.println(" Va rugam introduce-ti multiplu de 10");
        return balanta;
    }

}
