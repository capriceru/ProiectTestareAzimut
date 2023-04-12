package steps_clase_cu_super;

public class Caine extends Animale{
    private String culoareOchi;
    private String tipBlana;
    private int picioare;
    private boolean areCoada;

    public Caine(String nume, String rasa, int varsta, String culoare, int greutate, int lungime, String culoareOchi,
                 String tipBlana, int picioare, boolean areCoada) {
        super(nume, rasa, varsta, culoare, greutate, lungime);
        this.culoareOchi = culoareOchi;
        this.tipBlana = tipBlana;
        this.picioare = picioare;
        this.areCoada = areCoada;
    }

    @Override
    public void comunicare() {
        printStr(getNume()+" latra!");
    }

    public String getCuloareOchi() {
        return culoareOchi;
    }

    public void setCuloareOchi(String culoareOchi) {
        this.culoareOchi = culoareOchi;
    }

    public String getTipBlana() {
        return tipBlana;
    }

    public void setTipBlana(String tipBlana) {
        this.tipBlana = tipBlana;
    }

    public int getPicioare() {
        return picioare;
    }

    public void setPicioare(int picioare) {
        this.picioare = picioare;
    }

    public boolean isAreCoada() {
        return areCoada;
    }

    public void setAreCoada(boolean areCoada) {
        this.areCoada = areCoada;
    }
}
