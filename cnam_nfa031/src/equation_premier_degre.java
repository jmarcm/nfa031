
public class equation_premier_degre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Déclarations
		double a,x,b ;
		
		// Début
		System.out.print ("Donnez la valeur de a : ");
		a = Lire.d();
		System.out.print ("Donnez la valeur de b : ");
		b = Lire.d();
		
		if (a !=0) {
			x = -b/a;
			System.out.print ("L'équation admet une solution unique: x = " +x);
		}else {
			if (b == 0) {
				System.out.print ("Il n'y a pas de solution");
			}else{
				System.out.print ("L'équation admet tout nombre réel comme solution");
			}
		}
		

	}

}
