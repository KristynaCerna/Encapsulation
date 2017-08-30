
public class GameMain {

	public static void main(String[] args) {
		
		
		
		/*Player player = new Player();
		player.name = "Jan";
		player.health = 20;
		player.weapon = "sword";
		
		int damage = 20;
		player.loseHealth(damage);
		System.out.println("Remaining health = " + player.healthRemaining());*/
		
		EnhancedPlayer player = new EnhancedPlayer("Kristty", 300, "bow");
		System.out.println("Initial health = " + player.getHealth());

		int damage = 20;
		player.loseHealth(damage);
		System.out.println("Remaining health = " + player.getHealth());
		
		damage = 90;
		player.loseHealth(damage);
		System.out.println("Remaining health = " + player.getHealth());

	}
}
