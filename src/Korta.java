
public class Korta {
    
    private Zenklas manoZenklas;
    private int manoSkaicius;     //tuzas = 1 , bartukas-karalius = 11-13

    public Korta(Zenklas aZenklas, int aSkaicius) {
        
        this.manoZenklas = aZenklas;
        
        if (aSkaicius >= 1 && aSkaicius <= 13) {
            this.manoSkaicius = aSkaicius;
        } else {
            System.err.println("Klaida");
            System.exit(1);
        }
        
    }
    
    public int gautiSkaiciu() {
        
        return manoSkaicius;
    }
    
    @Override
    public String toString() {
        
        String numStr = "Klaida";
        
        switch (this.manoSkaicius) {
            
            case 1:
                numStr = "Tuzas";
                break;
            
            case 2:
                numStr = "Dvejetas";
                break;
            
            case 3:
                numStr = "Trejetas";
                break;
            
            case 4:
                numStr = "Ketvertas";
                break;
            
            case 5:
                numStr = "Penketas";
                break;
            
            case 6:
                numStr = "Sesetas";
                break;
            
            case 7:
                numStr = "Septynetas";
                break;
            
            case 8:
                numStr = "Astuonetas";
                break;
            
            case 9:
                numStr = "Devynetas";
                break;
            
            case 10:
                numStr = "Desimt";
                break;
            
            case 11:
                numStr = "Bartukas";
                break;
            case 12:
                numStr = "Karaliene";
                break;
            case 13:
                numStr = "Karalius";
                break;
            
        }
        
        return manoZenklas.toString() + " " + numStr;
        
    }
    
}
