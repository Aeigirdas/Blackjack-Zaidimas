/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adomas
 */
public class Dalintojas extends Zaidejas {

    public Dalintojas() {
        super("Dalintojas");
    }

    public void spausdintiRanka(Boolean b) {

        System.out.printf("%s Kortos:\n", this.getVardas());
        for (int c = 0; c < this.getKortuSkaicius(); c++) {

            if (super.rankosSuma() == 21 && this.getRanka().get(1).gautiSkaiciu() == 1) { //jeigu dalintojo atversta korta yra tuzas ir antros kortos verte 10
                System.out.printf("%s\n", this.getRanka().get(c).toString());
            } else {
                if (b && c == 0) {

                        System.out.println(" [Paslepta]  ");

                    } else {
                        System.out.printf("%s\n", this.getRanka().get(c).toString());

                    }

                
            }
        }

    }

}
