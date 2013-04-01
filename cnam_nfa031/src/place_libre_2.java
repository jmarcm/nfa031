
public class place_libre_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Déclarations
		int n,i;
		int max;
		int deb, fin;
		int droite;
		
		
		// Début
		max = 6;
		deb = 0;
		fin = max-2;
		droite = 0;
		
		int [] T = new int [max];
		System.out.println ("droite = " +droite +" - deb = " +deb +" - fin = " +fin);
		
		System.out.println ("Saisissez les données dans un ordre croissant");
		for (i=0 ; i <= (fin); i++) {
			System.out.print ("Donner le nombre " +(i+1) +" : ");
			T[i] = Lire.i();
		}
		
		// saisie de la valeur à ranger
		System.out.print ("Donner la valeur à ranger : ");
		n = Lire.i();
		
		// recherche de la valeur supérieure la plus proche
		// On profite du fait que les valeurs soient classées
		// tant que la valeur recherchée est supérieure à la case on continue
		deb = 0;
		do {
			deb = deb + 1;
		} while ( (deb <= fin) && (n>= T[deb]) );
		
		// la valeur à insérer est à la position deb
		// on déplace les autres valeurs vers la droite
		
		
		for (i=(max-1); i >= (deb+1); i=i-1) {
			T[i] = T[(i-1)];
		}
		T[deb] = n;
		
		
		for (i=0 ; i <= (max-1) ; i++) {
			System.out.print (T[i] +" ");
		}

	}

}
