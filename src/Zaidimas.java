
import java.util.Scanner;

public class Zaidimas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Kalade naujaKalade = new Kalade(1, true);
        Zaidejas as = new Zaidejas("Zaideju");
        Zaidejas dalintojas = new Zaidejas("Dalintojas");

        as.pridetiKorta(naujaKalade.dalintiKitaKorta());
        dalintojas.pridetiKorta(naujaKalade.dalintiKitaKorta());
        as.pridetiKorta(naujaKalade.dalintiKitaKorta());
        dalintojas.pridetiKorta(naujaKalade.dalintiKitaKorta());

        System.out.println("Kortos padalintos\n");
        as.spausdintiRanka(true);
        dalintojas.spausdintiRanka(false);
        System.out.println("\n");

        boolean asBaigiau = false;
        boolean dalintojasBaige = false;
        String ans;

        while (!asBaigiau || !dalintojasBaige) {

            if (!asBaigiau) {

                System.out.println("Ar imti dar viena korta?(T arba N)");

                ans = sc.next();
                System.out.println();

                if (ans.compareToIgnoreCase("T") == 0) {

                    asBaigiau = !as.pridetiKorta(naujaKalade.dalintiKitaKorta());
                    as.spausdintiRanka(true);
                }
                else if (ans.compareToIgnoreCase("n") == 0) {
                    asBaigiau = true;
                } else {
                    System.out.println("Klaida");
                    System.exit(1);
                }

                System.out.println(as.rankosSuma());
            }

            if (!dalintojasBaige) {
                if (dalintojas.rankosSuma() < 17) {
                    System.out.println("Dalintojas traukia korta\n");
                    dalintojasBaige = !dalintojas.pridetiKorta(naujaKalade.dalintiKitaKorta());
                    dalintojas.spausdintiRanka(false);
                } else {
                    System.out.println("Dalintojas pasiliko");
                    dalintojasBaige = true;
                }
            }
            System.out.println(dalintojas.rankosSuma());
        }

        System.out.println();

        sc.close();

        as.spausdintiRanka(true);
        dalintojas.spausdintiRanka(true);

        int manoSuma = as.rankosSuma();
        int dalintojoSuma = dalintojas.rankosSuma();

        if (manoSuma > dalintojoSuma && manoSuma <= 21 || dalintojoSuma > 21) {
            System.out.println();
            System.out.println("Jus laimejote!");

        } else {
            System.out.println();
            System.out.println("Jus pralaimejote");
        }

    }
}
