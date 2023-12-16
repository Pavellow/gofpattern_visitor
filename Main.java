package visitorpackage;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bienvenue au zoo.");
		
		System.out.println("Initialisation d'un soigneur");
		IVisiteur soigneur = new Soigneur("Daniel", 25000);
		
		System.out.println("Initialisation de divers animaux");
		IAnimal lion = new Lion("Simba", 10);
		IAnimal panda = new Panda("Xiao Ming", 15);
		IAnimal tigre = new Tigre("Tigrou", 25);
		
		System.out.println(lion.accepte(soigneur));
	}

}
