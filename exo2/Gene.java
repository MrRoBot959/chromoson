public class Gene{
    private int valeur;
    Gene(){
        valeur = (int)(Math.random()+0.5);
    }
    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }
}