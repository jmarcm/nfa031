
public class retrait_argent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// D�clarations
		double s, r, ns;
		String non;
		
		non = "D�sol�, votre solde ne permet pas de faire de retrait!";
		
		System.out.print ("Indiquez le solde : ");
		s = Lire.d();
		
		if (s <= 0) {
			System.out.print(non);
		}else {
			System.out.print("Indiquez le montant du retrait :");
			r = Lire.d();
			ns = s-r;
			if (ns >= 0) {
				System.out.print("Votre demande a �t� accept�e, votre nouveau solde est de : " +ns +"�");
			}else {
				System.out.print(non);
			}
		}

	}

}
