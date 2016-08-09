public class MisterFantastic implements SuperHero {

	private String mNewIdea = "Nothing yet";

	private String mName;

	public MisterFantastic(String name) {
		mName = name;
	}

	public String getName() {
		return mName;
	}

	public void setNewIdea(String idea) {
		mNewIdea = idea;
	}

	public String getNewIdea() {
		return mNewIdea;
	}

	public void superPower() {
		System.out.println("stretch");
	}
}