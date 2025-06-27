public class Boss {
    private int health;
    private int damage;
    private String typeOfDefence;
    

    public int getHealth() {return this.health;}
    public int getDamage() {return this.damage;}
    public String getTypeOfDefence() {return this.typeOfDefence;}

    public void setHealth(int health) {
        if (health < 0 ) {
            System.out.println("Wrong indicator");
        } else { this.health = health;
        }
    }
    public void setDamage(int damage) {
        if (damage < 0 ) {
            System.out.println("Wrong indicator");
        } else { this.damage = damage;
        }
    }
    public void setTypeOfDefence(String typeOfDefence) {

    }


}
