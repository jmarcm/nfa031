
public class moyenne_eleve {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// D�clarations
		double maths, info, fr, total, coef, moy;
		
		// D�but
		System.out.print ("Donner la note en Maths : ");
		maths = Lire.d();
		System.out.print ("Donner la note en Informatique : ");
		info = Lire.d();
		System.out.print ("Donner la note en Fran�ais : ");
		fr = Lire.d();
		
		total = (maths*3) + (info*5) + (fr*2);
		coef = 3+5+2;
		moy = total / coef;
		
		System.out.print("L'�l�ve a une moyenne de : " +moy);

	}

}
