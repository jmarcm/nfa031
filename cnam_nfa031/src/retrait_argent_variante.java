
public class retrait_argent_variante {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// D�clarations
		double s, r, ns;
		
		// D�but
		System.out.print ("Donnez le solde");
		s = Lire.d();
		System.out.print ("Donnez le montant du retrait");
		r = Lire.d();
		
		ns = s-r;
		
		if ((s <= 0) || (ns <= 0)) {
			System.out.print ("D�sol� nous ne pouvons donner suite � votre demande");
		} else {
			System.out.print ("Votre demande a �t� accept�, votre nouveau solde est de :" +ns +"�");
		}

	}

}
