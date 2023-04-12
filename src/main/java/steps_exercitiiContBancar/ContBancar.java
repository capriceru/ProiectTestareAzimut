package steps_exercitiiContBancar;

public class ContBancar extends Client {

    private String numeContBancarAlias;
    private int numarContBancar;
    private double valoareCont;

    public ContBancar(String numeCLient, String adresaClient, String numeContBancarAlias, int numarContBancar, double valoareCont) {
        super(numeCLient, adresaClient);
        this.numeContBancarAlias = numeContBancarAlias;
        this.numarContBancar = numarContBancar;
        this.valoareCont = valoareCont;
    }

    public String getNumeContBancarAlias() {
        return numeContBancarAlias;
    }

    public int getNumarContBancar() {
        return numarContBancar;
    }

    public double getValoareCont() {
        return valoareCont;
    }

    private void setValoareCont(double v) {
    }



    public void alimentareContBancar(double sumaDeBani) {
        if (sumaDeBani > 0) {
            valoareCont = valoareCont + sumaDeBani;
        }
        else System.out.println("Contul nu a putut fi alimentat. Suma adaugata este invalida.");
        System.out.println("Contul a fost alimentat cu" + sumaDeBani + "iar contul are valoarea" + valoareCont);
    }

    public void retragereSuma(int sumaDeBani){
        if (sumaDeBani > 0) {
            if (valoareCont - sumaDeBani > 0) {
                valoareCont = valoareCont - sumaDeBani;
                System.out.println("Contului i-au fost retrasi " + sumaDeBani + " lei, astfel contul are valoarea " + valoareCont);
            }
            else System.out.println("Fonduri insuficiente! Contul tau are valoarea: " + valoareCont);
        }
        else System.out.println("Suma introdusa nu este corecta.");
    }

    public void exchange(String moneda){
        switch (moneda) {
            case "EURO" -> {
                setValoareCont(getValoareCont()/5);
                System.out.println("Valoarea contului in EURO este: " + getValoareCont());
            }
            case "LIRA" -> {
                setValoareCont(getValoareCont()/5.6);
                System.out.println("Valoarea contului in LIRE este: " + getValoareCont());
            }
            default -> System.out.println("Valoare contului in RON este: " + getValoareCont());
        }
    }

    public void plataFactura(double sumaDeBani){
        if (sumaDeBani > 0) {
            if (valoareCont - sumaDeBani > 0) {
                valoareCont = valoareCont - sumaDeBani;
                System.out.println("Factura de " + sumaDeBani + " lei a fost platita! Astfel contul are valoarea " + valoareCont);
            }
            else System.out.println("Fonduri insuficiente! Contul tau are valoarea: " + valoareCont);
        }
        else System.out.println("Deja factura a fost platita.");

    }
}
