
public class somme_temps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// DŽclarations
		int t, t1, t2, h, h1, h2, mn, mn1, mn2, s, s1, s2, rh;
		
		//DŽbut
		// On saisit le temps 1
		System.out.print(" Donnez le nombre d'heures du Temps 1 : ");
		h1 = Lire.i();
		System.out.print(" Donnez le nombre de minutes du Temps 1 : ");
		mn1 = Lire.i();
		System.out.print(" Donnez le nombre de secondes du Temps 1 : ");
		s1 = Lire.i();
		
		// On saisit le temps 2
		System.out.print(" Donnez le nombre d'heures du Temps 2 : ");
		h2 = Lire.i();
		System.out.print(" Donnez le nombre de minutes du Temps 2 : ");
		mn2 = Lire.i();
		System.out.print(" Donnez le nombre de secondes du Temps 2 : ");
		s2 = Lire.i();
		
		// On convertit le temps 1 en secondes
		t1 = h1*3600 + mn1*60 + s1;
		
		// On convertit le temps 2 en secondes
		t2 = h2*3600 + mn2*60 + s2;
		
		// En additionnant les deux valeurs on obtient un Temps en secondes
		t = t1+t2;
		
		// On met ce temps en forme
		h = t / 3600;
		rh = t % 3600;
		mn = rh / 60;
		s = rh % 60;
		
		System.out.println ("Temps 1 - " +h1 +" : " +mn1 +" : " +s1);
		System.out.println ("Temps 2 - " +h2 +" : " +mn2 +" : " +s2);
		System.out.print ("La somme donne " +h +" : " +mn +" : " +s);

	}

}
