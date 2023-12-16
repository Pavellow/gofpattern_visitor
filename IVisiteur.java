package visitorpackage;

public interface IVisiteur {
	
	// Le type de retour doit être le même que la méthode accepte() dans IAnimal
	String visite(IAnimal animal);

	String getNom();
}
