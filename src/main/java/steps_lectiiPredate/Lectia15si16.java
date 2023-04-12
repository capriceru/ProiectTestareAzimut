package steps_lectiiPredate;

public class Lectia15si16 {
    public static void main(String[] arg){
        String numePisica = "Partz";
        String numeCatel = "Grivei";

        int numarIntreg = 33;
        int numarIntregNegativ = -2;
        double numarCuZecimale = 11.5;
        double numarNegativCuZecimale = -10.5;

        //tiparire in Java
        System.out.println("Exemplu afisare sir de caractere deja scris");

        //afisarea valorii unei variabile
        System.out.println(numeCatel);
        System.out.println(numarCuZecimale);

        //operatii intre variabile
        System.out.println("Operatii intre variabile: ");
        System.out.println(numeCatel == numePisica);
        System.out.println(numeCatel.equals(numePisica));

        System.out.println(numeCatel != numePisica);

        System.out.println(numeCatel.compareTo(numePisica));
        System.out.println(numeCatel.compareToIgnoreCase(numePisica));

        System.out.println(numeCatel.contains("p"));

        //operatii numerice
        System.out.println("Operatii numerice: ");

        System.out.println("Adunarea: ");
        System.out.println(numarIntreg + numarCuZecimale);
        System.out.println(numarIntreg + numarNegativCuZecimale);

        System.out.println("Concatenarea a 2 siruri de caractere: ");
        System.out.println(numeCatel + " este cuminte");
        System.out.println(numePisica + "u");

        System.out.println("Operatii matematice: ");
        System.out.println(numarIntreg - 3);
        System.out.println(numarIntreg - numarCuZecimale);
        System.out.println(numarIntreg - numarIntregNegativ);

        System.out.println(numarIntreg * 2);
        System.out.println(numarIntreg * numarCuZecimale);
        System.out.println(numarIntreg * numarNegativCuZecimale);

        System.out.println(numarIntreg / 11);
        System.out.println(numarIntreg % 2);
        System.out.println(numarIntreg % numarCuZecimale);

        System.out.println("Valoare absoluta: ");
        System.out.println(Math.abs(numarIntreg));
        System.out.println(Math.abs(numarCuZecimale));
        System.out.println(Math.abs(numarIntregNegativ));
        System.out.println(Math.abs(numarNegativCuZecimale));

        System.out.println("Ridicarea la putere ");
        System.out.println(Math.pow(numarIntreg, 2));

        //Tiparirea cu zecimale
        int x= 345;
        double y = 34.5;
        System.out.printf("%.3f",x+y);

        //afisare concatenari
        System.out.println("Concatenare sir de caractere cu o variabila de tip String" + numePisica);
        System.out.println("Concatenare sir de caractere cu o variabila de tip numeric" + numarCuZecimale);
        System.out.println("Concatenare caracter "+"A" + numePisica);

        //concatenari caractere si rezultate operatii
        System.out.println("Concatenare sir de caractere cu o operatie");
        System.out.println("Egalitate? " + (numeCatel == numePisica));
        System.out.println("Ridicarea la patrat: " + (Math.pow(numarCuZecimale, 2)));
        System.out.println("Adunarea simpla:  " + (numarCuZecimale + numarIntreg));
    }
}
