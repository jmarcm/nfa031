
public class retrait_argent_variante {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// DŽclarations
		double s, r, ns;
		
		// DŽbut
		System.out.print ("Donnez le solde");
		s = Lire.d();
		System.out.print ("Donnez le montant du retrait");
		r = Lire.d();
		
		ns = s-r;
		
		if ((s <= 0) || (ns <= 0)) {
			System.out.print ("DŽsolŽ nous ne pouvons donner suite ˆ votre demande");
		} else {
			System.out.print ("Votre demande a ŽtŽ acceptŽ, votre nouveau solde est de :" +ns +"Û");
		}

	}

}
