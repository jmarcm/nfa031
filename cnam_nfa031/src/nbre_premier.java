
public class nbre_premier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// D�but
		int nbre; // le nombre � tester
		String test;
		int i;
		int d; // le r�sultat de la division
		
		// Initialisation
		test = " est un nombre premier";
		
		// D�but
		System.out.print ("Indiquer le nombre � tester (sup�rieur � 1) : ");
		nbre = Lire.i();
		
		for (i=2; i<= (nbre-1); i++) {
			d = nbre % i;
			if (d == 0) test = " n'est pas un nombre premier";
		}
		
		System.out.print (nbre +test);
	}

}
