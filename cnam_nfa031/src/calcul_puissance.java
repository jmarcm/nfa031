
public class calcul_puissance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// D�clarations
		double a,b;
		double p;
		int i;
		
		// D�but
		System.out.print ("Indiquer le nombre (a) strictement positif : ");
		a = Lire.d();
		System.out.print ("Indiquer le nombre (b) strictement positif : ");
		b = Lire.d();
		
		p = a;
		
		if ((b > 1) && (a > 1)) {
			for (i=1; i<= (b-1); i++) {
				p = p * a;
			}
		}
		
		System.out.print (a +" puissance " +b +" = " +p);

	}

}
