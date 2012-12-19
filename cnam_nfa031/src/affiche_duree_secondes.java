
public class affiche_duree_secondes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declarations
		int h ,m ,s,d;
		
		// Début
		System.out.print ("Donner le nombre d'heures : ");
		h = Lire.i();
		System.out.print ("Donner le nombre de minutes : ");
		m = Lire.i();
		System.out.print ("Donner le nombre de secondes : ");
		s = Lire.i();
		
		d = 3600*h+60*m+s;
		
		System.out.print ("La durée en secondes est : " +d);

	}

}
