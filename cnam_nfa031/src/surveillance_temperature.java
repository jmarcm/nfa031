
public class surveillance_temperature {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// D�clarations
		int i; // Pour faire avancer la boucle par pas de 2(heures
		int n; // Le nombre de prises
		double t; // La temp�rature relev�e
		double tm; // La temp�rature moyenne
		double st; // La somme des temp�r�ratures
		double e; // L'�cart par rapport � la temp�rature normale
		
		// D�but
		st = 0;
		n = 1;
		for (i=0; i <=24; i=i+2) {
			System.out.println ("Il est " +i +"h, prenez la temp�rature du malade");
			System.out.print ("Indiquez la temp�rature du malade : ");
			t = Lire.d();
			
			st = st+t;
			tm = st/n;
			e = tm-37;
			
			System.out.print ("Apr�s " +i +" heures de surveillance ");
			System.out.println ("la temp�rature moyenne du malade est de : " +tm +"�");
			System.out.println ("L'�cart est de : " +e);
			
			n+=1;
			System.out.println (n);
		}
		
	}

}
