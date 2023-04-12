package steps_Teme;

public class TemaTeste2 {

    public static void main(String... args){

            String adjectiv = "precisa";
            switch (adjectiv) {
                case "preventiva" ->
                    System.out.println("1.să prevină defectele");

                case "optima" ->
                    System.out.println("2.să reducă cantitatea de defecte din producție");

                case "necesara" ->
                    System.out.println
                            ("3.să asigure că defectele din producție nu afectează financiar compania (profitabilitatea)");

                case "utila" ->
                    System.out.println("4.să crească calitatea produsului software");

                case "confirmativa" ->
                    System.out.println("5.să se asigure ca cerințele sunt implementate complet și corect");

                case "precisa" ->
                    System.out.println("6.să valideze că produsul se comportă în concordanță cu scopul acestuia");

                case "indispensabila" ->
                    System.out.println("7.să mențină reputația companiei");

                default ->
                    System.out.println("Testarea este necesara!");

            }
    }
}
