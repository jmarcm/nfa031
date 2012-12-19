
public class affiche_duree_hms {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Déclarations
		int h, m, s, d, rh;
		
		// Début
		System.out.print ("Donnez la durée en secondes : ");
		d = Lire.i();
		
		h = d/3600;
		rh = d - (3600*h);
		m = rh/60;
		s = rh - (60*m);
		
		System.out.print ("La durée est de " +h +" heures : " +m +" minutes : " +s +" secondes");

	}

}
