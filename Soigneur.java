package visitorpackage;

public class Soigneur implements IVisiteur {
	
	private String nom;
	private int salaire;
	
	Soigneur(String nomParam, int salaireParam) {
		this.nom = nomParam;
		this.salaire = salaireParam;
		System.out.println(this.toString());
	}
	
	public String toString() {
		return "Bonjour je suis " + this.getNom() + " et je suis payé " + this.getSalaire() + "\n";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getSalaire() {
		return salaire;
	}

	public void setSalaire(int salaire) {
		this.salaire = salaire;
	}

	@Override
	public String visite(IAnimal animal) {
		return("Le soigneur visite l'animal mais il n'est pas spécialisé pour celui-ci...." +
				"\n\t" + animal.getNomAnimal() + " fait un bruit : " 
				+ animal.faireBruit() + "\n" +
				"\tLe soigneur nourrit l'animal avec " +
				animal.getTypeNourriture() + "\n" +
				"\t" + animal.manger() + "\n" +
				"\t" + animal.getNomAnimal() + " apprécie");
	}
	
	@Override
	public String visite(Lion lion) {
		return this.getNom() + " visite " + lion.getNomAnimal() + " grace à sa spécialisation en lion";
	}
	
	@Override
	public String visite(Tigre tigre) {
		return this.getNom() + " visite " + tigre.getNomAnimal() + " grace à sa spécialisation en tigre";
	}
	
	@Override
	public String visite(Panda panda) {
		return this.getNom() + " visite " + panda.getNomAnimal() + " grace à sa spécialisation en panda";
	}

}
