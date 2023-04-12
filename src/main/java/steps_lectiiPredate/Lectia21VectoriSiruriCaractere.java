package steps_lectiiPredate;

public class Lectia21VectoriSiruriCaractere {
    public static void main(String[] args) {
        //----------------- VECTORI  INITIALIZARE --------------------------------

        //numere intregi
        int[] numere = {20, 21, 22};

        int[] nrDocumente = {453, 456, 77, 65};
        System.out.println(nrDocumente[3]);

        System.out.println(numere[0]);
        System.out.println(numere[1]);
        System.out.println(numere[2]);

        // siruri de caractere
//        String[] caractere = new String[2];
//        caractere[0] = "Azimut";
//        caractere[1] = "Vision";
        String[] caractere = {"Azimut", "2"};

        System.out.println(caractere[0]);
        System.out.println(caractere[1]);

        String[] curs = {"Testare", "Manuala", "Automata"};
        System.out.println(curs[2]);

        //alte tipuri de date
        boolean[] operatoriLogici = {true, false, true};
        System.out.println(operatoriLogici[2]);

        double[] numereMari = {234.455, 654,67};
        System.out.printf("%.3f", numereMari[1]);

        //----------------- VECTORI  OPERATII --------------------------------

        System.out.println(numere.length);
        System.out.println(curs.length);
        System.out.println(nrDocumente.length);

        //----------------- OPERATII SIRURI CARACTERE  --------------------------------

        String sirDeCaractere = "Acesta este un sir de caractere";
        System.out.println(sirDeCaractere.length());
        System.out.println(sirDeCaractere.charAt(3));

        System.out.println(sirDeCaractere.substring(10));
        System.out.println(sirDeCaractere.substring(10, 15));



        String primavara = "Astazi incepe primavara!";
        // Sa se inlocuiasca aparitia caracterului 'e' cu 'a'.
        System.out.println(primavara.replace('e', 'a'));
        // Sa se inlocuiasca prima aparitie a caracterului “a” cu “e”.
        System.out.println(primavara.replaceFirst("a", "e"));
        // Afisati pozitia caracterului “p”.
        System.out.println(primavara.indexOf("p"));
    }
}