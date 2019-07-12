public class Main {

    public static void main(String[] args) {
                Boss boss = new Boss(200, 50, 0);
                boss.changeBossDefence();
                System.out.println(boss.printInfo());
                MagicDoor magicDoor = new MagicDoor();
                magicDoor.heroes();
    }
}
