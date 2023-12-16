package visitorpackage;

public class Panda implements IAnimal {
	
	private String nomAnimal;
	private int age;
	
	Panda(String nomAnimalParam, int ageParam) {
		this.nomAnimal = nomAnimalParam;
		this.age = ageParam;
		System.out.println(this.toString());
	}	
	
	public String toString() {
		return "Lion " + this.getNomAnimal() + " agé de " + this.getAge() + " ans" + "\n";
	}

	public String getNomAnimal() {
		return nomAnimal;
	}

	public void setNomAnimal(String nomAnimal) {
		this.nomAnimal = nomAnimal;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String accepte(IVisiteur visiteur) {
		return visiteur.visite(this);
	}
	
	public String faireBruit() {
		return "PandaPandaPandaPanda";
		
	}

}
