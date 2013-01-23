
public class nbre_parfait {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Déclarations
		int nbre; // Le nombre à tester
		int total; // pour faire la somme des diviseurs
		int i; // l'indice de la boucle
		int d; // le résultat de la division
		
		// Début
		total = 1;
		System.out.print ("Indiquer le nombre à tester (supérieur à 1) : ");
		nbre = Lire.i();
		
		for (i=2; i<=(nbre-1); i++) {
			d = nbre % i;
			if (d == 0) total = total + i;
		}
		
		if (total == nbre) {
			System.out.print (nbre +" est un nombre parfait");
		} else {
			System.out.print (nbre +" n'est pas un nombre parfait");
		}

	}

}
