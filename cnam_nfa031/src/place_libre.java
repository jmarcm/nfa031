
public class place_libre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Déclarations
		int n,i;
		int max;
		int deb, fin, milieu;
		int droite;
		boolean egal;
		
		
		// Début
		max = 6;
		deb = 0;
		fin = max-2;
		egal = false;
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
		
		// recherche de la valeur inférieure la plus proche
		do {
			System.out.println ("droite = " +droite +" - deb = " +deb +" - fin = " +fin);
			milieu = (int)((deb + fin) / 2);
			System.out.println ("milieu = " + milieu + " -- " +T[milieu]);
			
			if (n < T[milieu]) {
				// on va à gauche
				fin = milieu - 1;
				droite = 0;
			} else {
				if (n > T[milieu]) {
					// on va à droite
					droite = 1;
					deb = milieu + 1;
				} else {
					egal = true;
					deb = milieu;
				} 
			}
			System.out.println ("++ egal = " +egal +" - droite = " +droite +" - deb = " +deb +" - fin = " +fin);
		} while ((!egal) && (deb <= fin));
		
		// la valeur à insérer est à la position deb
		// on déplace les autres valeurs vers la droite
		
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
