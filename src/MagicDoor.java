public class MagicDoor {

    public Hero[] heroes() {

        Hero[] heroesArr = new Hero[4];
        Hero warrior = new Hero(200, 20, 1);
        heroesArr[0] = warrior;
        Hero magic = new Hero(220, 15, 2);
        heroesArr[1] = magic;
        Hero kinetic = new Hero(220, 25, 3);
        heroesArr[2] = kinetic;
        Hero healer = new Hero(220, 0, 4);
        heroesArr[3] = healer;
        return heroesArr;

    }

}