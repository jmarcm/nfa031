
public class course_cycliste_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* D�clarations */
		int N, i, j, numero, rang, mi_course, fin_course, debut_AD;
		String info;
		String [] Nom = new String[5];
		int [][] Dossard = new int [5][5];
		
		int pos, dos, pos_temp, dos_temp;
		
		int num_nom, num_dossard;
		
		/* Initialisations */
		N = 5 ; // nombre de cases du tableau
		fin_course  = 0; // servira � parcourir toutes les cases du tableau pour v�rifier qu'elles soient toutes remplies
		
		/* D�but */
		
		// enregistrement des coureurs
		for (num_nom=0; num_nom <= (N-1); num_nom++) {
			System.out.print ("Donner le nom du coureur : ");
			Nom[num_nom] = Lire.S();
			Dossard[0][num_nom] = num_nom + 1;
		}
		
		// v�rification
		for (i = 0; i <= (N-1); i++) {
			System.out.println ("case : " +i + " // " +"dossard : " +Dossard[0][i] + " : " +Nom[i]);
		}
		
		// enregistrement des infos
		do {
			System.out.print ("Donner le num�ro de dossard : ");
			dos = Lire.i();
			// Comme c'est le premier tour
			num_dossard = dos - 1;
			num_nom = dos -1;
			
				// Test dossard
				if ( (dos >=1) && (dos <= N) && (Dossard [1][num_dossard] == 0)) {
					System.out.print ("Donner l'info pour le coureur " +Dossard[0][num_dossard] +" -- " +Nom[num_nom] +" : "
);
					info = Lire.S();
					
					// Transformation des chaines en entier
					// fonction saisie		
					if (info.equals("A")) {
						pos = -1;
					} else if (info.equals("D")) {
						pos = -2;
					} else {
						pos = Integer.valueOf(info).intValue();
					}
					
					// insertion de la valeur dans le tableau
					Dossard[1][num_dossard] = pos;
					
				} else {
					System.out.println ("Merci de v�rifier vos informations");
				}
				
				
			fin_course ++;
		} while (fin_course <= (N-1));
		
		// v�rification
		System.out.println ("V�rification apr�s la saisie de toutes les infos");
		System.out.println ("--------");
		for (i = 0; i <= (N-1); i++) {
			System.out.println ("case : " +i + " // " +"dossard : " +Dossard[0][i] + " : " +Nom[i] +" r�sultat : " +Dossard[1][i]);
		}
		
		/* D�placement des abandons et des disqualifi�s vers la fin du tableau */
		

	}

}
