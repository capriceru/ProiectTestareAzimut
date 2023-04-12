package steps_clase_cu_super;

public class Pasari extends Animale{
    String aripi;
    String cioc;
    String pene;
    Boolean vedereNocturna;
    Boolean zburatoare;

    public Pasari(String nume, String rasa, int varsta, String culoare, int greutate, int lungime, String aripi,
                  String cioc, String pene, Boolean vedereNocturna, Boolean zburatoare) {
        super(nume, rasa, varsta, culoare, greutate, lungime);
        this.aripi = aripi;
        this.cioc = cioc;
        this.pene = pene;
        this.vedereNocturna = vedereNocturna;
        this.zburatoare = zburatoare;
    }

    public void tipPasare(){
        if (vedereNocturna = true){
            printStr(getNume()+" este pasare de noapte");
        }
        else printStr(getNume()+" este pasare de zi");
    }

    @Override
    public void comunicare() {
        printStr(getNume()+" face buhuhu!");
        super.comunicare();
    }

    public String getAripi() {
        return aripi;
    }

    public void setAripi(String aripi) {
        this.aripi = aripi;
    }

    public String getCioc() {
        return cioc;
    }

    public void setCioc(String cioc) {
        this.cioc = cioc;
    }

    public String getPene() {
        return pene;
    }

    public void setPene(String pene) {
        this.pene = pene;
    }

    public Boolean getVedereNocturna() {
        return vedereNocturna;
    }

    public void setVedereNocturna(Boolean vedereNocturna) {
        this.vedereNocturna = vedereNocturna;
    }

    public Boolean getZburatoare() {
        return zburatoare;
    }

    public void setZburatoare(Boolean zburatoare) {
        this.zburatoare = zburatoare;
    }
}
