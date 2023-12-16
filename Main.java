package visitorpackage;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Bienvenue au zoo.");
		
		System.out.println("Initialisation d'un soigneur");
		IVisiteur soigneur = new Soigneur("Daniel", 25000);
		
		System.out.println("Initialisation de divers animaux");
		IAnimal lion = new Lion("Simba", 10, "Viande de boeuf");
		IAnimal panda = new Panda("Xiao Ming", 15, "Bambou");
		IAnimal tigre = new Tigre("Tigrou", 25, "Poissons");
		
		System.out.println(panda.accepte(soigneur));
		
		System.out.println("Le soigneur se fait renvoyer... \n");
		soigneur = null;
		
		System.out.println("Le lion est triste : " + lion.faireBruit());
		System.out.println("Panda : " + panda.faireBruit());
		System.out.println("\nTest de la fonction accepte d'un des animaux (soigneur = null)");
		
		try {
			System.out.println(panda.accepte(soigneur));
		}
		catch(Exception e) {
			System.out.println("L'animal ne peux pas être visité car aucun soigneur n'a été embauché");
		}
	}

}
