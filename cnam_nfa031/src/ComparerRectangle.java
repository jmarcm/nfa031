
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
			System.out.println ("Les 2 rectangles " +A.nom +" et " +B.nom +" ont le m�me p�rim�tre");
		}
		System.out.println ("Le rectangle " +pmax +" a le plus grand p�rim�tre");
		// revoir le commentaire que le prof avait fait sur le test
		
		if (A.s > B.s) {
			smax = A.nom;
			System.out.println ("Le rectangle " +A.nom +" a la plus grande surface");
		}
		if (A.s < B.s) {
			smax = B.nom;
			System.out.println ("Le rectangle " +B.nom +" a la plus grande surface");
		} else {
			System.out.println ("Les 2 rectangles " +A.nom +" et " +B.nom +" ont la m�me surface");
		}
		
		/*
			Un rectangle qui a le plus grand p�rim�tre a aussi la plus grande surface
			-> on compare les noms des rectangles
				- si c'est le m�me nom alors OUI celui qui le plus grand p�rim�tre a aussi la plus grande surface
				- si ce n'est pas le m�me nom alors NON
				- s'ils ont le m�me p�rim�tre ou la m�me surface
		*/
		if (pmax == smax) {
			System.out.print ("OUI le rectangle " +pmax + " qui le plus grand p�rim�tre a aussi la plus grande surface");
		} else {
			System.out.print ("NON, le rectangle " +pmax + " qui le plus grand p�rim�tre n'a pas la plus grande surface");
		}
	}

}
