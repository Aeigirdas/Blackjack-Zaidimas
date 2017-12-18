
import java.util.Scanner;

public class Zaidimas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans;
        do {
            Kalade kalade = new Kalade(1, true);
            Zaidejas as = new Zaidejas("Zaidejo");
            Dalintojas dalintojas = new Dalintojas();
            boolean asBaigiau = false;
            boolean dalintojasBaige = false;

            for (int i = 0; i < 2; i++) {
                as.pridetiKorta(kalade.dalintiKitaKorta());
                dalintojas.pridetiKorta(kalade.dalintiKitaKorta());
            }

            System.out.println("Kortos padalintos\n");
            as.spausdintiRanka();
            System.out.println("Rankos suma: " + as.rankosSuma());
            System.out.println("////////////////////////////");
            dalintojas.spausdintiRanka(true);
            System.out.println("////////////////////////////");
            System.out.println();

            while (!asBaigiau || !dalintojasBaige) {

                if (!asBaigiau) {

                    System.out.println("Ar imti dar viena korta?(T arba N)");

                    ans = sc.next();
                    System.out.println();

                    if (ans.compareToIgnoreCase("T") == 0) {

                        asBaigiau = !as.pridetiKorta(kalade.dalintiKitaKorta());
                        as.spausdintiRanka();
                        System.out.println("////////////////////////////");
                    } else if (ans.compareToIgnoreCase("n") == 0) {
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
                        dalintojasBaige = !dalintojas.pridetiKorta(kalade.dalintiKitaKorta());
                        dalintojas.spausdintiRanka(true);
                    } else {
                        System.out.println("Dalintojas pasiliko");
                        dalintojasBaige = true;
                    }
                }
            }

            System.out.println();
            as.spausdintiRanka();
            System.out.println("Rankos suma: " + as.rankosSuma());
            System.out.println("////////////////////////////");
            dalintojas.spausdintiRanka(false);
            System.out.println("Rankos suma: " + dalintojas.rankosSuma());
            System.out.println("////////////////////////////");

            int manoSuma = as.rankosSuma();
            int dalintojoSuma = dalintojas.rankosSuma();

            if (manoSuma > dalintojoSuma && manoSuma <= 21 || dalintojoSuma > 21) {
                System.out.println();
                System.out.println("Jus laimejote!");

            } else {
                System.out.println();
                System.out.println("Jus pralaimejote");
            }

            System.out.println("Ar norite zaisti dar karta? (T,N)");
            ans = sc.next();
        } while (ans.compareToIgnoreCase("T") == 0);
    }
}
