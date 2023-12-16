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
		return("Le soigneur a visité l'animal " + animal.getNomAnimal() + "\nL'animal fait un bruit : " + animal.faireBruit());
	}

}
