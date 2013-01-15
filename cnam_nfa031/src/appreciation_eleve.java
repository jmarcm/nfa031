
public class appreciation_eleve {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Déclarations
		double maths, info, fr, total, coef, moy;
		String comment = null;
		
		// Début
		System.out.print ("Donner la note en Maths : ");
		maths = Lire.d();
		System.out.print ("Donner la note en Informatique : ");
		info = Lire.d();
		System.out.print ("Donner la note en Français : ");
		fr = Lire.d();
		
		total = (maths*3)+(info*4)+(fr*2);
		coef = 3+4+2;
		moy = total/coef;
		
		if (moy <= 5) comment = "et doit s'améliorer.";
		if ((moy > 5) && (moy <= 10)) comment = "et peut mieux faire";
		if ((moy > 10) && (moy <= 15)) comment = "et a de bons résultats";
		if ((moy > 10) && (moy <= 20)) comment = "et a d'excellents résultats";
		
		System.out.print ("L'élève a une moyenne de : " +moy +" " +comment);

	}

}
