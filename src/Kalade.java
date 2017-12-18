
import java.util.ArrayList;
import java.util.Collections;

public class Kalade {

    private ArrayList<Korta> manoKortos = new ArrayList<>();

    public Kalade() {

        this(1, true);

    }

    public Kalade(int kaladziuSkaicius, boolean sumaisyti) {

        for (int i = 0; i < kaladziuSkaicius; i++) {

            for (int j = 0; j < 4; j++) {

                for (int n = 1; n <= 13; n++) {
                    this.manoKortos.add(new Korta(Zenklas.values()[j], n));
                }

            }
        }

        if (sumaisyti) {
            this.sumaisyti();
        }

    }

    public void sumaisyti() {
        Collections.shuffle(manoKortos);
    }

    public Korta dalintiKitaKorta() {

        Korta k = null;
        if (!manoKortos.isEmpty() && manoKortos.size() > 0) {
            k = manoKortos.get(0);
            manoKortos.remove(0);
            return k;
        }
        System.out.println("Įvyko klaida su kortos dalijimu");
        return null;
    }

}
