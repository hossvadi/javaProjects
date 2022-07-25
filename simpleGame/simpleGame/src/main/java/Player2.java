public class Player2 extends Player1 {
    private int health;
    private final boolean armour;

    public Player2(String name, String weapon, int health, boolean armour) {
        super(name, weapon, health);
        this.health = health;
        this.armour = armour;
    }

    @Override
    public void damageByGun1() {
        if (armour) {
            this.health -= 20;
            if(this.health <=0) this.health =0;
            System.out.println("Armour is on, Got hit by Gun 1. the health reduced by 20. " +
                    "Current health is " + this.health + ".");
        } if (!armour) {
            this.health -= 30;
            if(this.health <=0) this.health =0;
            System.out.println("Armour is off, Got hit by Gun 1. the health reduced by 30. " +
                    "Current health is " + this.health + ".");
        }
        if (this.health == 0) {
            System.out.println(getName() + " is dead!");
        }
    }

    @Override
    public void damageByGun2() {
        if (armour) {
            this.health -= 40;
            if(this.health <=0) this.health =0;
            System.out.println("Armour is on, Got hit by Gun 1. the health reduced by 40. " +
                    "Current health is" + this.health);
        } if (!armour) {
            this.health -= 50;
            if(this.health <=0) this.health =0;
            System.out.println("Armour is off, Got hit by Gun 1. the health reduced by 50." +
                    "Current health is" + this.health);
        }
        if (this.health == 0) {
            System.out.println(getName() + " is dead!");
        }
    }

    @Override
    public void heal() {
        super.heal();
    }
}
