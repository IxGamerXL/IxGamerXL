public class charData {
	
	public static final name = "GSF";
	
	protected int health = 125;
	protected int maxhealth = health;
	protected int strength = 175;
	
	protected int trueStrength = strength * 15;
	protected int determination = 215;
	protected int creativity = 1 << 31;
	
	private lastMsg = "";
	
	public static void pm(String msg) {
		lastMsg = msg;
		System.out.println("-> " + name + ": " + msg);
	}
	
	private static void reply(String msg) {
		System.out.println("<- " + name + ": " + msg);
	}
	
	// Not all data is visible to you... yet.
	
}
