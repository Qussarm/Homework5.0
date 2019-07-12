
import java.util.Random;




public class Boss {

    private int health;

    private int skill;

    private int hitType;



    public Boss(int health, int attackPower, int hitType) {

        this.setHealth(health);

        this.setSkill(attackPower);

        this.setHitType(hitType);

    }

    public void changeBossDefence() {

        Random r = new Random();

        int randomNum = r.nextInt(4) + 1;

        setHitType(randomNum);



    }

    public String printInfo() {

        return "Boss:"+ getHealth() + " " + getSkill() + " " +

                getHitType() + " ";

    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public int getHitType() {
        return hitType;
    }

    public void setHitType(int hitType) {
        this.hitType = hitType;
    }
}