
public class place_libre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// D�clarations
		int n,i;
		int max;
		int deb, fin, milieu;
		int droite;
		boolean egal;
		
		
		// D�but
		max = 6;
		deb = 0;
		fin = max-2;
		egal = false;
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
		
		// recherche de la valeur inf�rieure la plus proche
		do {
			System.out.println ("droite = " +droite +" - deb = " +deb +" - fin = " +fin);
			milieu = (int)((deb + fin) / 2);
			System.out.println ("milieu = " + milieu + " -- " +T[milieu]);
			
			if (n < T[milieu]) {
				// on va � gauche
				fin = milieu - 1;
				droite = 0;
			} else {
				if (n > T[milieu]) {
					// on va � droite
					droite = 1;
					deb = milieu + 1;
				} else {
					egal = true;
					deb = milieu;
				} 
			}
			System.out.println ("++ egal = " +egal +" - droite = " +droite +" - deb = " +deb +" - fin = " +fin);
		} while ((!egal) && (deb <= fin));
		
		// la valeur � ins�rer est � la position deb
		// on d�place les autres valeurs vers la droite
		
		//deb = deb + droite;
		
		for (i=(max-1); i >= (deb+1); i=i-1) {
			T[i] = T[(i-1)];
		}
		T[deb] = n;
		
		
		for (i=0 ; i <= (max-1) ; i++) {
			System.out.print (T[i] +" ");
		}

	}

}
