public class homework {
    public static void main(String[] args) {
        Boss boss = new Boss();

        boss.setHealth(1000);
        boss.setDamage(150);
        boss.setTypeOfDefence("Physical");

        System.out.println("HEALTH: " + boss.getHealth() +
                " | DAMAGE: " + boss.getDamage() +
                " | TYPE of DEFENCE: " + boss.getTypeOfDefence());

        Hero[] heroes = createHeroes();
        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth());
            System.out.println("Damage: " + hero.getDamage());
            System.out.println("Superpower: " + (hero.getSuperpower() != null ? hero.getSuperpower() : "None"));
            System.out.println("-_-_-_-_-_-");
        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(250, 30, "Invisibility");
        Hero hero2 = new Hero(300, 25); // без суперсилы
        Hero hero3 = new Hero(200, 35, "Flight");

        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;
    }

}