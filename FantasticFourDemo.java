public class FantasticFourDemo {

	public static void main(String[] args) {
		
		FantasticFour<SuperHero> fantasticFour = new FantasticFour<>();

		MisterFantastic reed = new MisterFantastic("Reed Richards");
		InvisibleWoman susan = new InvisibleWoman("Susan Storm");
		HumanTorch johnny = new HumanTorch("Johnny Storm");
		Thing ben = new Thing("Ben Grimm");

		SuperHero[] superHeroes = {reed, susan, johnny, ben};
		fantasticFour.addAll(superHeroes);

		fantasticFour.displaySortedHeroes();
		fantasticFour.sort();
		// prints out
		// [ Ben Grimm, Johnny Storm, Reed Richards, Susan Storm ]
		fantasticFour.displaySortedHeroes();

		int count = fantasticFour.howManyHeroes();
		System.out.println("There are " + count + " super heroes");

		reed.setNewIdea("evolution can be triggered by clouds of cosmic energy");

		// prints out 
		// evolution can be triggered by clouds of cosmic energy
		String idea = fantasticFour.getIdea(reed);	
		System.out.println(idea);

		Villain doctorDoom = new Doom();
		// prints out
		// attacking: Reed Richards
		doctorDoom.attack(reed);
		//attacking: Susan Storm
		doctorDoom.attack(susan);

		try {
			fantasticFour.defend(reed);
			fantasticFour.defend(susan);
			fantasticFour.defend(johnny);
		} catch(SuperPowerException spe) {
			System.out.println(spe.getMessage());
		}

		fantasticFour.saveHeroesToFile("heroes.txt");

	}
}