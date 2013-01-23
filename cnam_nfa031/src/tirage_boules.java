
public class tirage_boules {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// DŽclarations
		char couleur; // La couleur de la boule
		int i; // Pour le nombre de tirages
		int points, total;
		
		// DŽbut
		total = 0;
		points = 0;
		
		for (i=1; i <= 10; i=i+1) {
			System.out.println ("Prenez une boule");
			System.out.print ("Indiquez la couleur de la boule - R pour rouge, B pour bleue, N pour noire ou L pour blanche : ");
			couleur = Lire.c();
			
			switch (couleur)
			{
			case 'R':
				points = 3;
				break;
			case 'B':
				points = 2;
				break;
			case 'N':
				points = -1;
				break;
			case 'L':
				points = 0;
				break;
			default:
				System.out.println ("DŽsolŽ votre choix n'a pas ŽtŽ reconnu");
			}
			total = total + points;
		}
		System.out.print ("La partie est terminŽe, vous avez " +total +" points");

	}

}
