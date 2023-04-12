package steps_Setter_si_Gettere;

public class temaContBancar {



    public static void main(String[] args){



    int cash = 300;
    ContBancar ing = new ContBancar();
    ing.depozitNumerar(cash);


    int bani = 560;
    ContBancar bcr = new ContBancar();
    bcr.setBalanta(300);
    bcr.retragere(bani);

    ContBancar raiffaisen = new ContBancar("RFN0100071345", 200, "Dorel Patesti",
            "dorel.patesti@azimut.ro", "+4078898989");
    raiffaisen.depozitNumerar(150);

    raiffaisen.retragere(220);

        }
}
