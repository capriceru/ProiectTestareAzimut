package steps_clase_cu_super;

public class Animale {
    private String nume;
    private String rasa;
    private int varsta;
    private String culoare;
    private int greutate;
    private int lungime;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getGreutate() {
        return greutate;
    }

    public void setGreutate(int greutate) {
        this.greutate = greutate;
    }

    public int getLungime() {
        return lungime;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    public Animale(String nume, String rasa, int varsta, String culoare, int greutate, int lungime) {
        this.nume = nume;
        this.rasa = rasa;
        this.varsta = varsta;
        this.culoare = culoare;
        this.greutate = greutate;
        this.lungime = lungime;
    }
    public static void printStr(String paramStr){
        System.out.println(paramStr);
    }
    public void mananca(){
        printStr(getNume()+" mananca.");
    }

    public void alearga(int viteza){
        printStr(getNume()+" alearga cu "+viteza+" Km/h");
    }
    public void comunicare(){
        printStr(getNume()+" comunica!");
    }
}
