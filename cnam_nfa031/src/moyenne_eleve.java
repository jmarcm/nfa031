
public class moyenne_eleve {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Déclarations
		double maths, info, fr, total, coef, moy;
		
		// Début
		System.out.print ("Donner la note en Maths : ");
		maths = Lire.d();
		System.out.print ("Donner la note en Informatique : ");
		info = Lire.d();
		System.out.print ("Donner la note en Français : ");
		fr = Lire.d();
		
		total = (maths*3) + (info*5) + (fr*2);
		coef = 3+5+2;
		moy = total / coef;
		
		System.out.print("L'élève a une moyenne de : " +moy);

	}

}
