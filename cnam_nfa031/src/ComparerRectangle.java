
public class ComparerRectangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RECTANGLE A = new RECTANGLE();
		RECTANGLE B = new RECTANGLE();
		String pmax, smax;
		pmax = 0;
		smax = 0;
	
	
		if (A.p > B.p) pmax = A.nom;
		if (A.p < B.p) {
			pmax = B.nom;
		} else {
			System.out.println ("Les 2 rectangles " +A.nom +" et " +B.nom +" ont le même périmètre");
		}
		System.out.println ("Le rectangle " +pmax +" a le plus grand périmètre");
		// revoir le commentaire que le prof avait fait sur le test
		
		if (A.s > B.s) {
			smax = A.nom;
			System.out.println ("Le rectangle " +A.nom +" a la plus grande surface");
		}
		if (A.s < B.s) {
			smax = B.nom;
			System.out.println ("Le rectangle " +B.nom +" a la plus grande surface");
		} else {
			System.out.println ("Les 2 rectangles " +A.nom +" et " +B.nom +" ont la mème surface");
		}
		
		/*
			Un rectangle qui a le plus grand périmètre a aussi la plus grande surface
			-> on compare les noms des rectangles
				- si c'est le même nom alors OUI celui qui le plus grand périmètre a aussi la plus grande surface
				- si ce n'est pas le même nom alors NON
				- s'ils ont le même périmètre ou la même surface
		*/
		if (pmax == smax) {
			System.out.print ("OUI le rectangle " +pmax + " qui le plus grand périmètre a aussi la plus grande surface");
		} else {
			System.out.print ("NON, le rectangle " +pmax + " qui le plus grand périmètre n'a pas la plus grande surface");
		}
	}

}
