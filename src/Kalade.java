
import java.util.Random;

public class Kalade {

    private Korta[] manoKortos;
    private int kortuSkaicius;        //kiek kortu like kaladej

    public Kalade(){
    
    this(1,true);
    
    }
    
    public Kalade(int kaladziuSkaicius, boolean sumaisyti) {

        this.kortuSkaicius = kaladziuSkaicius * 52;
        this.manoKortos = new Korta[this.kortuSkaicius];

        int c = 0; //indeksavimui 

        for (int i = 0; i < kaladziuSkaicius; i++) {

            for (int j = 0; j < 4; j++) {

                for (int n = 1; n <= 13; n++) {

                    this.manoKortos[c] = new Korta(Zenklas.values()[j], n);
                    c++;

                }

            }
    }
        
                  if(sumaisyti) {this.sumaisyti();}
        
        
    }
    
    public void sumaisyti(){
    
    Random rng = new Random();
    
    Korta laikina;
    int b;
    
    for( int i =0; i < this.kortuSkaicius; i++){
    
    b = rng.nextInt(this.kortuSkaicius);
        
    laikina = this.manoKortos[i];
    this.manoKortos[i] = this.manoKortos[b];
    this.manoKortos[b] = laikina;
    
    }
    
        }   
    
    public Korta dalintiKitaKorta(){
    
    Korta virsutine = this.manoKortos[0];
    
    
    for (int c = 1; c < this.kortuSkaicius; c++){
    
    this.manoKortos[c-1] = this.manoKortos[c];
    }
    this.manoKortos[this.kortuSkaicius-1] = null;
    this.kortuSkaicius--;
    
    return virsutine;
    
    
    }
    
    
    
    
    
    
    
}
