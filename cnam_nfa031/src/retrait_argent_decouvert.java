
public class retrait_argent_decouvert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Déclarations
		double s, r, ns, d;
		String non;
		
		// Initialisation
		non = "Désolé, votre solde ne permet pas de faire de retrait !";
		
		System.out.print ("Donnez le solde : ");
		s = Lire.d();
		System.out.print ("Donnez le montant du découvert : ");
		d = Lire.d();
		
		if (s <= d) {
			System.out.print (non);
		} else {
			System.out.print ("Donnez le montant du retrait : ");
			r = Lire.d();
			ns = s-r;
			
			System.out.print ("Le nouveau solde, ns est = " +ns);
			
			if (ns >= -d) {
				System.out.print ("Votre demande a été acceptée, votre nouveau solde est de : " +ns +"€");
			} else {
				System.out.print (non);
			}
		}
	}

}
