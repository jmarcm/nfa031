
public class surveillance_temperature {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Déclarations
		int i; // Pour faire avancer la boucle par pas de 2(heures
		int n; // Le nombre de prises
		double t; // La température relevée
		double tm; // La température moyenne
		double st; // La somme des tempérératures
		double e; // L'écart par rapport à la température normale
		
		// Début
		st = 0;
		n = 1;
		for (i=0; i <=24; i=i+2) {
			System.out.println ("Il est " +i +"h, prenez la température du malade");
			System.out.print ("Indiquez la température du malade : ");
			t = Lire.d();
			
			st = st+t;
			tm = st/n;
			e = tm-37;
			
			System.out.print ("Après " +i +" heures de surveillance ");
			System.out.println ("la température moyenne du malade est de : " +tm +"°");
			System.out.println ("L'écart est de : " +e);
			
			n+=1;
			System.out.println (n);
		}
		
	}

}
