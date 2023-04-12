package steps_Teme;


public class TemaTeste {

    public static void main(String... args) {


        String text =
                """
                        De ce este testarea necesară?
                        1.să prevină defectele
                        2.să reducă cantitatea de defecte din producție
                        3.să asigure că defectele din producție nu afectează financiar compania (profitabilitatea)
                        4.să crească calitatea produsului software
                        5.să se asigure ca cerințele sunt implementate complet și corect
                        6.să valideze că produsul se comportă în concordanță cu scopul acestuia
                        7.să mențină reputația companiei
                        """;

        System.out.println(text);

        System.out.println("Rezolvare punctul 1");
        if(text.contains("defectele") && text.contains("să") && text.contains("asigure"))
            System.out.println("Contine cuvintele respective");
        else
            System.out.println("Nu contine cel putin unul din cuvintele respective");


        System.out.println();
        System.out.println("Rezolvare punctul 2 si punctul 3");
        System.out.println();

        int nrCaractereTextIntreg = text.length();
        System.out.println("Textul intreg  contine " + nrCaractereTextIntreg + " caractere");

        String[] lines = text.split("\\n");
        System.out.println("Nr linii in text = " + lines.length);

        for (String line : lines) {
            System.out.println("Linie spre evaluare: " + line);
            if (line.startsWith("1") || line.startsWith("3") || line.startsWith("5") || line.startsWith("7")) {
                int countLine = line.length();
                System.out.println("Linia  contine " + countLine + " caractere");
            }
            if (line.startsWith("2") || line.startsWith("4")) {
                int countLine = line.length();
                System.out.println("Linia  contine " + countLine + " caractere");
                float percentage = (float) countLine / (float) nrCaractereTextIntreg * 100;
                System.out.println("Procentul este " + percentage + "%");
            }
            System.out.println();

        }
    }
}
