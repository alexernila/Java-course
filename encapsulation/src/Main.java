public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "sword";
//
//        int damage = 11;
//        player.loseHealth(damage);
//        System.out.println(player.healthRemainiing());
//
//        damage = 9;
//        player.loseHealth(damage);
//        player.healthRemainiing();

        enhancedPlayer player = new enhancedPlayer("Tim", 88, "sword");
        System.out.println("Initial health is " + player.getHitPoints());
    }
}
