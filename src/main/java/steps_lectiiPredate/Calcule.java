package steps_lectiiPredate;

public class Calcule {
    public static void main(String[] args) {

//        // Sa se calculeze suma numerelor 345 si 34.5
//        int x = 345;
//        double y = 34.5;
//        System.out.println(x+y);
//
//
//        String fraza = "Vreau sa devin tester pentru ca";
//        String continuare = "imi place";
//        System.out.println("Vreau sa devin tester pentru ca" + continuare);
//
//
//        System.out.println("Pepeniera.contains('m')");
//        String brazi = "Pepeniera";
//         System.out.print(brazi.contains("m"));
//
//
//      //Demonstrati ca numarul 33 este impar
//        int x2= 33;
//       System.out.println((x2 % 2));
//
//
//        //1 kg de capsuni costa 10 lei, sa se calculeze pretul a 2.5kg
//            double x3 = 10 * 2.5;
//        System.out.println("2,5kg de capsuni costa: " + (10 * 2.5));

        //Pretul unui buchet de flori este 50 de lei, dar pentru 14 februarie scade cu 11%, care va fi pretul final?
//        double buchetPretFinal = 50 - 0.11*50;
//        System.out.println("Buchetele vor costa: " + buchetPretFinal);
//
//
//        String numar1 = "Nume";
//        String numar2 = "Prenume";
//        String numar3 = "Alt nume";
//
//        System.out.println(numar1+numar2+numar3);
//        System.out.println(numar3.length());


//        boolean miercuri = true;
//        boolean joi = false;
//        boolean vineri = true;
//
//        System.out.println(miercuri && (joi || vineri));

//        int x = 2;
//        int y = 3;
//        if (x > y) {
//            System.out.println("Este adevarat");
//            ;
//        }
//        else if (x==y){
//            System.out.println("Varibilele sunt egale");
//        }
//        else {
//            System.out.println("Nu este adevarat");
//        }

//        int a = 10;
//        int b = 20;
//        if(a>b){
//            System.out.println(a+b);
//        }
//            else {
//                System.out.println(a-b);
//        }



//        int x=10;
//        int z;
//        switch (x) {
//            case 1 -> {
//                z = 1;
//                System.out.println(z);
//            }
//            case 2 -> {
//                z = 2;
//                System.out.println(z);
//            }
//            case 3 -> {
//                z = 3;
//                System.out.println(z);
//            }
//            default -> {
//                z = 4;
//                System.out.println(z);
//            }
//        }


//        String ziua = "Sambata";
//        String ziua2;
//        int a = 50;
//        int b = 100;
//
//        switch (ziua) {
//            case "Luni" ->{
//                ziua2 = "Luni";
//                System.out.println("Nu beau cafea, beau maxim Coca Cola");
//            }
//            case "Marti" ->{
//                ziua2 = "Marti";
//                System.out.println(a+b);
//            }
//            case "Miercuri"->{
//                ziua2 = "Miercuri";
//                System.out.println("Curs AZIMUT");
//            }
//            case "Joi" ->{
//                ziua2 = "Joi";
//                System.out.println("Inainte de Weekend");
//            }
//            default ->{
//                ziua2 = "Sambata";
//                System.out.println("Plictiseala!");
//            }
//
//        }

//        int x=2;
//        int y=5;
//        if (x>y) {
//            System.out.println("Numarul maxim este x si are valoarea" + x);
//        }
//        else{
//            System.out.println("Numarul maxim este y si are valoarea" + y);
//        }


        //Vectori
//        int[] numere = new int[3];
//        numere[0] = 20;
//        numere[1] = 21;
//        numere[2] = 22;
//
//        int[] nrDocumente = {453, 456, 77,65};
//        System.out.println(nrDocumente);
//
//        System.out.println(numere[0]);
//        System.out.println(numere[1]);
//        System.out.println(numere[2]);
//
//        String[] caractere = {"Azimut", "Vision"};
//
//        System.out.println(caractere[0]);
//        System.out.println(caractere[1]);


        //Operatii siruri de caractere

//        String sirDeCaractere  = "Acesta este un sir de caractere";
//        System.out.println(sirDeCaractere.charAt(3));
//
//        System.out.println(sirDeCaractere.substring(10));
//        System.out.println(sirDeCaractere.substring(10, 15));
//        System.out.println(sirDeCaractere.length());


        //EXERCITII
//
//        String sirDeCaractere = "Acesta este un sir de caractere";
//        String[] curs = {"Testare", "Manuala", "Automata"};
//        int[] nrDocumente = {453, 456, 77, 65};

//        int i = 0;
//        while (i < 20) {
//            i = i+1;
//            System.out.println(i);
//        }

//        int i = 0;
//        while (sirDeCaractere.length()<=31) {
//            i++;
//            System.out.println(sirDeCaractere.charAt(i));
//        }

//        int i = 0;
//        System.out.println(curs.length);
//        while (curs.length<3) {
//            i++;
//            System.out.println(curs[i]);
//        }


//        int numar = 3;
//        int i = 0;
//        while (numar !=0) {  // 3 != 0 -> true ("!=" inseamna diferit)
//            if (nrDocumente[i] !=77) {  //nrDocumente[0] = 453    i=77     ->true
//                i++; // i= 0+1 = 1
//                System.out.println(nrDocumente[i]); // nrDocumente[1] = 456
//                numar--; //decrementare 3-1 = 2
//            }
//            else break;
//        }


        //EXERCITII 2

        // Se da un sir de numere intregi
//        int[] exercitiulUnu = {34, 67, 45, 3, 10, 2, 90};
//
//        //Sa se determine si sa se afiseze valoarea maxima din acest sir
//        int i=0;
//        int maxim=0;
//        while (i < exercitiulUnu.length) {
//            if (exercitiulUnu[i]>maxim) {
//                maxim = exercitiulUnu[i];
//            }
//            i++;
//        }
//        System.out.println("Valoarea maxima a sirului este: " + maxim);

        int[] exercitiulUnu = {34, 67, 45, 3, 10, 2, 90};

        int maxim = 0;
        for (int i=0; i < exercitiulUnu.length; i++) {
            if (exercitiulUnu[i]>maxim) {
                maxim = exercitiulUnu[i];
            }
        }
        System.out.println("Valoarea maxima a sirului este: " + maxim);

        int minim = exercitiulUnu[0];
        for (int i=0; i < exercitiulUnu.length; i++) {
            if (exercitiulUnu[i]<minim) {
                minim = exercitiulUnu[i];
            }
        }
        System.out.println("Valoarea minima a sirului: " + minim);
    }
}
