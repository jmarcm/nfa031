
public class affiche_duree_hms {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// D�clarations
		int h, m, s, d, rh;
		
		// D�but
		System.out.print ("Donnez la dur�e en secondes : ");
		d = Lire.i();
		
		h = d/3600;
		rh = d - (3600*h);
		m = rh/60;
		s = rh - (60*m);
		
		System.out.print ("La dur�e est de " +h +" heures : " +m +" minutes : " +s +" secondes");

	}

}
