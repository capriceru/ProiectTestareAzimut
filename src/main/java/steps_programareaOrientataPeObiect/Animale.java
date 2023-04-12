package steps_programareaOrientataPeObiect;

public class Animale {
    private String nume;
    private String rasa;
    private int picioare;
    private boolean existaCoada;

    //constructor initial
    public Animale() {
        this.nume = "Misha";
        this.rasa = "Siameza";
        this.picioare = 4;
        this.existaCoada = true;
    }


    public Animale(int picioare) {
        this.nume = "Mitzi";
        this.rasa = "Tomberoneza";
        this.picioare = picioare;
        this.existaCoada = true;
    }

//    public Animale(String nume, String rasa, int picioare, boolean existaCoada) {
//        this.nume = nume;
//        this.rasa = rasa;
//        this.picioare = picioare();
//        this.existaCoada = existaCoada();
//    }

    //Setter
    public void setExistaCoada(boolean existaCoada) {
        this.existaCoada = existaCoada;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPicioare(int picioare) {
        this.picioare = picioare;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }


    //Getter
    public String getRasa() {
        return this.rasa;
    }

    public String getNume() {
        return this.rasa;
    }

    public int getPicioare() {
        return this.picioare;
    }

    public boolean getExistaCoada() {
        return this.existaCoada;
    }
}
