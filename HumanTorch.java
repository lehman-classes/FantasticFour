public class HumanTorch implements SuperHero {

	private String mName;

	public HumanTorch(String name) {
		mName = name;
	}

	public String getName() {
		return mName;
	}

	public String getNewIdea() {
		return "";
	}

	public void superPower() {
		System.out.println("fire");
	}
}