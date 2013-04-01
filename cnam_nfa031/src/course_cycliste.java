
public class course_cycliste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// DŽclarations
				int N, i, j, numero, rang, mi_course, fin_course, debut_AD;
				String info;
				String [] Nom = new String[5];
				int [][] Dossard = new int [5][5];
				
				int pos, dos, pos_temp, dos_temp;
				
				
				// DŽbut
				
				// Initialisation
				N = 5;
				fin_course = 1;
				debut_AD = N-1;
				
				/* enregistrement des coureurs */
				for (i=0; i <= (N-1); i++) {
					System.out.print ("Donner le nom du coureur : ");
					Nom[i] = Lire.S();
					Dossard[0][i] = i+1;
				}
				
				/* vŽrification */
				for (i=0 ; i<= (N-1); i++) {
					numero = Dossard[0][i];
					dos = numero + 1;
					pos = Dossard[1][i];
					System.out.println (dos +" - " + Nom[i] +" -- " +pos);
				}
				
				do {
					System.out.print ("Donner le numŽro de dossard :");
					dos = Lire.i();
					numero = dos-1;
					
					
					// Test dossard			
					if ( (dos >= 1) && (dos <= N)  ) {
						System.out.println ("Dossard : " + dos +" - " +Nom[numero]);
						System.out.println ("NumŽro : " +numero);
						System.out.println ("fin_course" +fin_course);
						System.out.print ("Donner l'info : ");
						info = Lire.S();
						
						//System.out.println (info);
						
						// fonction saisie
						
						
						if (info.equals("A")) {
							pos = -1;
						} else if (info.equals("D")) {
							pos = -2;
						} else {
							pos = Integer.valueOf(info).intValue();
						}
						
						Dossard[1][numero] = pos;
						// fin fonction saisie
						
						System.out.println ("Vous avez dŽclarŽ une position : " +pos) ;
						fin_course++;
						
						//System.out.println ("ok");
					} else {
						System.out.println ("Merci de vŽrifier le numŽro de dossard");
					}
					
					/* vŽrification 
					for (i=0 ; i<= (N-1); i++) {
						numero = Dossard[0][i];
						dos = numero + 1;
						pos = Dossard[1][i];
						System.out.println (dos +" - " + Nom[i] +" -- " +pos);
					}*/
					System.out.println(N);
					for (i=0 ; i <= (N-1); i++) {
						rang = Dossard[0][i]-1;
						dos = Dossard[0][i];
						System.out.println (dos +" : " +Nom[rang] +" -- " +Dossard[1][i]);
						System.out.println (Dossard[0][i]);
					}
					
					//System.out.println ("fin_course = " +fin_course);
				
				
				
				/* DŽplacement des Abandons des des disqualifiŽs vers la fin du tableau */
				
				System.out.println ("debut_AD au dŽbut de la boucle = " +debut_AD);
				
				if (Dossard[1][debut_AD] < 0) debut_AD = debut_AD - 1;
				
				System.out.println ("correction = " +debut_AD);
				
				for (i=0; i <= (debut_AD) ; i++) {
					if ( Dossard[1][i] < 0 ) {
						System.out.println ("N¡ <=> i = " +i);
						System.out.println ("debut_AD = " +debut_AD);
						dos_temp = Dossard[0][debut_AD];
						pos_temp = Dossard[1][debut_AD];
						
						System.out.println ("dos_temp = " + Dossard[0][debut_AD] +" - " +Nom[debut_AD]);
						System.out.println ("pos_temp = " + Dossard[1][debut_AD]);
						
						Dossard[0][debut_AD] = Dossard[0][i];
						Dossard[1][debut_AD] = Dossard[1][i];
						
						//System.out.println ("dos_final = " + Dossard[0][debut_AD] +" - " +Nom[debut_AD]);
						System.out.println ("pos_final = " + Dossard[1][debut_AD]);
						
						Dossard[0][i] = dos_temp;
						Dossard[1][i] = pos_temp;
						//rang = Dossard[0][(i-1)];
						
						//System.out.println ("Dossard[0][i] = " + Dossard[0][i] +" - " +Nom[rang]);
						System.out.println ("Dossard[1][i] = " + Dossard[1][i]);
						
						System.out.println ("--------");
						for (i=0; i<=(N-1); i++) {
							System.out.print (Dossard[1][i] +"  ");
						}
						System.out.println ("--------");
						for (i=0; i<=(N-1); i++) {
							System.out.print (Dossard[0][i] +"  ");
						}
						System.out.println ("--------");
						
						debut_AD--;
					}					
				}
				
				/* vŽrification */
				System.out.println(N);
				for (i=0 ; i <= (N-1); i++) {
					rang = Dossard[0][i]-1;
					System.out.println (Dossard[0][i] +" // " +Nom[rang] +" -- " +Dossard[1][i]);
				}
				
				System.out.println ("debut_AD =: " +debut_AD);
				
				/* Classement
				for (i=0; i<= (debut_AD-1); i++) {
					for (j=0; i<= (debut_AD-1); i++) {
						if ( (Dossard[1][i]) > Dossard[1][(i+1)] ) {
							pos_temp = Dossard[1][i];
							dos_temp = Dossard[0][i];
							Dossard[1][i] = Dossard[1][(i+1)];
							Dossard[0][i] = Dossard[0][(i+1)];
							Dossard[1][(i+1)] = pos_temp;
							Dossard[0][(i+1)] = dos_temp;
						}
					}
				}*/
				
				} while (fin_course <= N);
				
				/* vŽrification */
				System.out.println(N);
				for (i=0 ; i <= (N-1); i++) {
					dos = Dossard[0][i];
					rang = dos - 1;
					System.out.println (Dossard[0][i]+" - " +dos +" : " +Nom[rang] +" -- " +Dossard[1][i]);
				}
	}

}
