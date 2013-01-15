
public class equation_second_degre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Déclarations
		double a, x1, x2, b, c, D, R;
		
		// Début
		System.out.print("Donner la valeur de a :");
		a = Lire.d();
		System.out.print("Donner la valeur de b :");
		b = Lire.d();
		System.out.print("Donner la valeur de c :");
		c = Lire.d();
		
		D = b*b-4*a*c;
		
		if(D == 0) {
			x1 = -b/(2*a);
			System.out.print ("L'équation admet comme solution la racine dite double : " +x1);
		}
		if (D>0) {
			R = Math.sqrt(D);
			x1 = (-b+R)/(2*a);
			x2 = (-b-R)/(2*a);
			System.out.println("L'équation admet comme solutions deux racines distinctes : " +x1 +" et " +x2);
		}else{
			System.out.println("L'équation n'admet pas de racine réelle");
		}

	}

}
