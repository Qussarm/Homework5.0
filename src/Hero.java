public class Hero {
    private int health;
    private int skill;
    private int hitType;

    public Hero(int health, int skill, int hits) {

        this.health = health;

        this.skill = skill;

        hitType = hits;



    }
    public String printInfo() {
        return "Hero:" + getHealth() + " " + getSkill() + " " +
                getHitType() + " ";
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSkill() {
        return this.skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public int getHitType() {
        return this.hitType;
    }

    public void setHitType(int hitType) {
        this.hitType = hitType;
    }

    public int getHealth() {
        return health;
    }


}
