
public class moyennes_classe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Déclarations
		String nom;
		double maths, info, fr;
		double total, coef, moy, moy_classe, smoy, moy_min, moy_max;
		int i;

		// Début
		coef = 3+4+2;
		moy_min = 10;
		moy_max = 0;
		moy_classe = 0;
		smoy = 0;
		moy = 0;
		
		for (i=1; i<= 25; i+=1) {
			System.out.print ("Donner le nom de l'élève : ");
			nom = Lire.S();
			System.out.print ("Donner la note en Maths : ");
			maths = Lire.d();
			System.out.print ("Donner la note en Français : ");
			fr = Lire.d();
			System.out.print ("Donner la note en Informatique : ");
			info = Lire.d();
			
			// Les calculs
			total = (maths*3)+(info*4)+(fr*2);
			moy = total/coef;
			smoy = smoy+moy;
			moy_classe = smoy/i;
			System.out.println ("moy_classe = " +moy_classe);
			
			if (moy_max <= moy) moy_max = moy;
			if (moy_min >= moy) moy_min = moy;
			
			System.out.print ("L'élève " +nom);
			System.out.println (" a une moyenne de : " +moy);

		}
		
		System.out.println ("La moyenne minimale de la classe est : " +moy_min);
		System.out.println ("La moyenne maximale de la classe est : " +moy_max);
		System.out.print ("La moyenne générale de la classe est : " +moy_classe);

	}

}
