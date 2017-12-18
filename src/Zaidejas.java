
import java.util.ArrayList;

public class Zaidejas {

    private String vardas;

    private ArrayList<Korta> ranka = new ArrayList<>();  // kortos rankoje 

    private int kortuSkaicius; //kiek rankoj kortu

    public String getVardas() {
        return vardas;
    }

    public ArrayList<Korta> getRanka() {
        return ranka;
    }

    public int getKortuSkaicius() {
        return kortuSkaicius;
    }

    public Zaidejas(String aVardas) {

        this.vardas = aVardas;

        this.ismestiRanka();

    }

    public void ismestiRanka() {
        ranka.clear();
        this.kortuSkaicius = 0;
    }

    public boolean pridetiKorta(Korta aKorta) {   //jeigu daugiau, nei 21 false

        this.ranka.add(aKorta);
        this.kortuSkaicius++;
        return (this.rankosSuma() <= 21);

    }

    public int rankosSuma() {

        int suma = 0;
        int kortosNr;
        int tuzuSkaicius = 0;

        for (int c = 0; c < this.kortuSkaicius; c++) {

            kortosNr = this.ranka.get(c).gautiSkaiciu();

            if (kortosNr == 1) {  // jeigu tuzas
                tuzuSkaicius++;
                suma += 11;
            } else if (kortosNr > 10) {
                suma += 10;
            } else {
                suma += kortosNr;
            }
        }

        while (suma > 21 && tuzuSkaicius > 0) {

            suma -= 10;
            tuzuSkaicius--;

        }

        return suma;
    }

    public void spausdintiRanka() {

        System.out.printf("%s Kortos:\n", this.vardas);
        for (int c = 0; c < this.kortuSkaicius; c++) {

            System.out.printf("%s\n", this.ranka.get(c).toString());

        }

    }
}
