package steps_programareaOrientataPeObiect;

public class OrientareObiect {
    public static void main(String... args) {

        //Creare obiect nou
        Animale pisica = new Animale();
        pisica.setRasa("Tomberoneza");
        pisica.setNume("numePisica");
        pisica.setExistaCoada(true);
        pisica.setPicioare(4);

//        System.out.println(pisica.getRasa());
//        System.out.println(pisica.getNume());
//        System.out.println(pisica.getPicioare());
//        System.out.println(pisica.getExistaCoada());

        Animale caine = new Animale(3);
        System.out.println(caine.getPicioare());
        System.out.println(caine.getNume());
        System.out.println(caine.getExistaCoada());
        System.out.println(caine.getRasa());
    }
}
