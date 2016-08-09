public class InvisibleWoman implements SuperHero {
	
	private String mName;

	public InvisibleWoman(String name) {
		mName = name;
	}

	public String getName() {
		return mName;
	}

	public String getNewIdea() {
		return "";
	}

	public void superPower() {
		System.out.println("now you see me; now you don't");
	}
}