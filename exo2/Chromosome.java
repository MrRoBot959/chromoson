public class  Chromosome{
    Gene[] genes = new Gene[100];
    int taille ;
    Chromosome(int taille){
        this.taille=taille;
        for (int i = 0; i < taille ; i++) {
            
            genes[i]=new Gene();
        }

    }
    public void afficher() {
        for (int i = 0; i < taille; i++) {
            if (this.genes[i]==null) {
                break;
            }
            System.out.print(genes[i].getValeur());
            
            
        }
       
    }

}