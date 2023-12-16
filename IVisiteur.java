package visitorpackage;

public interface IVisiteur {
	
	// Le type de retour doit être le même que la méthode accepte() dans IAnimal
	// Ici c'est le comportement générique du visiteur si on ne spécifie pas le type
	// 		d'animal ou s'il n'a pas été spécialisé dans le cas d'un objet spéciifique
	
	// Pour l'analogie, c'est le comportement classique du soigneur s'il n'a pas été formé
	//		pour s'occuper d'un koala par exemple
	String visite(IAnimal animal);

	String getNom();
	
	
	// Le soigneur a reçu une formation spécifique pour s'occuper des lions...
	String visite(Lion lion);
	
	// Ou encore des tigres...
	String visite(Tigre tigre);
	
	// Ou bien des pandas
	String visite(Panda panda);
}
