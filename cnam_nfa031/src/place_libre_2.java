
public class place_libre_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// D�clarations
		int n,i;
		int max;
		int deb, fin;
		int droite;
		
		
		// D�but
		max = 6;
		deb = 0;
		fin = max-2;
		droite = 0;
		
		int [] T = new int [max];
		System.out.println ("droite = " +droite +" - deb = " +deb +" - fin = " +fin);
		
		System.out.println ("Saisissez les donn�es dans un ordre croissant");
		for (i=0 ; i <= (fin); i++) {
			System.out.print ("Donner le nombre " +(i+1) +" : ");
			T[i] = Lire.i();
		}
		
		// saisie de la valeur � ranger
		System.out.print ("Donner la valeur � ranger : ");
		n = Lire.i();
		
		// recherche de la valeur sup�rieure la plus proche
		// On profite du fait que les valeurs soient class�es
		// tant que la valeur recherch�e est sup�rieure � la case on continue
		deb = 0;
		do {
			deb = deb + 1;
		} while ( (deb <= fin) && (n>= T[deb]) );
		
		// la valeur � ins�rer est � la position deb
		// on d�place les autres valeurs vers la droite
		
		
		for (i=(max-1); i >= (deb+1); i=i-1) {
			T[i] = T[(i-1)];
		}
		T[deb] = n;
		
		
		for (i=0 ; i <= (max-1) ; i++) {
			System.out.print (T[i] +" ");
		}

	}

}
