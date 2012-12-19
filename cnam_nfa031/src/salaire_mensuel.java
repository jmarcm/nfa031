
public class salaire_mensuel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Déclarations
		int jours;
		double ind, benef, bonus, salaire;
		
		// Début
		System.out.print("Donnez le nombre de jours travaillés : ");
		jours = Lire.i();
		System.out.print("Donnez l'indemnité journalière : ");
		ind = Lire.d();
		System.out.print("Donnez le bénéfice mensuel : ");
		benef = Lire.d();
		
		salaire = jours*ind;
		bonus = 0.5*benef/100;
		salaire = salaire + bonus;
		
		System.out.print("Le salaire de l'employé est de : " +salaire);
		

	}

}
