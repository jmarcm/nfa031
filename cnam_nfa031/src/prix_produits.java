
public class prix_produits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// DŽclarations
		double prix;
		char continuer; /* Pour arrter ou continuer ˆ saisir les prix */
		String produit, produit_min, produit_max;
		double prix_moy, prix_min, prix_max, total;
		int i;
		
		// Initialisations
		total = 0;
		i = 0;
		continuer ='O';
		prix_max = 0;
		prix_min = 0;
		produit_min = "";
		produit_max = "";
		
		// DŽbut
		do {
			System.out.print ("Indiquer le nom du produit : ");
			produit = Lire.S();
			System.out.print ("Indiquer le prix du produit : ");
			prix = Lire.d();
			
			total = total + prix;
			i +=1;
			
			if (i == 1) {
				prix_min = prix;
				produit_min = produit;
			}
			
			if (prix > prix_max) {
				prix_max = prix;
				produit_max = produit;
			}
			
			if (prix < prix_min) {
				prix_min = prix;
				produit_min = produit;
			}
			
			System.out.print ("Voulez-vous indiquer un autre prix? (O pour oui, N pour non)");
			continuer = Lire.c();
		} while (continuer == 'O');
		
		prix_moy = total / i;
		
		System.out.println ("Vous avez indiquŽ le prix de " +i +" articles");
		System.out.println ("Le prix moyen est : " +prix_moy);
		System.out.println ("Le produit le moins cher est " +produit_min +" pour un montant de : " +prix_min +"Û");
		System.out.println ("Le produit le plus cher est " +produit_max +" pour un montant de : " +prix_max +"Û");

	}

}
