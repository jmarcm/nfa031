
public class salaire_mensuel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// D�clarations
		int jours;
		double ind, benef, bonus, salaire;
		
		// D�but
		System.out.print("Donnez le nombre de jours travaill�s : ");
		jours = Lire.i();
		System.out.print("Donnez l'indemnit� journali�re : ");
		ind = Lire.d();
		System.out.print("Donnez le b�n�fice mensuel : ");
		benef = Lire.d();
		
		salaire = jours*ind;
		bonus = 0.5*benef/100;
		salaire = salaire + bonus;
		
		System.out.print("Le salaire de l'employ� est de : " +salaire);
		

	}

}
