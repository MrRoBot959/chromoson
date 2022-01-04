public class Population {
    Chromosome[] mychro = new Chromosome[100];
    int nbchro;
    Population(int nbgen , int nbchro){
        this.nbchro=nbchro;
        for (int i = 0; i < nbchro; i++) {
            mychro[i] = new Chromosome(nbgen);
            
        }
    }
    public void affichage() {
        for (int i = 0; i < nbchro  ; i++) {
        
            mychro[i].afficher();
            System.out.print("\n");
        }
        
    }
    public static void mutation(Chromosome chro ,int g) {
        //System.out.println("ok1<"+chro.genes[g].getValeur()+">");
        switch (chro.genes[g].getValeur()) {
            case 0:
                chro.genes[g].setValeur(1);
                break;
        
            case 1:
                chro.genes[g].setValeur(0);
                break;
        }
       
       // System.out.println("ok2<"+chro.genes[g].getValeur()+">");
    }
    public static void croisemet(Chromosome u , Chromosome v , int a) {
        int temp,i;
        for (i = a; v.genes[i]!=null && i<u.genes.length; i++) {
            temp=u.genes[i].getValeur();
            u.genes[i].setValeur(v.genes[i].getValeur());
            v.genes[i].setValeur(temp);
        }
        // if (u.genes[i]!=null) {
        //     for (; i < u.genes.length && u.genes[i]!=null; i++) {
        //         v.genes[i].setValeur(u.genes[i].getValeur());
        //         u.genes[i]=null;
        //     }
        // } 
        // if (v.genes[i]!=null) {
        //     for (; i < u.genes.length && u.genes[i]!=null; i++) {
        //         u.genes[i].setValeur(v.genes[i].getValeur());
        //         v.genes[i]=null;
        //     }
        // }
    }
}
