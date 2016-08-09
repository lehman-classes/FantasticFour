import java.io.FileOutputStream;
public class FantasticFour<E extends SuperHero> {

	private E[] mHeroes;

	public void addAll(E[] heroes) {
		mHeroes = heroes;
	}

	public int howManyHeroes() {
		return mHeroes.length;
	}

	public String getIdea(E obj) {
		return obj.getNewIdea();
	}

	private void countdown(int count) {
		if(count == 0) {
			System.out.println("Go super hero");
		} else {
			System.out.print(" " + count + " ");
			count--;
			countdown(count);
			System.out.println(" What's left... count = " + count);
		}
	}

	public void defend(E hero) throws SuperPowerException {
		countdown(3);
		hero.superPower();
		// if (hero instanceOf HumanTorch) {
			throw new SuperPowerException("An error happened");
		// }
	}

	public void displaySortedHeroes() {
		String out = "[ ";
		for (int i=0; i < mHeroes.length; i++) {
			out += mHeroes[i].getName() + ", ";
		}
		System.out.println(out.substring(0, out.length()-2) + " ]");
	}

	public void saveHeroesToFile(String fileName) {

		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(fileName);
			for (int i = 0; i < mHeroes.length; i++) {
				String name = mHeroes[i].getName();	
				fos.write((name + "\n").getBytes());
			}
		} catch(Exception e) {
			System.out.println("Some error");
		} finally {
			try {
				fos.close();
			} catch(Exception e) {
				// ignore
			}
		}
	}

	public void sort() {

		for (int x=0; x < mHeroes.length; x++) {
			E current = mHeroes[x];
			String currentName = current.getName().toLowerCase();
			for (int y = x+1; y < mHeroes.length; y++) {
				E next = mHeroes[y];
				String nextName = next.getName().toLowerCase();
				if (currentName.compareTo(nextName) > 0) {
					mHeroes[x] = next;
					mHeroes[y] = current;
					current = next;
				}
			}
		}
	}
}








