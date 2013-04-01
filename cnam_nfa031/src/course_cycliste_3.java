
public class course_cycliste_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* D�clarations */
		int N, i, fin_course, debut_AD;
		int k, l; // indices pour le tri par bulle
		int num_abandon, num_disq;
		String info;
		boolean dos_saisi;
		String [] Nom = new String[5];
		int [][] Dossard = new int [4][5];
		
		int pos, dos, pos_temp, dos_temp;
		
		int num_nom, num_dossard;
		
		/* Initialisations */
		N = 5 ; // nombre de cases du tableau
		fin_course  = 0; // servira � parcourir toutes les cases du tableau pour v�rifier qu'elles soient toutes remplies
		// on positionne le compteur debut_AD
		debut_AD = (N-1); // pour qu'on garde la derni�re valeur au cours de la boucle
		num_abandon = 0;
		num_disq = 0;
		
		/* D�but */
		
		// enregistrement des coureurs
		for (num_nom=0; num_nom <= (N-1); num_nom++) {
			System.out.print ("Donner le nom du coureur : ");
			Nom[num_nom] = Lire.S();
			//Dossard[0][num_nom] = num_nom + 1;
		}
		
		// v�rification
		for (i = 0; i <= (N-1); i++) {
			System.out.println ("case : " +i + " // " +"dossard : " +(i + 1) + " : " +Nom[i]);
		}
		
		// enregistrement des infos
		do {
			System.out.print ("Donner le num�ro de dossard : ");
			dos = Lire.i();
			
			num_dossard = dos - 1;
			num_nom = dos -1;
			
				// Le dossard est-il dans les limites?
				if ( (dos >=1) && (dos <= N) ) {
					dos_saisi = false;
					
					// Le dossard existe-il dans le tableau?	
					for (i = 0 ; i <= fin_course; i++) {
							if ( Dossard[0][i] == dos ) dos_saisi = true;
						}
					
					if (dos_saisi == true) {
							System.out.print ("Vous avez d�j� entr� une information pour ce coureur !");
					} else {
						System.out.print ("Donner l'info pour le coureur " +Dossard[0][num_dossard] +" -- " +Nom[num_nom] +" : "
);
						info = Lire.S();
						
						// on traite l'information
						if ( info.equals("A") || info.equals("a") ) {
							Dossard[2][num_abandon] = dos;
							num_abandon++;
						} else if ( info.equals("D") || info.equals("d") ) {
							Dossard[3][num_disq] = dos;
							num_disq++;
						} else {
							pos = Integer.valueOf(info).intValue();
							Dossard[0][(pos - 1)] = dos;
						}	
					}
				} else {
					System.out.println ("Merci de v�rifier vos informations");
				}
			
			// v�rification
			System.out.println ("");
			System.out.println ("--------");
			System.out.println ("V�rification dans la boucle");
			System.out.println ("--------");
			for (i = 0; i <= (N-1); i++) {
					// Pour r�cup�rer le nom
					// on prend le num�ro de dossard : Dossard[0][i]
					// on lui enl�ve 1 : (Dossard[0][i]-1)
				if ( Dossard[0][i] != 0 ) {
					System.out.println ( "case : " +i + " // " +"dossard : " +Dossard[0][i] +" " +Nom[(Dossard[0][i]) - 1]);
				}
			}
			
			fin_course ++;
			
		} while (fin_course <= (N-1));
		
		
		
			/* D�placement des abandons et des disqualifi�s vers la fin du tableau 
			
			
			if (Dossard[1][debut_AD] <= 0) debut_AD = debut_AD - 1 ;
			for (i = 0; i <= debut_AD; i++) {
				if (Dossard [1][i] <= 0) {
					dos_temp = Dossard[0][i];
					pos_temp = Dossard[1][i];
					Dossard[0][i] = Dossard[0][debut_AD];
					Dossard[1][i] = Dossard[1][debut_AD];
					Dossard[0][debut_AD] = dos_temp;
					Dossard[1][debut_AD] = pos_temp;
				}
			}
		
		// v�rification
		System.out.println ("");
		System.out.println ("--------");
		System.out.println ("V�rification apr�s le d�placement des abandons");
		System.out.println ("--------");
		for (i = 0; i <= (N-1); i++) {
			System.out.println ("case : " +i + " // " +"dossard : " +Dossard[0][i] + " : " +Nom[i] +" r�sultat : " +Dossard[1][i]);
		}
		*/
		
		/* Classement des coureurs 
		// on utilisera la m�thode du tri par bulle
		for (k = 0 ; k <= (debut_AD-2); k++) {
			for (l = 0 ; l <= (debut_AD-2); l++) {
				if (Dossard[1][l] > Dossard[1][(l+1)]) {
					dos_temp = Dossard[0][l];
					pos_temp = Dossard[1][l];
					Dossard[0][l] = Dossard[0][(l+1)];
					Dossard[1][l] = Dossard[1][(l+1)];
					Dossard[0][(l+1)] = dos_temp;
					Dossard[1][(l+1)] = pos_temp;
				}
			}
		}
		*/
		
		// v�rification
		System.out.println ("");
		System.out.println ("--------");
		System.out.println ("V�rification apr�s le classement g�n�ral");
		System.out.println ("--------");
		for (i = 0; i <= (N-1); i++) {
				// Pour r�cup�rer le nom
				// on prend le num�ro de dossard : Dossard[0][i]
				// on lui enl�ve 1 : (Dossard[0][i]-1)
			System.out.println ( "case : " +i + " // " +"dossard : " +Dossard[0][i] );
		}
		
		

	}

}
