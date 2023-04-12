package steps_Teme;

public class ContBancarAcasa {
    private String numeClient;
    private String numarCont;
    private double balanta;
    private String email;
    private String numarTelefon;

    public double getBalanta() {
        return balanta;
    }

    public String getEmail() {
        return email;
    }

    public String getNumarCont() {
        return numarCont;
    }

    public String getNumarTelefon() {
        return numarTelefon;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setBalanta(double balanta) {
        this.balanta = balanta;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumarCont(String numarCont) {
        this.numarCont = numarCont;
    }

    public void setNumarTelefon(String numarTelefon) {
        this.numarTelefon = numarTelefon;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void DepuneNumerar(double numerar) {
        balanta = balanta + numerar;
    }

    public void RetrageNumerar(double numerar) {
        if (balanta > numerar)
            balanta = balanta - numerar;
        else
            System.out.println("Nu ai bani.");
    }

    public static void main(String... args) {
        {
            ContBancarAcasa cont1 = new ContBancarAcasa();
            cont1.setBalanta(500);

            cont1.RetrageNumerar(100);
            System.out.println("Balanta actualizata  = " + cont1.getBalanta());

            cont1.RetrageNumerar(600);
        }
    }
}

