public class Main {
    public static void main(String[] args) {

         Population pop = new Population(20, 10);
         pop.affichage();
         System.out.println("/n/n");
         Population.croisemet(pop.mychro[0],pop.mychro[9], 14);
         Population.mutation(pop.mychro[2], 5);
         pop.affichage();
    }
}

