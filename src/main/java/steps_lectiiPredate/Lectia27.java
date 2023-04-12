package steps_lectiiPredate;

public class Lectia27 {

    public static void tiparireInt(int tiparireNumar) {
        System.out.println(tiparireNumar);
    }

    public static int maxim(int[] multimeNumere) {
        int numarMaxim = 0;
        for (int i = 0; 1 < multimeNumere.length; i++) {
            if (multimeNumere[i] > numarMaxim) {
                numarMaxim = multimeNumere[i];
            }
        }
        tiparireInt(numarMaxim);
        return numarMaxim;
    }

    public static void main(String[] args) {
        int[] exercitiulUnu = {34, 67, 45, 3, 10, 2, 90};

        maxim(exercitiulUnu);
    }
}





//
//                //static nu returneaza nimic
//        public static void main(String[] args) {
