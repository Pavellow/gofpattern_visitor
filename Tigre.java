package visitorpackage;

public class Tigre implements IAnimal {
	
	private String nomAnimal;
	private int age;
	private String typeNourriture;

	Tigre(String nomAnimalParam, int ageParam, String typeNourritureParam) {
		this.nomAnimal = nomAnimalParam;
		this.age = ageParam;
		this.typeNourriture = typeNourritureParam;
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
	
	public String getTypeNourriture() {
		return typeNourriture;
	}

	public void setTypeNourriture(String typeNourriture) {
		this.typeNourriture = typeNourriture;
	}

	@Override
	public String accepte(IVisiteur visiteur) {
		return visiteur.visite(this);
	}
	
	public String faireBruit() {
		return "je suis un tigre rusé";
		
	}
	
	@Override
	public String manger() {
		// TODO Auto-generated method stub
		return this.nomAnimal + " mange";
	}

}
