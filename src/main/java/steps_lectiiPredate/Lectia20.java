package steps_lectiiPredate;

public class Lectia20 {
    public static void main(String[] arg) {

        //-----------------siruri de caractere concat() si length()-------------------------

        String fraza1 = "Ana";
        String fraza2 = "are";
        String fraza3 = "mere";

        System.out.println(fraza1.concat(fraza2).concat(fraza3));
        System.out.println(fraza1+fraza2+fraza3);

        String fraza = fraza1.concat(fraza2).concat(fraza3);
        System.out.println(fraza.length());

        //afisare caractere speciale
        System.out.println("Fraza \\ cu \\ backslash-uri \\");
        System.out.println("Fraza \" cu \" ghilimele \"");


        //----------------- operatori logici -------------------------
        boolean miercuri = true;
        boolean joi = false;
        boolean vineri = true;

        System.out.println(miercuri && (joi || vineri));

        //-----------------structuri conditionale--------------------------------

        //IF
        int x = 2;
        int y = 3;
        if (x>y){
                System.out.println("Este adevarat");
        }
        else {
            System.out.println("Nu este adevarat");
        }


        //IF varianta prescurtata
        String esteAdevarat = x>y ? "Da" : "Nu";
        System.out.println(esteAdevarat);

        //-------------------------------------------------

        int a = 2;
        int b = 3;
        if (a>b){
            System.out.println(a+b);
        }
        else {
            System.out.println(a-b);
        }

        int calcul = a>b ? a+b : a-b;
        System.out.println(calcul);

        System.out.println(a>b ? a+b : a-b);


        //-------------------------------------------------
        //SWITCH
        x = 10;
        int z;
        switch (x) {
            case 1 -> {
                z = 1;
                System.out.println(z);
            }
            case 2 -> {
                z = 2;
                System.out.println(z);
            }
            case 3 -> {
                z = 3;
                System.out.println(z);
            }
            default -> {
                z = 4;
                System.out.println(z);
            }
        }

        String adjectiv = "frumoasa";
        switch(adjectiv){
            case "preventiva" -> {
                System.out.println("să prevină defectele");
            }
            case "calitativa" -> {
                System.out.println("să crească calitatea produsului software");
            }
            default -> {
                System.out.println("Testarea este necesara");
            }
        }
    }
}
