public class Thing implements SuperHero {

	private String mName;

	public Thing(String name) {
		mName = name;
	}

	public String getName() {
		return mName;
	}
	
	public String getNewIdea() {
		return "";
	}

	public void superPower() {
		System.out.println("pow!");
	}
}