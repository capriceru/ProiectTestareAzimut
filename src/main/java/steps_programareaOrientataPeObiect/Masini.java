package steps_programareaOrientataPeObiect;

public class Masini {
    private String marca;
    private String culoare;
    private String tip;
    private int roti;
    private int locuri;
    private boolean plafon;

    //Getter
    public String getMarca() {
        return marca;
    }

    public String getCuloare() {
        return culoare;
    }

    public String getTip() {
        return tip;
    }

    public int getRoti() {
        return roti;
    }

    public int getLocuri() {
        return locuri;
    }

    public boolean isPlafon() {
        return plafon;
    }

    //Setter

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public void setRoti(int roti) {
        this.roti = roti;
    }

    public void setLocuri(int locuri) {
        this.locuri = locuri;
    }

    public void setPlafon(boolean plafon) {
        this.plafon = plafon;
    }
}

