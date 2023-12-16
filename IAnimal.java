package visitorpackage;

public interface IAnimal {
	
	
	// Bien veiller que le type de retour soit le même que la méthode visite de IVisiteur
	String accepte(IVisiteur visiteur);
	String faireBruit();

	String getNomAnimal();
	int getAge();
}
