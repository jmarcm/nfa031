
public class conversion_franc_euro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// D�clarations
		double m, f, e, t;
		
		// D�but
		t = 6.5596;
		
		System.out.print ("Donnez le montant � convertir : ");
		m = Lire.d();
		 e = m/t;
		 f = m*t;
		 
		 System.out.println ("Le montant " +m +" en Francs vaut " +e +" Euros");
		 System.out.print ("Le montant " +m +" en Euros vaut " +f +" Francs");

	}

}
