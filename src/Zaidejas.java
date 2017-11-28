
public class Zaidejas {

    private String vardas;

    private Korta[] ranka = new Korta[10];  // kortos rankoje 

    private int kortuSkaicius; //kiek rankoj kortu

    public Zaidejas(String aVardas) {

        this.vardas = aVardas;

        this.ismestiRanka();

    }

    public void ismestiRanka() {

        for (int c = 0; c < 10; c++) {
            this.ranka[c] = null;

        }
        this.kortuSkaicius = 0;
    }

    public boolean pridetiKorta(Korta aKorta) {   //jeigu daugiau, nei 21 false

        this.ranka[this.kortuSkaicius] = aKorta;
        this.kortuSkaicius++;
        return (this.rankosSuma() <= 21);

    }

    public int rankosSuma() {

        int suma = 0;
        int kortosNr;
        int tuzuSkaicius = 0;

        for (int c = 0; c < this.kortuSkaicius; c++) {

            kortosNr = this.ranka[c].gautiSkaiciu();

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

    public void spausdintiRanka(boolean rodytiPirmaKorta) {

        System.out.printf("%s Kortos:\n", this.vardas);
        for (int c = 0; c < this.kortuSkaicius; c++) {

            if (c == 0 && !rodytiPirmaKorta) {

                System.out.println(" [Paslepta]  ");

            } else {System.out.printf("%s\n", this.ranka[c].toString());

        }

    }

}}
