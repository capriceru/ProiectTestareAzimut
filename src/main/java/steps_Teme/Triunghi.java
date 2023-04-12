package steps_Teme;

public class Triunghi {

    public static boolean EsteDreptunghic(float arie, float l1, float l2, float l3)
    {
        float suprafata = l1 *  l2 /2 ;
        float suprafata2 =  l1 * l3 /2 ;
        float suprafata3 = l2 *  l3 /2 ;
        if(arie ==  suprafata || arie==suprafata2 || arie ==suprafata3)
        {
            System.out.println("Triunghi dreptunghic");
            return true;
        }
        else {
            System.out.println("NU e Triunghi dreptunghic. Mai baga o fisa");
            return false;
        }
    }

    public static boolean EsteEchilateral(float l1, float l2, float l3)
    {
        if(l1==l2 && l2==l3)
        {
            System.out.println("Triunghi echilateral");
            return true;
        }
        else {
            System.out.println("NU e Triunghi echilateral. Mai baga o fisa");
            return false;
        }

    }

    public static void EsteTriunghiOarecare(float arie, float l1, float l2, float l3)
    {
        if (EsteDreptunghic(arie, l1, l2, l3) == false && EsteEchilateral(l1, l2, l3) == false)
            System.out.println("Trhiunghi Oarecare");
    }

    public static void main (String... args) {
        float arie = 6;
        float latura1 = 3;
        float latura2 = 4;
        float latura3 = 5;

        if((EsteEchilateral(latura1, latura2, latura3))==false)
            EsteDreptunghic(arie, latura1, latura2, latura3);

        System.out.println();
        float l1=2;
        float l2=2;
        float l3=7;
        float arie2 = 25;
        if((EsteEchilateral(l1, l2, l3))==false)
            EsteDreptunghic(arie2, l1, l2, l3);

        EsteTriunghiOarecare(arie2, l1, l2, l3);
    }
}
