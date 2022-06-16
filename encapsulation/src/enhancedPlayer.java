public class enhancedPlayer {
    private String name;
    private int hitPoints;
    private String weapon;

    public enhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health>0 && health <=100){
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.hitPoints = this.hitPoints - damage;
        if (this.hitPoints <= 0) {
            System.out.println("Player dead");
        }
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
