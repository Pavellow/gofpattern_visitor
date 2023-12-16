package visitorpackage;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenue au zoo.");
		
		System.out.println("Initialisation d'un soigneur");
		IVisiteur soigneur = new Soigneur("Daniel", 25000);
		
		System.out.println("Initialisation de divers animaux\n");
		IAnimal lion = new Lion("Simba", 10, "Viande de boeuf");
		Panda panda = new Panda("Xiao Ming", 15, "Bambou");
		IAnimal tigre = new Tigre("Tigrou", 25, "Poissons");
		Koala koala = new Koala("Kokoala", 5, "Feuilles");
		
		System.out.println("\n\nLe visiteur va voir les animaux... \n");
		System.out.println(lion.accepte(soigneur));
		System.out.println("Le lion a accepté la visite du soigneur\n");
		System.out.println(panda.accepte(soigneur));
		System.out.println("Le panda a accepté la visite du soigneur\n");
		System.out.println(tigre.accepte(soigneur));
		System.out.println("Le tigre a accepté la visite du soigneur\n");
		System.out.println(koala.accepte(soigneur));
		System.out.println("Le koala a accepté la visite du soigneur\n");
		
		System.out.println("\nLe visiteur a rempli sa mission du coup il démissionne \n");
		soigneur = null;
		System.out.println("Le soigneur a démissionné\n");
		
		System.out.println("Test de la visite d'un soigneur (0 soigneur actuellement)\n");
		
		try {
			System.out.println(panda.accepte(soigneur));
		}
		catch(Exception e) {
			System.out.println("L'animal ne peux pas être visité car aucun soigneur n'a été embauché...\nMalgré le renvoie du soigneur, le tigre fait encore du bruit, peut encore manger ou encore peut faire ce qu'il souhaite");
			System.out.println("Le tigre mange : " + tigre.manger());
			System.out.println("Le koala nous donne son nom (fantaisie, pour l'exemple): " + koala.getNomAnimal());
		}
	}

}
