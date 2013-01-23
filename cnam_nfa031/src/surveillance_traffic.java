
public class surveillance_traffic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Déclarations
		int v; // Le nombre de véhicules
		int sj; // Le seuil de jour
		int sn; // Le seuil de nuit
		int i;
		int rj; // Le compteur des relevés de la journée
		int rn; // Le compteur des relevés de la nuit
		
		// Début
		rj = 0;
		rn = 0;
		sj = 10;
		sn = 6;
		
		for (i=1; i<=24; i=i+1) {
			System.out.print ("Donner le nombre de véhicules : ");
			v = Lire.i();
			if ((i <= 12) && (v >= sj)) {
				rj +=1;
			}
			if ((i >= 12) && (v >= sn)) {
				rn +=1;
			}
		}
	
		if ((rj >= 5) || (rn >= 3)) {
			System.out.print ("Attention, ce carrefour est dangeureux !!!");
		}

	}

}
