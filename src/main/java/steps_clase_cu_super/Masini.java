package steps_clase_cu_super;

public class Masini {

    private String marca;
    private String culoare;
    private String tipMotor;
    private int roti;
    private int locuri;
    private String plafon;
    private Boolean areAsigurare;
    private String cutieViteze;
    private int numarTrepteViteza;
    private int vechime;



    public Masini(String marca, String culoare, String tip, int roti, int locuri, String plafon, Boolean areAsigurare, String cutieViteze, int numarTrepteViteza, int vechime){
        this.marca = marca;
        this.culoare = culoare;
        this.tipMotor = tip;
        this.roti = roti;
        this.locuri = locuri;
        this.plafon = plafon;
        this.areAsigurare = areAsigurare;
        this.cutieViteze = cutieViteze;
        this.numarTrepteViteza = numarTrepteViteza;
        if (vechime>=0){
            this.vechime = vechime;}
        else System.out.println("anul introdus este incompatibil");
    }


    public void setPlafon(String plafon) {
        if (plafon.equalsIgnoreCase("panoramic") || plafon.equalsIgnoreCase("trapa")){
            this.plafon = plafon;
        }
        else this.plafon = "clasic";
    }


    public String getMarca() {
        return marca;
    }

    public String getCuloare() {
        return culoare;
    }

    public String getTipMotor() {
        return tipMotor;
    }

    public int getRoti() {
        return roti;
    }

    public int getLocuri() {
        return locuri;
    }

    public String getPlafon() {
        return plafon;
    }

    public Boolean getAreAsigurare() {
        return areAsigurare;
    }

    public void setCutieViteze(String cutieViteze) {
        if (this.cutieViteze.equalsIgnoreCase(" manuala")){
            this.numarTrepteViteza=6;
        }
        else if (this.cutieViteze.equalsIgnoreCase(" automata")){
            this.numarTrepteViteza=8;
        }
        else System.out.println(getMarca()+" este caruta");
    }

    public void itp(){
        if(this.vechime <=3){
            System.out.println(getMarca()+" efectueaza ITP-ul la 3 ani de la data inmatricularii.");
        }
        else if (this.vechime >3 && this.vechime <12){
            System.out.println(getMarca()+ " efectueaza ITP-ul la 2 ani.");
        }
        else System.out.println(getMarca()+" efectueaza ITP-ul in fiecare an");
    }

    public String getCutieViteze() {
        return cutieViteze;
    }

    public int getNumarTrepteViteza() {
        return numarTrepteViteza;
    }
}
